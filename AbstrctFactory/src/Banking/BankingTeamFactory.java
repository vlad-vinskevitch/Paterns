package Banking;

import Entity.TeamFactory;
import Interfaces.Developer;
import Interfaces.Manager;
import Interfaces.Tester;

public class BankingTeamFactory implements TeamFactory {
    @Override
    public Manager getManager() {
        return new BankingManager();
    }
    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

}
