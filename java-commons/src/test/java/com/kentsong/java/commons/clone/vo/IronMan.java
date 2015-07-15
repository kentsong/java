package com.kentsong.java.commons.clone.vo;

import java.io.Serializable;

public class IronMan implements Serializable{
	
	public String name;
	public String feature;
	
	public IronMan(){
		name = "IronMan";
		feature= "超高科技次世代機器人";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	

}
