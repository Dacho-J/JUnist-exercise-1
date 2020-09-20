package com.Unit;

public abstract class OrbitalObject {

    private double AtmosphereLevel;
    private boolean hasWater;
    private String name;

    public OrbitalObject() {
    }


    public OrbitalObject(double atmosphereLevel, boolean hasWater, String name) {
        AtmosphereLevel = atmosphereLevel;
        this.hasWater = hasWater;
        this.name = name;
    }

    public double getAtmosphereLevel() {
        return AtmosphereLevel;
    }

    public void setAtmosphereLevel(double atmosphereLevel) {
        AtmosphereLevel = atmosphereLevel;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

