package models;

public class Vehiculo {
	private ColorEnum color;
	private String ref;
	private int velocidadMaxima;

	public Vehiculo(ColorEnum color, String ref, int velocidadMaxima) {
		super();
		this.color = color;
		this.ref = ref;
		this.velocidadMaxima = velocidadMaxima;
	}

	public ColorEnum getColor() {
		return color;
	}

	public String getRef() {
		return ref;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
