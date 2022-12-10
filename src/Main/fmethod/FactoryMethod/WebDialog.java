package Main.fmethod.FactoryMethod;

public class WebDialog extends AbstractDialog {
    Button createDialog() {
        return new WebButton();
    }
}
