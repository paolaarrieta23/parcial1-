package models;

import java.util.Scanner;

public class Manager {

	private Vehiculo[] vehiculos;
	private Scanner scanner;
	private boolean exitToPrincipalMenu;
	private boolean exitMenuVehicle;
	private int positionAdd;

	public Manager() {
		this.vehiculos = new Vehiculo[10];
		scanner = new Scanner(System.in);
		exitToPrincipalMenu = false;
		exitMenuVehicle = false;
		positionAdd = 0;
	}

	private void AddData(Vehiculo vehiculo) {
		vehiculos[positionAdd] = vehiculo;
		positionAdd++;
	}

	private void showGaraje() {
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i] != null) {
				System.out.println((i + 1) + " " + vehiculos[i].toString());
			}
		}
	}

	public void menuPrincipal() {
		while (!exitToPrincipalMenu) {
			System.out
					.println("Bienvenido \n Dijita una opcion:  \n 1.Agregar vehiculo \n 2.mostrar garaje \n 3.salir");
			int op = scanner.nextInt();
			switch (op) {
				case 1:
					if (positionAdd < 10) {
						System.out.println("entro aca");
						menuVehiculo();
					} else {
						System.out.println("El garaje esta lleno");
					}
					break;
				case 2:
					showGaraje();
					break;
				case 3:
					System.out.println("hasta pronto");
					exitToPrincipalMenu = true;
					break;
			}
		}
	}

	private void menuVehiculo() {
		System.out.println("holiwi");
		while (!exitMenuVehicle) {
			System.out.println("Menu registrar vehiculo");
			System.out.println("a.- avion");
			System.out.println("b.- yate");
			System.out.println("c.- carro");
			System.out.println("d.- salir");

			String opciones2 = scanner.next();

			switch (opciones2) {
				case "a":
					System.out.println("Escojer color");
					ColorEnum colorEnumAvion = menuColor();
					System.out.println("referencia");
					String referenciaAvion = scanner.nextLine();
					System.out.println("velocidad maxima");
					int velMaximaAvion = scanner.nextInt();
					System.out.println("altura maxima");
					int alturaMaxima = scanner.nextInt();
					AddData(new Avion(colorEnumAvion, referenciaAvion, velMaximaAvion, alturaMaxima));
					break;
				case "b":
					System.out.println("Escojer color");
					ColorEnum colorEnumYate = menuColor();
					System.out.println("referencia");
					String referenciaYate = scanner.nextLine();
					System.out.println("velocidad maxima");
					int velMaximaYate = scanner.nextInt();
					System.out.println("peso");
					int peso = scanner.nextInt();
					AddData(new Carro(colorEnumYate, referenciaYate, velMaximaYate, peso));
					break;

				case "c":
					System.out.println("Escojer color");
					ColorEnum colorEnum = menuColor();
					System.out.println("referencia");
					String referencia = scanner.nextLine();
					System.out.println("velocidad maxima");
					int velMaxima = scanner.nextInt();
					System.out.println("cantidad de puertas ");
					int puertas = scanner.nextInt();
					AddData(new Carro(colorEnum, referencia, velMaxima, puertas));
					break;

				case "d":
					menuPrincipal();
					exitMenuVehicle = true;
					break;
			}
		}
	}

	private ColorEnum menuColor() {

		System.out.println("Menu Color");
		System.out.println("1.- Azul");
		System.out.println("2.- Blanco");
		System.out.println("3.- Gris");
		System.out.println("4.- Negro");
		System.out.println("5.- Verde");

		ColorEnum colorEnum = null;
		int op = scanner.nextInt();
		scanner.nextLine();
		switch (op) {
			case 1:
				colorEnum = ColorEnum.AZUL;
				break;
			case 2:
				colorEnum = ColorEnum.BLANCO;
				break;
			case 3:
				colorEnum = ColorEnum.GRIS;
				break;
			case 4:
				colorEnum = ColorEnum.NEGRO;
				break;
			case 5:
				colorEnum = ColorEnum.VERDE;
				break;
		}

		return colorEnum;
	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.menuPrincipal();
	}
}
