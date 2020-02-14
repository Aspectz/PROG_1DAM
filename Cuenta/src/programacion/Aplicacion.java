package programacion;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		Cuenta cuenta1=new Cuenta();
		Cuenta cuenta2=new Cuenta();
		
		System.out.println("Introduce el numero de la primera cuenta: ");
		int cuenta=entrada.nextInt();
		System.out.println("Introduce el saldo de la primera cuenta de pobre: ");
		int saldo=entrada.nextInt();
		
		cuenta1.setNumcuenta(cuenta);
		cuenta1.setSaldo(saldo);
		cuenta1.transaccionBancaria();
		
		System.out.println("Introduce el numero de la segunda cuenta: ");
		cuenta=entrada.nextInt();
		System.out.println("Introduce el saldo de la segunda cuenta de pobre: ");
		saldo=entrada.nextInt();
		cuenta2.setNumcuenta(cuenta);
		cuenta2.setSaldo(saldo);
		cuenta2.transaccionBancaria();
	}
	

}
