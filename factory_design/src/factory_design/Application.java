package factory_design;

// Client
public class Application {
    private final GUIFactory guiFactory;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUI() {
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.createUI();

        GUIFactory macOSFactory = new MacOSFactory();
        Application macOSApp = new Application(macOSFactory);
        macOSApp.createUI();

        GUIFactory linuxFactory = new LinuxFactory();
        Application linuxApp = new Application(linuxFactory);
        linuxApp.createUI();
    }
}
