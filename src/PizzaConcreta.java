public class PizzaConcreta implements Pizza {
    private String masa;
    private String salsa;
    private String queso;
    private boolean pepperoni;

    public PizzaConcreta(String masa, String salsa, String queso, boolean pepperoni) {
        this.masa = masa;
        this.salsa = salsa;
        this.queso = queso;
        this.pepperoni = pepperoni;
    }

    // Constructor de copia: usado internamente por clonar().
    private PizzaConcreta(PizzaConcreta original) {
        this.masa = original.masa;
        this.salsa = original.salsa;
        this.queso = original.queso;
        this.pepperoni = original.pepperoni;
    }

    @Override
    public Pizza clonar() {
        return new PizzaConcreta(this);
    }

    public void setQueso(String queso) { this.queso = queso; }
    public void setPepperoni(boolean pepperoni) { this.pepperoni = pepperoni; }
    public void setMasa(String masa) { this.masa = masa; }

    @Override
    public void mostrar() {
        System.out.println("Pizza [masa=" + masa + ", salsa=" + salsa
                + ", queso=" + queso + ", pepperoni=" + pepperoni + "]");
    }
}