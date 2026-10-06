import java.util.HashMap;
import java.util.Map;

public class Recetario {
    private Map<String, Pizza> recetas = new HashMap<>();

    public void registrar(String nombre, Pizza pizza) {
        recetas.put(nombre, pizza);
    }

    public Pizza obtener(String nombre) {
        Pizza receta = recetas.get(nombre);
        if (receta != null) {
            return receta.clonar();
        }
        return null;
    }
}