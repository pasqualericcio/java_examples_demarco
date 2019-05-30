package org.protor.sandbox.riccio.basic;

public class A {

	// Se una classe ha gli attributi privati si chiama java Bean e per essere bean Ci vogliono i setter e i getter
	private int i;
	private double d;
	private String s;


	public A(int i, double d, String s) {
		super(); // ci può anche non stare
		this.i = i;
		this.d = d;
		this.s = s;
	}

public A() {
	initialize();

}
	private void initialize() {
		this.i=0;
		this.d=0.0;
		this.s="Preside!";
		
	}
	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public double getD() {
		return d;
	}


	public void setD(double d) {
		this.d = d;
	}


	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", d=" + d + ", s=" + s + "]";
	}

}
