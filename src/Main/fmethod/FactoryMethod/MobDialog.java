package Main.fmethod.FactoryMethod;

public class MobDialog extends AbstractDialog {
    Button createDialog() {
        return new MobButton();
    }
}
