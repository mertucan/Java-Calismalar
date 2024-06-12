package factory_design;

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}

interface Button {
    void paint();
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows stil butonu");
    }
}

class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS stil butonu");
    }
}

class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux stil butonu");
    }
}

interface Checkbox {
    void paint();
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows stili checkbox");
    }
}

class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOS stili checkbox");
    }
}

class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Linux stili checkbox");
    }
}

public class factory_design {
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
