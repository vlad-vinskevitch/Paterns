import Banking.BankingTeamFactory;
import Entity.TeamFactory;
import Interfaces.Developer;
import Interfaces.Manager;
import Interfaces.Tester;
import MobileTeam.MobileTeam;
import website.WebsiteTeamFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        TeamFactory teamFactory = createTeamForTag("bank");
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        Manager manager = teamFactory.getManager();
        developer.writeCode();
        tester.testCode();
        manager.manageCode();
    }
    static TeamFactory createTeamForTag(String tag){

        if (tag.equalsIgnoreCase("bank")){
            return new BankingTeamFactory();
        }else if (tag.equalsIgnoreCase("website")){
            return new WebsiteTeamFactory();
        }else if (tag.equalsIgnoreCase("mobile")){
            return new MobileTeam();
        }
        else {
            throw new RuntimeException(tag + " don`t found team");
        }
    }
}
