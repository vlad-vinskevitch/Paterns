package website;

import Interfaces.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP code");
    }
}
