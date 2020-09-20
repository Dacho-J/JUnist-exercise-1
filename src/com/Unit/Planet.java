package com.Unit;

public class Planet extends OrbitalObject {

    private int CivilisationCount;



    public Planet(double atmosphereLevel, boolean hasWater, String name, int civilisationCount) {
        super(atmosphereLevel, hasWater, name);
        CivilisationCount = civilisationCount;
    }

    public int getCivilisationCount() {
        return CivilisationCount;
    }

    public void setCivilisationCount(int civilisationCount) {
        CivilisationCount = civilisationCount;
    }
}
