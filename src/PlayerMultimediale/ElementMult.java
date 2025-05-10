package PlayerMultimediale;

public abstract class ElementMult implements Multimediale{
protected String titolo;

    public ElementMult(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String getTitolo() {
        return titolo;
    }
}
