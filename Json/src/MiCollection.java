import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;
import com.google.gson.Gson;
public class MiCollection {

 public static void main(String args[]) throws java.io.IOException {
 Gson gson = new Gson();
 Collection collection = new ArrayList();
 collection.add("hello");
 collection.add(5);
 String json = gson.toJson(collection);
 System.out.println("JSON: " + json);
 }
}
