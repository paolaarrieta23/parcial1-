package models;

public class Carro extends Vehiculo {

	private int puertas;
	public static String tipo = "Carro";

	public Carro(ColorEnum color, String ref, int velocidadMaxima, int puertas) {
		super(color, ref, velocidadMaxima);
		this.puertas = puertas;

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

	public int getPuertas() {
		return puertas;
	}

	@Override
	public String toString() {
		return tipo + "\n Color: " + getColor().name() + "| Referencia: " + getRef() + "| Velocidad Maxima "
				+ getVelocidadMaxima() + "|  Numero de puertas: " + getPuertas();
	}
}
