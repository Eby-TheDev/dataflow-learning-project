package com.learning.beam.options;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.PipelineOptions;

public interface CustomOptions extends PipelineOptions {

	@Default.String("gs://samp-cam/input")
	public String getInput();
	public void setInput(String path);
	
	@Default.String("gs://samp-cam/output/op")
	public String getOutput();
	public void setOutput(String path);
	
	@Default.String("gs://samp-cam/outputdup/op")
	public String getOutputDup();
	public void setOutputDup(String path);
	
}
