package PlayerMultimediale;

abstract public class Player {
    protected String title;
    protected int durata;

    public Player(String _title, int _durata) {
        durata = _durata;
        title = _title;
    }
    public Player(String _title) {
        title = _title;
    }
    public String getTitle() {
        return this.title;
    }

    protected abstract void play ();
}
