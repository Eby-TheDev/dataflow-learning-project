package com.learning.beam.transforms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.TupleTag;

import com.learning.beam.model.Car;

public class PostDup extends DoFn<KV<Car,Iterable<Car>>,Car> {
	final TupleTag<Car> distinct;
	final TupleTag<Car> dup;
		
	public PostDup(TupleTag<Car> distinct, TupleTag<Car> dup) {
		this.distinct = distinct;
		this.dup = dup;
	}

	@ProcessElement
	public void process(@Element KV<Car,Iterable<Car>> ip,MultiOutputReceiver o) {
		boolean isFirst=true;
		for(Car c:ip.getValue()) {
			if(isFirst) {
				o.get(distinct).output(c);
				isFirst=false;
				continue;
			}
			o.get(dup).output(c);
		}
				
	}

}
