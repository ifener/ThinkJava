package com.wey.stringbuilder;

public class Builder {
	
	public Builder(){}
	
	public Builder(String name){
		this.name = name;
	}
	
	private String name;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		
		return this.name.concat( "--"+ super.toString());
	}
	
	

}
