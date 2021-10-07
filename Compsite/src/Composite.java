public class Composite {
    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDeveloper = new JavaDeveloper();
        Developer phpDeveloper = new PHPDeveloper();

        team.addDeveloper(javaDeveloper);
        team.addDeveloper(phpDeveloper);

        team.createProject();

    }
}
