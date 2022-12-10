package Main.fmethod.FactoryMethod;

abstract class AbstractDialog implements Dialog {
    abstract Button createDialog ();
    public void render () {
        Button button = createDialog();
        button.createButton();
    }
}
