package website;

import Entity.TeamFactory;
import Interfaces.Developer;
import Interfaces.Manager;
import Interfaces.Tester;

public class WebsiteTeamFactory implements TeamFactory {
    @Override
    public Manager getManager() {
        return new WebManager();
    }

    @Override
    public Tester getTester() {
        return new webTester();
    }

    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

}
