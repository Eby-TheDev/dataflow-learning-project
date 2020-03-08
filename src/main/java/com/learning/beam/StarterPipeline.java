/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.learning.beam;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.coders.AvroCoder;
import org.apache.beam.sdk.io.AvroIO;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Count;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.Filter;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.PCollectionList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.learning.beam.model.Car;
import com.learning.beam.options.CustomOptions;
import com.learning.beam.transforms.Duplicates;
import com.learning.beam.transforms.ObjectMapper;
import com.learning.beam.transformst.BQWrite;

public class StarterPipeline {
	private static final Logger LOG = LoggerFactory.getLogger(StarterPipeline.class);

	public static void main(String[] args) {
		CustomOptions options = PipelineOptionsFactory.fromArgs(args).withValidation().as(CustomOptions.class);

		runPipeline(options);
	}

	private static void runPipeline(CustomOptions options) {

		Pipeline p = Pipeline.create(options);

		// Reading from the input file
		PCollection<String> lines = p.apply(TextIO.read().from(options.getInput()));

		// Filter out the Header and Unmarshalling the input file into objects
		PCollection<Car> carsObjects = lines.apply("filtering the header", Filter.by(line -> !line.contains("MPG")))
				.apply("Converting to Car objects", ParDo.of(new ObjectMapper())).setCoder(AvroCoder.of(Car.class));

		// seperate duplicate
		PCollectionList<Car> result = carsObjects.apply("find duplicates", new Duplicates());

		// Converting this file into avr and writing it into the output folder

		/*
		 * result.get(0).apply(AvroIO.write(Car.class).to(options.getOutput()).
		 * withSuffix(".avro"));
		 * result.get(1).apply(AvroIO.write(Car.class).to(options.getOutputDup()).
		 * withSuffix(".avro"));
		 */

		BQWrite.write(result.get(0));

		p.run().waitUntilFinish();
	}
}
