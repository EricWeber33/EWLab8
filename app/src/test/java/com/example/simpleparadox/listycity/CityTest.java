package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {

    private City mockCity = new City("Edmonton", "Alberta");


    @Test
    void TestSet(){
        mockCity.setCity("Vermillion");
        String newName = mockCity.getCityName();
        assertEquals("Vermillion", newName);
    }


}
