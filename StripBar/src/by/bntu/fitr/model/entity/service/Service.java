package by.bntu.fitr.model.entity.service;

import java.util.Arrays;

public class Service {
    private Dance[] dances = Dance.values();
    private Intimacy[] intimacies = Intimacy.values();

    public Service() {
    }

    public Dance getDance(String name) {//TODO What to return?
        Dance result = Dance.BELLYDANCE;
        for (Dance dance : dances) {
            if (dance.getName().equals(name))
                result = dance;
        }
        return result;
    }

    public Intimacy getIntimacies(String name) {//TODO What to return?
        Intimacy result = Intimacy.SEX;
        for (Intimacy intimacy : intimacies) {
            if (intimacy.getName().equals(name))
                result = intimacy;
        }
        return result;
    }

    @Override
    public String toString() {
        return "service{" +
                "dances=" + (dances == null ? null : Arrays.asList(dances)) +
                ", intimacies=" + (intimacies == null ? null : Arrays.asList(intimacies)) +
                '}';
    }
}
