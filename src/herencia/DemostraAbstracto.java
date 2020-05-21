package herencia;

 public class DemostraAbstracto extends heredado1 {
private String animal;

public DemostraAbstracto(String comida, String bebida, String postre, String nombre, String animal) {
	super(comida, bebida, postre, nombre);
	this.animal = animal;
}
public void animal() {
	System.out.println("............................................................");
	System.out.println("abstraccion sobreescrita");
	super.mascota();
	System.out.println("De preferencia un perro que se llame " + animal);
}
@Override
public void mascota() {
	System.out.println("pero no tengo una casa tan grande");
}

}
