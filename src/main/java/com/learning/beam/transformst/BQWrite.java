package com.learning.beam.transformst;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.generic.GenericData;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificRecord;
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO;
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO.Write.CreateDisposition;
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO.Write.WriteDisposition;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;

import com.google.api.services.bigquery.model.TableRow;
import com.learning.beam.model.Car;

public class BQWrite {

	private static final String tableSpec = "user-project-265117:mybqdataset.avro_load";

	public static <T> void write(PCollection<T> ip) {

		PCollection<TableRow> rows = ip.apply("Create TableRow", ParDo.of(new DoFn<T, TableRow>() {

			@ProcessElement
			public void process(@Element T r, OutputReceiver<TableRow> e) {
				SpecificRecord a = null;
				if (r instanceof SpecificRecord)
					a = (SpecificRecord) r;
				Schema s = a.getSchema();
				TableRow row = new TableRow();
				for (Field f : s.getFields()) {
					row.set(f.name(), a.get(f.pos()));
				}
				e.output(row);
			}

		}));

		rows.apply(BigQueryIO.writeTableRows().to(tableSpec).withCreateDisposition(CreateDisposition.CREATE_NEVER)
				.withWriteDisposition(WriteDisposition.WRITE_TRUNCATE));
	}

}
