package org.protor.sandbox.riccio.basic;

public abstract class AbstractA {

	protected int i;          //è la parola chiave per le variabili private che devono essere superclassi di altre derivate (figlie)
	protected boolean b;     // protected vuol dire che b è nascosto all'utente ma non alle sottoclassi (incapsulamento).
	                          //Sono privati ma non per le sottoclassi.

	// costruttore

	public  AbstractA() {   // il costruttore ha il nome della classe
		System.out.println("Abstract A >> constructor with no fields");
		initialize();

	}




	public AbstractA(int i, boolean b) {
		System.out.println("AbstractA >> constructor with fields");

		this.i = i;
		this.b = b;
	}

	private void initialize() {  // se è private la si può chiamare solo in A e non nelle figlie, se protected anche in B possono usarlo
		System.out.println("Abstract A>> initialize");
		this.i=0;
		this.b =false;
	}


	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}



	@Override
	public String toString() {
		return "AbstractA [i=" + i + ", b=" + b + "]";
	} 



}
