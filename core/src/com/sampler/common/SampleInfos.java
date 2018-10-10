package com.sampler.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SampleInfos {

	public static final List<SampleInfo> ALL = Arrays.asList(
			
			);
	
	public static List<String> getSampleNames(){
		List<String> ret = new ArrayList<String>();
		for(SampleInfo info : ALL){
			ret.add(info.getName());
		}
		Collections.sort(ret);
		return ret;
	}
	
	public static SampleInfo find(String name){
		if(name == null || name.isEmpty()){
			throw new IllegalArgumentException("name argument is requires:");
		}
		SampleInfo ret = null;
		for(SampleInfo info : ALL){
			if(info.getName() == name){
				ret = info;
				break;
			}
		}
		if(ret == null){
			throw new IllegalArgumentException("Could not find sample with name = : " + name);
		}
		return ret;
	}
	
	private SampleInfos(){
		
	}
}
