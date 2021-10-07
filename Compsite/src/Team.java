import java.util.ArrayList;

public class Team {
    private ArrayList<Developer> developers = new ArrayList<>();

    void addDeveloper(Developer developer){
        developers.add(developer);
    }
    void removeDeveloper(Developer developer){
        developers.remove(developer);
    }

    void createProject(){
        System.out.println("team is work.. \n");
        for (Developer developer : developers){
            developer.writeCode();
        }
    }
}
