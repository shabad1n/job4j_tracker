package ru.job4j.absfactory;

public class Team {
    public static void main(String[] args) {
        OrcTeamFactory orcTeamFactory = new OrcTeamFactory();
        OrcArcher orcArcher = orcTeamFactory.getOrcArcher();
        Orkwarrior orcWarroior = orcTeamFactory.getOrcWarrior();

        orcArcher.shooting();
        orcWarroior.attack();
    }
}
