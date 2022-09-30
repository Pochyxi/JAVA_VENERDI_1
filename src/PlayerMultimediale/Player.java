package PlayerMultimediale;

abstract public class Player {
    protected String title;
    protected int durata;

    protected String tipo;

    public Player(String _title, int _durata) {
        durata = _durata;
        title = _title;
    }
    public Player(String _title) {
        title = _title;
    }

    public String getTipo() {
        return this.tipo;
    }
    public String getTitle() {
        return this.title;
    }

    public abstract void play ();
    public void show(){};
}
