package com.abstraction;

public class SonyAc extends Ac{
	public String calculateTemp(int temp){
		if(temp>16&&temp<20){
			return "cold";
		}
		else if(temp>21&&temp<24){
			return "room temprature";
		}
		else if(temp>25&&temp<30){
			return "warm";
		}
		else{
			return "hot";
		}
	}
	public String maintainence(boolean isInventor){
		if(isInventor==true){
			return "1 inventor";
		}
		else{
			return "3 inventors";
		}
	}
}
