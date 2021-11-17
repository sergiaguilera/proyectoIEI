import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    
    private static final String JSONpath = "/Users/sergiaguileramorales/Desktop/proyectoIEI/proyectoIEI/archivosDatos/bibliotecas.json";

    private static void ReadJSON(){

        // JSONParser parser = new JSONParser();
        // Object obj = parser.parse(new FileReader(JSONpath));
        // JSONArray json = (JSONArray) obj;

        // for (int i = 0; i < json.size(); i++) {

        // JSONObject object =(JSONObject) json.get(i);
        //ejemplos que hay q sustituir por nuestras columnas
        // String clave = object.get("points").toString();  
        // String title = object.get("title").toString();  
        // System.err.println("points:"+clave);
        // System.err.println("title:"+title);

    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
