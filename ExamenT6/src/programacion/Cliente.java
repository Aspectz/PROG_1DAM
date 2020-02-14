package programacion;
import java.util.*;
public class Cliente {
	private String nombre;
	private ArrayList<Cuenta>cuenta;
	Scanner entrada=new Scanner(System.in);
	public Cliente() {
		this.nombre="";
		this.cuenta=new ArrayList<Cuenta>();
	}
	public Cliente(String nombre) {
		this.nombre=nombre;
		this.cuenta=new ArrayList<Cuenta>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Cuenta> getCuenta() {
		return cuenta;
	}
	public void setCuenta(ArrayList<Cuenta> cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
	
}
