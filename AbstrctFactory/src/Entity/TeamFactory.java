package Entity;

import Interfaces.Developer;
import Interfaces.Tester;
import Interfaces.Manager;

public interface TeamFactory {
    Manager getManager();
    Tester getTester();
    Developer getDeveloper();
}
