import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;
import com.google.gson.Gson;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;
 public class MiObjeto {
 private String nombre;
 private String origen;
 String miCadena;
 Collection miColeccion = new ArrayList();
 Vector miVector;
 private MiObjeto(String nombre, String origen, String cadena) {
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
 public static void main(String[] args) {
 MiObjeto obj = new MiObjeto("Juan", "Madrid", null);
 Gson gson = new Gson();
 String jsonString = gson.toJson(obj);
 System.out.println("JSON: " + jsonString);
 }
}
