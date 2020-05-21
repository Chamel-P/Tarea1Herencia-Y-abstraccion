package principal;

import herencia.DemostraAbstracto;
import herencia.heredado1;

public class principal {

	public static void main(String[] args) {
	heredado1 H = new heredado1("arepas","jugito","quesillo","steve");
	DemostraAbstracto DA = new DemostraAbstracto("arepas","jugito","quesillo","steve", "silvestre");

DA.ver();
H.animal();
DA.animal();
DA.mascota();
	}

}
