package models;

public class Yate extends Vehiculo {

	private int pesoMaximo;
	private static String tipo = "Yate";

	public Yate(ColorEnum color, String ref, int velocidadMaxima, int pesoMaximo) {
		super(color, ref, velocidadMaxima);
		this.pesoMaximo = pesoMaximo;
	}

	@Override
	public ColorEnum getColor() {
		return super.getColor();
	}

	@Override
	public String getRef() {
		return super.getRef();
	}

	@Override
	public int getVelocidadMaxima() {
		return super.getVelocidadMaxima();
	}

	public int getPesoMaximo() {
		return pesoMaximo;
	}

	@Override
	public String toString() {
		return tipo + "\n Color: " + getColor().name() + "| Referencia: " + getRef() + "| Velocidad Maxima "
				+ getVelocidadMaxima() + "|  Peso maximo: " + getPesoMaximo();
	}
}
