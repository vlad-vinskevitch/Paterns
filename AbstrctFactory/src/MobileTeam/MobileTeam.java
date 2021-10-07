package MobileTeam;

import Entity.TeamFactory;
import Interfaces.Developer;
import Interfaces.Manager;
import Interfaces.Tester;

public class MobileTeam implements TeamFactory {
    @Override
    public Manager getManager() {
        return new MobManager();
    }

    @Override
    public Tester getTester() {
        return new MobTester();
    }

    @Override
    public Developer getDeveloper() {
        return new KotlinDeveloper();
    }

}
