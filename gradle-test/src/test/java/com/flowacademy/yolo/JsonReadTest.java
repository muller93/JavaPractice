package com.flowacademy.yolo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JsonReadTest { //json beolvasása
    ObjectMapper objectMapper = new ObjectMapper();
    byte[] jsonData = Files.readAllBytes(Paths.get("./json/example.json"));
    Employee emp = objectMapper.readValue(jsonData, Employee.class);

    public JsonReadTest() throws IOException {
    }


    @Test
    public void jsonTest() { // teszt a json fájl nevére
        assertEquals(emp.getName(), "Pankaj");
    }

    @Test
    public void jsonId(){ // teszt a nem egyenlőre, az ID-ra
        assertNotEquals(emp.getId(), 111);
        System.out.println("Actual is " + emp.getId()+ ".");
    }
}
