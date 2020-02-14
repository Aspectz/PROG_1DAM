package programacion;

import java.util.*;

public class Cuenta {
	Scanner entrada=new Scanner(System.in);
	private int idcuenta;
	private double saldo;
	private int clave;
	private String estado;
	
	public Cuenta() {
		this.idcuenta=0;
		this.saldo=0;
		this.clave=0;
		this.estado="";
	}
	public Cuenta(int idcuenta,double saldo, int clave,String estado) {
		this.idcuenta=idcuenta;
		this.saldo=saldo;
		this.clave=clave;
		this.estado=estado;
	}
	public int getIdcuenta() {
		return idcuenta;
	}
	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public boolean isCerrada() {
		if(this.estado.equals("cerrada")) {
			return true;
		}else
			return false;
		
	}
	public boolean isAbierta() {
		if(this.estado.equals("abierta")) {
			return true;
		}return false;
	}
	public boolean isBloqueada() {
		if(this.estado.equals("bloqueada")) {
			return true;
		}return false;
	}
	public boolean abre(int clave) {
		int fallo=0;
		int claveintroducida;
		if(!isAbierta()) {
			if(!isBloqueada()) {
				System.out.println("Introduce una clave: ");
				claveintroducida=entrada.nextInt();
				if(this.clave!=claveintroducida) {
					do {
						System.out.println("introduce la clave correta porfavor: ");
						claveintroducida=entrada.nextInt();
						fallo++;
						int restantes=3-fallo;
						System.out.println("Clave incorrecta,te quedan "+restantes+" intentos.");
						
						if(fallo==3) {
							System.out.println("Cuenta bloqueada.");
							this.estado="bloqueada";
						}
					}while(clave!=claveintroducida && fallo<3);
					
					return false;
				}
				if(this.clave==claveintroducida) {
					System.out.println("Cuenta abierta");
					this.estado="abierta";
					return true;
				}
			}else {
				System.out.println("La cuenta esta bloqueada.");
			}return false;
		}else{
			System.out.println("La cuenta ya está abierta!!!");
			return true;
		}
		
	}
	public void cierra() {
		this.estado="cerrada";
		System.out.println("Cuenta cerrada con exito");
	}
	public double sacar(int cant) {
		double saldorest=0;
		if(isAbierta()) {
			if(isBloqueada()) {
				System.out.println("La cuenta está bloqueada.");}
			else if(cant>this.getSaldo()) {
					System.out.println("No tienes suficiente saldo.");
			}else {
					
					saldorest=saldo-cant;
					this.saldo=saldorest;
					System.out.println("Dinero sacado con exito.");
			}

		}else {
			System.out.println("Debes abrir primero la cuenta.");
		}
		return saldorest;
	}
	public double ingresar(int cant) {
		double saldorest=0;
		if(isAbierta()) {
			if(isBloqueada()) {
				System.out.println("Cuenta bloqueada;");
			}else {
				saldorest=saldo+cant;
				this.saldo=saldorest;
				System.out.println("Dinero ingresado correctamente");
			}
		}else
			System.out.println("La cuenta debe estar abierta.");
		return saldorest;
	}
	
	
	
	
}
	
