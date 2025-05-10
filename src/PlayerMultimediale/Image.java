package PlayerMultimediale;

public class Image extends ElementMult {
    private int luminosita;

    public Image(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }
}
