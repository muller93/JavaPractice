package com.flowacademy.yolo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] jsonData = Files.readAllBytes(Paths.get("./json/example.json"));
        Employee emp = objectMapper.readValue(jsonData, Employee.class);

        emp.setName("Bobby");
        emp.setId(11);

        System.out.println(emp);
        //first
        ObjectMapper mapper = new ObjectMapper();

        try { //write file in json
            mapper.writeValue(new File("./bobby.json"), emp);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //first ^


        //second
        JsonNode rootNode = objectMapper.readTree(jsonData);

        ((ObjectNode) rootNode).put("id", 500);
//add new key value
        ((ObjectNode) rootNode).put("test", "test value");
//remove existing key
        ((ObjectNode) rootNode).remove("permanent");
        objectMapper.writeValue(new File("update_bobby.txt"), rootNode);
//second ^
    }



}
