package programacion;
import java.io.IOException;
import java.util.*;
import java.math.*;
public class Aplicacion {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Cliente> lista=new ArrayList<Cliente>();
		ArrayList<Cuenta> listacuentas=new ArrayList<Cuenta>();
		int op=0;
		do {
			
			verMenu();
			try {
				System.out.println("Introduce una opcion: ");
				op=Integer.parseInt(entrada.nextLine());
				
			}catch (Exception e) {
				System.out.println("Opcion no valida");
			}
				
			switch (op) {
			case 1:
				System.out.println("Introduce los nombres y apellidos del cliente: ");
				String nombre=entrada.nextLine();
				Cliente nuevo=new Cliente(nombre);
				lista.add(nuevo);
				
				break;
			case 2:
				System.out.println("Introduce el nombre del cliente: ");
				String name=entrada.nextLine();
				if(lista.isEmpty()) {
					System.out.println("No hay ningun cliente");
				}else {
					for(Cliente a : lista) {
						if(a.getNombre().equals(name)) {
							System.out.println("-----------------------------");
							System.out.println("Su nombre es "+a.getNombre());
							System.out.println("-----------------------------");
						}
					}
				}
				
				break;
			case 3:
				System.out.println("Introduce la id de la cuenta: ");int idcuenta=entrada.nextInt();
				System.out.println("Introdude el saldo de la cuenta: ");double saldo=entrada.nextDouble();
				System.out.println("En que estado esta la cuenta?(abierta,cerrada o bloqueada");String estado=entrada.next();
				System.out.println("Introduce la clave de la cuenta: ");int clave=entrada.nextInt();
			
				System.out.println();
				Cuenta nueva=new Cuenta(idcuenta,saldo,clave,estado);
				listacuentas.add(nueva);
				entrada.nextLine();
				break;
			case 4:
				
				System.out.println("Introduce la id de la cuenta: ");int id=entrada.nextInt();
				for(Cuenta a: listacuentas) {
					if(a.getIdcuenta()==id) {
						System.out.println("------------------------------");
						System.out.println("La id es: "+a.getIdcuenta());
						System.out.println("Su saldo es: "+a.getSaldo());
						System.out.println("Su clave es: "+a.getClave());
						System.out.println("Su estado es: "+a.getEstado());
						System.out.println("------------------------------");
					}
				}
				entrada.nextLine();
				break;
			case 5:
				System.out.println("Que cuenta quieres abrir?(id)");
				int idabrir=entrada.nextInt();
				for(Cuenta b : listacuentas) {
					if(b.getIdcuenta()==idabrir) {
							b.abre(99932432);
						}
					}
				
				entrada.nextLine();
				break;
			case 6:
				System.out.println("En que cuenta quieres extraer dinero?(id) ");
				int idsacar=entrada.nextInt();
				for(Cuenta b : listacuentas) {
					if(b.getIdcuenta()==idsacar) {
						System.out.println("Cuanto dinero quieres sacar?");
						int cant=entrada.nextInt();
						b.sacar(cant);
					}
				}
				entrada.nextLine();
				break;
			case 7:
				System.out.println("En que cuenta quieres extraer dinero?(id) ");
				int idmeter=entrada.nextInt();
				for(Cuenta b : listacuentas) {
					if(b.getIdcuenta()==idmeter) {
						System.out.println("Cuanto dinero quieres meter?");
						int cant=entrada.nextInt();
						b.ingresar(cant);
					}
				}
				entrada.nextLine();
				break;
			case 8:	
				entrada.nextLine();
				break;
			case 9:
				entrada.nextLine();
				break;
			case 10:
				System.out.println("Saliste");
				break;
			default:
				System.out.println("Opcion no valida.");
				continuar();
				break;
			}
		}while(op!=10);

		
		
	}
	public static void verMenu() {
		System.out.println("1.Alta de clientes");
		System.out.println("2.Mostrar datos cliente");
		System.out.println("3.Alta de cuentas.");
		System.out.println("4.Mostrar datos de la cuenta.");
		System.out.println("5.Abrir cuenta.");
		System.out.println("6.Extraer dinero");
		System.out.println("7.Ingresar dinero");
		System.out.println("8.Listado cuentas");
		System.out.println("9.Listado cuentas saldo.");
		System.out.println("10.Salir");
	}
	public static void continuar() throws IOException {
		System.out.println("Enter para continuar.");
		System.in.read();
	}
	/*public static void añadirCliente(ArrayList<Cliente> a,ArrayList<Cuenta>b) {
		ArrayList<Cuenta> z=new ArrayList<Cuenta>();
		System.out.println("Indica a que cliente quieres añadir una cuenta: ");
		String nombre=entrada.nextLine();
		int pos=0;
		for(Cliente x : a) {
			if(x.getNombre().contentEquals(nombre)) {
				System.out.println("Indica que cuenta quieres añadir(ID): ");
				int cuenta=entrada.nextInt();
				for(Cuenta y : b) {
					
					if(y.getIdcuenta()==cuenta) {
						z.add(y);
					}
				}
			}
		}
		for(Cuenta u : z ) {
			System.out.println("Cuenta: "+u.getIdcuenta());
		}*/
		
	}
	
	
	
	
	


