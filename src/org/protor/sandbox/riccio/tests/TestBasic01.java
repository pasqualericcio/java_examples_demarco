package org.protor.sandbox.riccio.tests;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.protor.sandbox.riccio.basic.A;
import org.protor.sandbox.riccio.basic.B;

public class TestBasic01 {

	public static void main(String[] args) {
		A a1 =new A(1,-0.5,"Oggetto A1");
//		a1.setI(1);
//		a1.setD(-0.5);
//		a1.setS("Oggetto A1");
		
		A a2 = new A (2, 3.1415, "Oggetto A2");
		
		
		B b1 = new B();
		System.out.println(b1);
		
		b1.setSa(new String[] {"de!", "si", "Pre"});
		System.out.println(b1);
		
		String[] s1a = Arrays.copyOf(b1.getSa(), b1.getSa().length+1);
		
		// concatenate two arrays
		String[] s1b = ArrayUtils.addAll(s1, s1a);
		System.out.println("-------------");//needs apache common lang
		for (String s: s1b)
			System.out.println(s);
		
//		b1.getSa()[0] = "AAAAAA";
//		System.out.println(b1);
		
		

		
	}

}
