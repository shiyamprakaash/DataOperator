package asfa.cdc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringPractice {

		
		public static void main (String[] args) {
			
			String sc="Shiyam is a Winner";
			
			int count = sc.length();
			
			Map <Integer, String> mp = new LinkedHashMap<>();
			String[] s=sc.split("");
			mp.put(1, sc);
			System.out.println(count);
			}
		}

	

