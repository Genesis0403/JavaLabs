package by.bntu.fitr.povt.korotkevich.distance.model;

import by.bntu.fitr.povt.korotkevich.average.model.Executer;

public class DistanceCounter implements Executer {
    private int speedA;
    private int speedB;
    private double time;
    private double beginDistance;

    public DistanceCounter(int speedA, int speedB, double time, double beginDistance) {
        this.speedA = speedA;
        this.speedB = speedB;
        this.time = time;
        this.beginDistance = beginDistance;
    }

    @Override
    public double execute() {
        return beginDistance + (speedA + speedB) * time;
    }
}
