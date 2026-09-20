class Produkt {
    protected String nazwa;
    protected double cenaBazowa;

    public Produkt(String nazwa, double cenaBazowa) {
        this.nazwa = nazwa;
        this.cenaBazowa = cenaBazowa;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena bazowa: " + cenaBazowa + " zł");
    }
}


class Elektronika extends Produkt {
    private String producent;
    private int gwarancja;

    public Elektronika(String nazwa, double cenaBazowa, String producent, int gwarancja) {
        super(nazwa, cenaBazowa);
        this.producent = producent;
        this.gwarancja = gwarancja;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Producent: " + producent);
        System.out.println("Gwarancja: " + gwarancja + " miesięcy");
    }
}


class Odziez extends Produkt {
    private String rozmiar;
    private String kolor;

    public Odziez(String nazwa, double cenaBazowa, String rozmiar, String kolor) {
        super(nazwa, cenaBazowa);
        this.rozmiar = rozmiar;
        this.kolor = kolor;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Rozmiar: " + rozmiar);
        System.out.println("Kolor: " + kolor);
    }
}


public class Main {
    public static void main(String[] args) {

        Produkt[] magazyn = {
            new Elektronika("Telefon", 2500, "Samsung", 24),
            new Elektronika("Laptop", 4500, "Lenovo", 36),
            new Odziez("Koszulka", 80, "L", "Czarny"),
            new Odziez("Bluza", 200, "XL", "Szary")
        };

        for (Produkt produkt : magazyn) {
            produkt.wyswietlInformacje();
            System.out.println("--------------------");
        }
    }
}