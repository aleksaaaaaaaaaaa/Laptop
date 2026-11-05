public class Laptop {
    // Attribute
    private String hersteller = "Lenovo";
    private int kosten = 1000;
    private boolean neu = true;

    // 1. Konstruktor mit allen Parametern
    public Laptop(String neuHersteller, int neuKosten, boolean neuNeu) {
        this.hersteller = neuHersteller;
        this.kosten = neuKosten;
        this.neu = neuNeu;
    }

    // 2. Konstruktor mit Hersteller und neu-Status (Kosten behalten Standardwert oder werden angepasst)
    public Laptop(String neuHersteller, boolean neuNeu) {
        this.hersteller = neuHersteller;
        this.neu = neuNeu;
    }

    // 3. Standard-Konstruktor (leerer Konstruktor)
    public Laptop() {
        // Nutzt die Standardwerte
    }

    // Get- und Set-Methoden
    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getKosten() {
        return kosten;
    }

    public void setKosten(int kosten) {
        this.kosten = kosten;
    }

    public boolean isNeu() {
        return neu;
    }

    public void setNeu(boolean neu) {
        this.neu = neu;
    }

    // Zusätzliche Methode zur Konsolenausgabe
    public void printLaptop() {
        System.out.println("Laptop [Hersteller: " + hersteller + 
                           ", Kosten: " + kosten + 
                           " EUR, Neu: " + neu + "]");
    }
}