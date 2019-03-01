package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AUConstants {
	
	public final static String AUS = "AU";
	
	// 51 states
	public final static Map<String, String> mapAUSstates = new HashMap<String, String>() {
		{
			put("NSW", "New South Wales");
			put("VIC", "Victoria");
			put("TAS", "Tasmania");
			put("WA", "Western Australia");
			put("SA", "South Australia");
			put("QLD", "Queensland");
		}
	};
	public final static List<String> listOfStatesCode = new ArrayList<>(mapAUSstates.keySet());
	public final static List<String> listOfStatesName = new ArrayList<>(mapAUSstates.values());

}
