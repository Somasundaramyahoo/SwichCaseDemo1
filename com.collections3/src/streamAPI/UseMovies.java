package streamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseMovies {
	public static void main(String[] args) {
		Movies m1=new Movies("PS-I","manirathnam","ravi",4.6,2022);
		Movies m2=new Movies("bahubali","rajamouli","prabas",4.5,2017);
		Movies m3=new Movies("kgf2","prasandhneel","yash",4.5,2022);
		Movies m4=new Movies("beast","nelson","thalapathy",4.8,2022);
		Movies m5=new Movies("valimai","vinoth","ajith",2.1,2021);
		/*
		//List<Movies>movies=new ArrayList<Movies>();

		movies.add(new Movies("PS-I","manirathnam","ravi",4.6,2022));
		movies.add(new Movies("bahubali","rajamouli","prabas",4.5,2017));		
		movies.add(new Movies("kgf2","prasandhneel","yash",4.5,2022));
		movies.add(new Movies("beast","nelson","thalapathy",4.8,2022));		
		movies.add(new Movies("valimai","vinoth","ajith",2.1,2021));
		*/
		HashMap<String,Movies>movies=new HashMap<>();
		movies.put(m1.getName(), m1);
		movies.put(m2.getName(), m2);
		movies.put(m3.getName(), m3);
		movies.put(m4.getName(), m4);
		movies.put(m5.getName(), m5);
		
		List<String>mName=movies.values().stream().filter(x->x.getReleace()>=2022).map(x->x.getName()).collect(Collectors.toList());      
		Map<String,Movies>mapRating=movies.values().stream().filter(x->x.getRating()>=4.6).collect(Collectors.toMap(x->x.getName(), y->y));
	
		System.out.println(mName);
		System.out.println(mapRating);
	}
}
