package herencia;

public  class heredado1 extends comidas{

private String nombre;
// constructor de comidas
public heredado1(String comida, String bebida, String postre, String nombre) {
	super(comida, bebida, postre);
	this.nombre = nombre;
}
public void ver() {
	System.out.print("Mi nombre es : "+nombre+ " " );
	super.comentario1();
	System.out.println(comida +" con " +bebida+" y de poste "+ postre);
}
public void mascota() {
	System.out.println("Ademas me gustaria tener una mascota: ");
}
@Override
public void animal() {
System.out.println("abstracion de la clase heredado1");
	
}


}
