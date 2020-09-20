package com.Unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrbitalObjectTest {

    @Test
    void testConstructor(){
        Planet earth = new Planet(30.00,true,"earth",30);
        assertEquals(30.00, earth.getAtmosphereLevel());
        assertEquals(30, earth.getCivilisationCount());
        
    }


    @Test
    void getAtmosphereLevel() {
        System.out.println("Get Atmosphere number");
        Moon Test = new Moon();
        Test.setAtmosphereLevel(30.0);
        assertTrue(Test.getAtmosphereLevel() == 30.0);
    }
    @Test
    void setAtmosphereLevel() {
            System.out.println("Set Atmospherelevel");
            Moon Test = new Moon();
            Test.setAtmosphereLevel(30.0);
            assertTrue(Test.getAtmosphereLevel()==30.0);
    }

    @Test
    void isHasWater() {
        Moon Test = new Moon();
        Test.isHasWater();
        assertFalse(Test.isHasWater());

    }

    @Test
    void setHasWater() {
        Moon Test = new Moon();
        Test.setHasWater(true);
        assertTrue(Test.isHasWater());
    }

    @Test
    void getName() {
        Moon Test = new Moon();
        Test.setName("Daniel");
        assertTrue(Test.getName()=="Daniel");

    }

    @Test
    void setName() {
        Moon Test = new Moon();
        Test.setName("Daniel");
        assertTrue(Test.getName()=="Daniel");
    }
}