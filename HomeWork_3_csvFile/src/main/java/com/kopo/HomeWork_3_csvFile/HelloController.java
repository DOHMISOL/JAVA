package com.kopo.HomeWork_3_csvFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @RequestMapping(value = "/csv", produces = "application/json; charset=UTF-8")
    public ResponseEntity<List<String[]>> csvRead() {
        String filePath = "src/main/resources/csv/info.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<String[]> csvData = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                csvData.add(row);
            }

            // JSON으로 변환
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonData = objectMapper.writeValueAsString(csvData);

            return ResponseEntity.ok(csvData);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null); // 에러 응답
        }
    }
}
