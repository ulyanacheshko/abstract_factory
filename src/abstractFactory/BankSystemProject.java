package abstractFactory;

import banking.BankingTeamFactory;

public class BankSystemProject {
    public static void main(String[] args){
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Creating Banking System");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
