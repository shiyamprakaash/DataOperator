package asfa.cdc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {
	public static void main (String [] args) {
		
		int []a=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		a[5]=5;
		int length = a.length;
		System.out.println(length);
		for (int i=0;i<a.length;i++) {
			System.out.println(i);
		}
		
		
		List <Integer>l=new ArrayList();
		l.add(700);
		l.add(500);
		l.add(800);
		l.add(400);
		Collections.sort(l);
		//Collections.reverse(l);
		System.out.println(l);
	int s=l.size();
	System.out.println(s);
}}