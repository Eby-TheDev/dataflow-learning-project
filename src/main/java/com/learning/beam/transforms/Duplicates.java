package com.learning.beam.transforms;

import org.apache.beam.sdk.transforms.GroupByKey;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.PCollectionList;
import org.apache.beam.sdk.values.PCollectionTuple;
import org.apache.beam.sdk.values.TupleTag;
import org.apache.beam.sdk.values.TupleTagList;

import com.learning.beam.model.Car;

public class Duplicates extends PTransform<PCollection<Car>,PCollectionList<Car>> {
	
	@Override
	public PCollectionList<Car> expand(PCollection<Car> cars) {
		final TupleTag<Car> distinct=new TupleTag<Car>() {};
		final TupleTag<Car> dup=new TupleTag<Car>() {};
		
		PCollectionTuple result=cars.apply("pre-distinct",MapElements.via(new PreDup()))
											.apply(GroupByKey.<Car,Car>create())
											.apply(ParDo.of(new PostDup(distinct,dup)).withOutputTags(distinct, TupleTagList.of(dup)));
		PCollection<Car> dist=result.get(distinct);
		PCollection<Car> dp=result.get(dup);
		return PCollectionList.<Car>of(dist).and(dp);
	}

}
