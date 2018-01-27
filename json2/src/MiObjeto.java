
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class MiObjeto {
    private String nombre;
    private String origen;
    String miCadena;
    Collection miColeccion = new ArrayList();
    Vector miVector;
    
    MiObjeto(String nombre, String origen, String cadena) {
            this.nombre = nombre;
            this.origen = origen;
            this.miCadena = cadena;
            miColeccion.add("adios");
            miColeccion.add(10);
            miVector = new Vector();
            miVector.add("Elemento1");
            miVector.add(null);
            miVector.add("Elemento3");
            miVector.add("Elemento4");
            }
}