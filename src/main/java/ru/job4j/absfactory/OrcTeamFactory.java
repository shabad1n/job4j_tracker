package ru.job4j.absfactory;

public class OrcTeamFactory implements Wars {

    @Override
    public OrcArcher getOrcArcher() {
        return new OrcArcherGreen();
    }

    @Override
    public Orkwarrior getOrcWarrior() {
        return new OrcWarroior();
    }
}
