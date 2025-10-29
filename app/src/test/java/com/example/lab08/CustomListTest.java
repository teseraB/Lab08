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

}
