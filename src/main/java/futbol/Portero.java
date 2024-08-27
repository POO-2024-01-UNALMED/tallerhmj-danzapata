package futbol;

public class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;


    //Constructor 
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }


    //métodos 
    public boolean jugarConLasManos(){
        return true;
    }

    public String toString() {
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos+".";
    }


    //comparar
    public int compareTo(Futbolista o) {
        Portero p = (Portero) o;
        return Math.abs(this.golesRecibidos-p.golesRecibidos);
    }
}
