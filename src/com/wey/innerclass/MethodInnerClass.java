package com.wey.innerclass;

public class MethodInnerClass {
	
	public Destination getDestination(String s){
		class PDestination implements Destination {
			private String label;
			
			private PDestination(String whereTo){
				this.label = whereTo;
			}
		}
		return new PDestination(s);
	}
	
	class ODestination implements Destination {
		private String label;
		private ODestination(String s){
			this.label = s;
		}
	}
	
	public Destination getODestination(){
		return new ODestination("");
	}
}
