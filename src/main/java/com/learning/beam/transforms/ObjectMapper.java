package com.learning.beam.transforms;

import org.apache.beam.sdk.transforms.DoFn;
import org.beanio.StreamFactory;
import org.beanio.Unmarshaller;

import com.learning.beam.model.Car;

public class ObjectMapper extends DoFn<String,Car> {

	private Unmarshaller reader;
	
	@Setup
	public void initialize() {
		StreamFactory factory=StreamFactory.newInstance();
		factory.loadResource("cars_mapper.xml");
		reader=factory.createUnmarshaller("cars");
	}
	
	@ProcessElement
	public void process(@Element String s,OutputReceiver<Car> o) {
		Car car=(Car) reader.unmarshal(s);
		o.output(car);
	}
	
}
