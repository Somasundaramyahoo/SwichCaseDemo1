package com.abstraction;

public abstract class Ac implements Electronics{
	public String onOrOff(boolean isOn){
		if(isOn==true){
			return "electronic is on";
		}
		else{
			return "electronic is off";
		}
	}
	public String electronics(String elec){
		String[] ss={"ac","washing machine"};
		for(String x:ss){
		if(elec.equalsIgnoreCase(x)){
			return "it is home appliances";
		}
		else{
			return " w";
		}
		}
		if(elec.equalsIgnoreCase("calculaters")||elec.equalsIgnoreCase("computers")){
			return "it is office appliances";
		}
		else{
			return "out side appliances";
		}
	}
	public abstract String calculateTemp(int temp);
	public abstract String maintainence(boolean isInventor);
}
