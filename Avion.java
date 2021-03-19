package models;

public class Avion extends Vehiculo {

	private int altitudMaxima;
	private static String tipo = "Avion";

	public Avion(ColorEnum color, String ref, int velocidadMaxima, int altitudMaxima) {
		super(color, ref, velocidadMaxima);
		this.altitudMaxima = altitudMaxima;
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

	public int getAltitudMaxima() {
		return altitudMaxima;
	}

	@Override
	public String toString() {
		return tipo + "\n Color: " + getColor().name() + "| Referencia: " + getRef() + "| Velocidad Maxima "
				+ getVelocidadMaxima() + "|  Altitud maxima: " + getAltitudMaxima();
	}
}
