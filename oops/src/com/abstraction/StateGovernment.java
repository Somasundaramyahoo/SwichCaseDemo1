package com.abstraction;

public abstract class StateGovernment implements CentralGovernment {
	public String typeOfGovernment(){
		return "it is Parliament";
	}
	public String headQuarters(String location){
		return location;
	}
	public abstract int  noOfMla(int mla);
	public abstract String rulingParty(String party);
}
