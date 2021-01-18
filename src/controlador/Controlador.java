package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelLogging cpl;
	private ControladorPanelRegister cpr;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.cpl = new ControladorPanelLogging(this.modelo, this.vista, this);
		this.cpr = new ControladorPanelRegister(this.modelo, this.vista, this);
		this.navegarPanelLogging();
	}
	
	public void navegarPanelLogging() {
		System.out.println("Navegar panel Logging");
		this.cpl.mostrarPanelLogging();
	}
	
	public void navegarPanelRegister() {
		System.out.println("Navegar panel Register");
		this.cpr.mostrarPanelRegister();
	}
}
