package MobileTeam;

import Interfaces.Developer;

public class KotlinDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write Kotlin code");
    }
}
