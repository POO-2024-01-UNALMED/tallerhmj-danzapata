package futbol;
import java.lang.Math;

public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;


    //Constructores
    public Jugador(String nombre, int edad, String posicion, short golrsMarcados, byte dorsal){
        super(nombre,edad,posicion);
        this.golesMarcados = golrsMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(){
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }


    //método abstracto  
    public boolean jugarConLasManos(){
        return false;
    }


    //métodos
    public String toString(){
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados+".";  
    }




    //comparable 
    @Override
    public int compareTo(Object o) {
        Futbolista p = (Futbolista)o;
        return Math.abs(this.getEdad()-p.getEdad());
    }

}

