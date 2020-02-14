package programacion;

import java.util.Scanner;

public class Cuenta {
	private  int numcuenta;
	private int saldo;
	
	public Cuenta() {
		this.numcuenta=0;
		this.saldo=0;
	}
	public Cuenta(int numcuenta, int saldo) {
		this.numcuenta=numcuenta;
		this.saldo=saldo;
	}
	public int getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(int numcuenta) {
		this.numcuenta = numcuenta;
	}
	public int getSaldo() {
		
			return saldo;
		}
		
	
	public void setSaldo(int s) {
		if(s<0) {
			System.out.println("El saldo no puede ser menos que 0");
		}else
			saldo=s;
	}
	private int retiro(int cantidad) {
		this.saldo=getSaldo()-cantidad;
		return saldo;
		
	}
	private int deposito(int cantidad) {
		saldo=getSaldo()+cantidad;
		return saldo;
		
	}
	public void transaccionBancaria() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el tipo de transaccion(retiro o deposito): ");
		String tipo=entrada.next();
		System.out.println("Introduce la cantidad:");
		int cant=entrada.nextInt();
	

		
			if(tipo.equalsIgnoreCase("retiro")) {
				if(cant<=getSaldo()) {
					System.out.println("===RETIRO===");
					retiro(cant);
					System.out.println("Tu saldo se ha quedado con "+getSaldo());
				}else {
					System.out.println("No puedes quitar más dinero del que tienes.");
				}
				
		
		}else if(tipo.equalsIgnoreCase("deposito")) {
			System.out.println("===DEPOSITO===");
			deposito(cant);
			System.out.println("Tu saldo se ha quedado con "+getSaldo());
		}
	}
	
	
}
