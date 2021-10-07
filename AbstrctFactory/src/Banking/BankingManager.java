package Banking;

import Interfaces.Manager;

public class BankingManager implements Manager {
    @Override
    public void manageCode() {
        System.out.println("banking manager");
    }
}
