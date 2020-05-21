package herencia;

public abstract class comidas {
	abstract public void animal();
	protected String comida;
	protected String bebida;
	protected String postre;
	public comidas(String comida, String bebida, String postre) {
		this.comida = comida;
		this.bebida = bebida;
		this.postre = postre;
	}
	public void comentario1() {
		System.out.print("Me gusta: ");
	}
	

}
