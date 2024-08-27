package futbol;
import java.lang.Comparable;
import java.lang.Math;


public abstract class Futbolista implements Comparable<Object>{
	
	private String nombre;
	private int edad;
	private String posicion;
	

	// CONSTRUCTORES
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.edad = edad;
	}
	
	public Futbolista() {
		this("Maradona", 30, "Delantero");
	}
	
	
	//SETTER AND GETTER
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}

	public String getPosicion(){
		return this.posicion;
	}
	
	
	//métodos Abstractos
	public abstract boolean jugarConLasManos();
	
	
	// MÉTODOS ESPECIALES
	public boolean equals(Futbolista f) {
		if (f.equals(this)) {
			return true;
		}
		else{
			return false;
		}
	}
	public String toString() {
		return "El futbolista "+nombre+" tiene "+edad+", y juega de "+posicion+".";
	}

	public int compareTo(Object o){
		Futbolista p = (Futbolista)o;
		return Math.abs(this.getEdad()-p.getEdad());
	}

}