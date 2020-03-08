package com.learning.beam.transforms;

import org.apache.beam.sdk.transforms.SimpleFunction;
import org.apache.beam.sdk.values.KV;

import com.learning.beam.model.Car;

public class PreDup extends SimpleFunction<Car, KV<Car,Car>> {

	@Override
	public KV<Car, Car> apply(Car input) {
		return KV.<Car, Car>of(input,input);
	}

}
