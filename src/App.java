public class App {
    public static void main(String[] args) {
        // 1. El Chef configura el recetario con pizzas base
        Recetario recetario = new Recetario();

        PizzaConcreta margarita = new PizzaConcreta("delgada", "tomate", "mozzarella", false);
        PizzaConcreta pepperoni = new PizzaConcreta("gruesa", "tomate", "mozzarella", true);

        recetario.registrar("PizzaMargarita", margarita);
        recetario.registrar("PizzaPepperoni", pepperoni);

        // 2. El Chef clona y modifica
        PizzaConcreta clon1 = (PizzaConcreta) recetario.obtener("PizzaMargarita");
        clon1.setQueso("parmesano");

        PizzaConcreta clon2 = (PizzaConcreta) recetario.obtener("PizzaPepperoni");
        clon2.setPepperoni(false);

        // 3. Mostrar resultados
        System.out.println("--- Recetas originales (sin cambios) ---");
        margarita.mostrar();
        pepperoni.mostrar();

        System.out.println("\n--- Clones modificados ---");
        clon1.mostrar();
        clon2.mostrar();
    }
}