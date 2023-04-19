package com.techelevator.controller;

import java.util.ArrayList;
import java.util.Arrays;

public class MessageHelper {
    public String[] keyWords = new String[2];
    public ArrayList<String> keyWord = new ArrayList<>();


    public String[] filterMessage(String message) {
        String[] inputArray = message.toLowerCase().split(" ");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(inputArray));
        if (strList.contains("resume")
                && (strList.contains("example") || strList.contains("examples") || strList.contains("link") || strList.contains("links"))) {
            keyWords[0] = "resume";
            keyWords[1] = "links";
            return keyWords;
        } else if (strList.contains("resume")
                && strList.contains("parts")) {
            keyWords[0] = "resume";
            keyWords[1] = "parts";
            return keyWords;
        } else if (strList.contains("interview")
                && strList.contains("prep")) {
            keyWords[0] = "interview";
            keyWords[1] = "prep";
            return keyWords;
        } else if (strList.contains("interview")
                && strList.contains("follow")) {
            keyWords[0] = "interview";
            keyWords[1] = "follow";
            return keyWords;
        } else if (strList.contains("interview")
                && strList.contains("outfit")) {
            keyWords[0] = "interview";
            keyWords[1] = "outfit";
            return keyWords;
        } else if (strList.contains("interview")
                && strList.contains("star")) {
            keyWords[0] = "interview";
            keyWords[1] = "star";
            return keyWords;
        } else if (strList.contains("cover")
                && strList.contains("parts")) {
            keyWords[0] = "cover";
            keyWords[1] = "parts";
            return keyWords;
        } else if (strList.contains("cover")
                && strList.contains("links")) {
            keyWords[0] = "cover";
            keyWords[1] = "links";
            return keyWords;
        } else if (strList.contains("social")
                && strList.contains("linkedin")) {
            keyWords[0] = "social";
            keyWords[1] = "link";
            return keyWords;
        } else if (strList.contains("social")
                && strList.contains("huntr")) {
            keyWords[0] = "social";
            keyWords[1] = "hunt";
            return keyWords;
        } else if (strList.contains("technical interview")
                && strList.contains("prep")) {
            keyWords[0] = "technical";
            keyWords[1] = "prep";
            return keyWords;
        } else if (strList.contains("technical interview")
                && strList.contains("explanation")) {
            keyWords[0] = "technical";
            keyWords[1] = "explanation";
            return keyWords;
        } else if (strList.contains("networking")
                && strList.contains("prep")) {
            keyWords[0] = "networking";
            keyWords[1] = "prep";
            return keyWords;
        } else if (strList.contains("networking")
                && strList.contains("events")) {
            keyWords[0] = "networking";
            keyWords[1] = "events";
            return keyWords;
        } else if (strList.contains("matchmaking")
                && strList.contains("overview")) {
            keyWords[0] = "matchmaking";
            keyWords[1] = "overview";
            return keyWords;
        } else if (strList.contains("dao")
                && strList.contains("testing")) {
            keyWords[0] = "clientserver";
            keyWords[1] = "dao";
            return keyWords;
        } else if (strList.contains("matchmaking")
                && strList.contains("prep")) {
            keyWords[0] = "matchmaking";
            keyWords[1] = "prep";
            return keyWords;
        } else if (strList.contains("database")
                && strList.contains("design")) {
            keyWords[0] = "database";
            keyWords[1] = "design";
            return keyWords;
        } else if (strList.contains("database")
                && strList.contains("security")) {
            keyWords[0] = "database";
            keyWords[1] = "security";
            return keyWords;
        }  else if (strList.contains("sql")) {
            keyWords[0] = "database";
            keyWords[1] = "sql";
            return keyWords;
        } else if (strList.contains("variables")) {
            keyWords[0] = "java";
            keyWords[1] = "variables";
            return keyWords;
        } else if (strList.contains("arrays")) {
            keyWords[0] = "java";
            keyWords[1] = "arrays";
            return keyWords;
        } else if (strList.contains("collections")) {
            keyWords[0] = "java";
            keyWords[1] = "collections";
            return keyWords;
        } else if (strList.contains("unit")) {
            keyWords[0] = "java";
            keyWords[1] = "unit";
            return keyWords;
        } else if (strList.contains("oop")) {
            keyWords[0] = "java";
            keyWords[1] = "oop";
            return keyWords;
        } else if (strList.contains("inheritance")) {
            keyWords[0] = "java";
            keyWords[1] = "inheritance";
            return keyWords;
        } else if (strList.contains("polymorphism")) {
            keyWords[0] = "java";
            keyWords[1] = "polymorphism";
            return keyWords;
        } else if (strList.contains("exceptions")) {
            keyWords[0] = "java";
            keyWords[1] = "exceptions";
            return keyWords;
        } else if (strList.contains("encapsulation")) {
            keyWords[0] = "java";
            keyWords[1] = "encapsulation";
            return keyWords;
        } else if (strList.contains("api")) {
            keyWords[0] = "clientserver";
            keyWords[1] = "api";
            return keyWords;
        } else if (strList.contains("dao")) {
            keyWords[0] = "clientserver";
            keyWords[1] = "dao";
            return keyWords;
        } else if (strList.contains("http")) {
            keyWords[0] = "clientserver";
            keyWords[1] = "http";
            return keyWords;
        } else if (strList.contains("html")) {
            keyWords[0] = "web";
            keyWords[1] = "html";
            return keyWords;
        } else if (strList.contains("javascript")) {
            keyWords[0] = "web";
            keyWords[1] = "javascript";
            return keyWords;
        } else if (strList.contains("vue")) {
            keyWords[0] = "web";
            keyWords[1] = "vue";
            return keyWords;
        } else if (strList.contains("html")) {
            keyWords[0] = "web";
            keyWords[1] = "html";
            return keyWords;
        } else if (strList.contains("tags")) {
            keyWords[0] = "frontend";
            keyWords[1] = "tags";
            return keyWords;
        } else if (strList.contains("css")) {
            keyWords[0] = "frontend";
            keyWords[1] = "css";
            return keyWords;
        } else if (strList.contains("flex")) {
            keyWords[0] = "frontend";
            keyWords[1] = "flex";
            return keyWords;
        } else if (strList.contains("pathway")) {
            keyWords[0] = "pathway";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("resume")) {
            keyWords[0] = "resume";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("interview")) {
            keyWords[0] = "interview";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("cover")) {
            keyWords[0] = "cover";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("networking")) {
            keyWords[0] = "networking";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("social")) {
            keyWords[0] = "social";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("matchmaking")) {
            keyWords[0] = "matchmaking";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("curriculum")) {
            keyWords[0] = "curriculum";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("java")) {
            keyWords[0] = "java";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("client")) {
            keyWords[0] = "clientserver";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("web")) {
            keyWords[0] = "webapp";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("database")) {
            keyWords[0] = "database";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("front")) {
            keyWords[0] = "frontend";
            keyWords[1] = "default";
            return keyWords;
        }
        keyWords[0] = "help";
        keyWords[1] = "default";
        return keyWords;
    }
}
