package com.sampler.common;

import com.badlogic.gdx.utils.reflect.ClassReflection;

public class SampleFactory {
	
	public static SampleInfo newSample(String name){
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException("name param is required");
		}
		SampleInfo info = SampleInfos.find(name);
		
		try {
			return ClassReflection.newInstance(info.getClass());
		} catch (Exception e) {
			throw new RuntimeException("can not create sample with name " + name, e);
		}
	}
	
	private SampleFactory(){
		
	}

}
