package com.sampler.common;

public class SampleInfo extends SampleBase{

	private final String name;
	private final Class<? extends SampleBase> clazz;
	
	public SampleInfo(Class<? extends SampleBase> clazz){
		this.clazz = clazz;
		name = clazz.getSimpleName();
	}

	public String getName() {
		return name;
	}

	public Class<? extends SampleBase> getClazz() {
		return clazz;
	}
	
}
