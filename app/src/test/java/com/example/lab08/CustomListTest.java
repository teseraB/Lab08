package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "Alberta");

        list.addCity(edmonton);

        assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "Alberta");
        list.addCity(edmonton);

        list.deleteCity(edmonton);

        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        City edmonton = new City("Edmonton", "Alberta");
        City vancouver = new City("Vancouver", "British Columbia");
        list.addCity(edmonton);
        list.addCity(vancouver);

        assertEquals(2, list.countCities());
    }



}
