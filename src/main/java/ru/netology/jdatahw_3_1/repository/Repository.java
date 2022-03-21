package ru.netology.jdatahw_3_1.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository
public class Repository {

    private String scriptName = "myScript.sql";
    private JdbcTemplate jdbcTemplate;
    private String sqlScript;

    public Repository (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.sqlScript = read(scriptName);
    }


    public String getProduct(String name) {
        //List<String> productName = jdbcTemplate.queryForList(sqlScript, String.class);\
//        List<Map<String, Object>> products = jdbcTemplate.queryForList(sqlScript, new Object[]{name}, name);
//        products.forEach( rowMap -> {
//            String userName = (String) rowMap.get("product_name");
//            System.out.println(userName);
//        });
//        return "gg";
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}