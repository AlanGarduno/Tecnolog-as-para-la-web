import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;

public class escribe_json {
    public static void main(String args[]) throws java.io.IOException {
            Gson gson = new Gson();
            System.out.println("Ahora se escribira un dato simple\n");
            String datos = "Hola";
            String jsonString = gson.toJson(datos);
            System.out.println("JSON: " + jsonString);
            
            System.out.println("Ahora se escribira una coleccion\n");
            colecciones();
            System.out.println("\nAhora se escribira un objeto\n");
            objetos();
        }
    
    public static void colecciones(){
        Gson gson = new Gson();
        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add(5);
        String json = gson.toJson(collection);
        System.out.println("JSON: " + json);
    }
    
    public static void objetos(){
        Gson gson = new Gson();
        MiObjeto obj = new MiObjeto("Juan", "Madrid", null);
        String jsonString = gson.toJson(obj);
        System.out.println("JSON: " + jsonString);
    }
}