package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {


    @Test
    public void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getMaxTemperature());
        conditioner.setMaxTemperature(30);
        assertEquals(30, conditioner.getMaxTemperature());

        assertEquals(0, conditioner.getMinTemperature());
        conditioner.setMinTemperature(17);
        assertEquals(17, conditioner.getMinTemperature());

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(56);
        assertEquals(0, conditioner.getCurrentTemperature());

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(11);
        assertEquals(0, conditioner.getCurrentTemperature());

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());


    }

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getMaxTemperature());
        conditioner.setMaxTemperature(30);
        assertEquals(30, conditioner.getMaxTemperature());

        assertEquals(0, conditioner.getMinTemperature());
        conditioner.setMinTemperature(17);
        assertEquals(17, conditioner.getMinTemperature());

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

        assertEquals(23, conditioner.increaseCurrentTemperature());
        assertEquals(24, conditioner.increaseCurrentTemperature());
        assertEquals(25, conditioner.increaseCurrentTemperature());
        assertEquals(26, conditioner.increaseCurrentTemperature());
        assertEquals(27, conditioner.increaseCurrentTemperature());
        assertEquals(28, conditioner.increaseCurrentTemperature());
        assertEquals(29, conditioner.increaseCurrentTemperature());
        assertEquals(30, conditioner.increaseCurrentTemperature());
        assertEquals(30, conditioner.increaseCurrentTemperature());

    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getMaxTemperature());
        conditioner.setMaxTemperature(30);
        assertEquals(30, conditioner.getMaxTemperature());

        assertEquals(0, conditioner.getMinTemperature());
        conditioner.setMinTemperature(17);
        assertEquals(17, conditioner.getMinTemperature());

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

        assertEquals(21, conditioner.decreaseCurrentTemperature());
        assertEquals(20, conditioner.decreaseCurrentTemperature());
        assertEquals(19, conditioner.decreaseCurrentTemperature());
        assertEquals(18, conditioner.decreaseCurrentTemperature());
        assertEquals(17, conditioner.decreaseCurrentTemperature());
        assertEquals(17, conditioner.decreaseCurrentTemperature());


    }
}
