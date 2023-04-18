package com.techelevator.controller;

import java.util.ArrayList;
import java.util.Arrays;

public class MessageHelper {
    public String[] keyWords = new String[2];
    public ArrayList<String> keyWord = new ArrayList<>();


    public String[] filterMessage(String message) {
        String[] inputArray = message.toLowerCase().split(" ");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(inputArray));
        if (strList.contains("database") && strList.contains("design")) {
            keyWords[0] = "databases";
            keyWords[1] = "databasedesign";
            return keyWords;
        } else if (strList.contains("resume") && (strList.contains("example") || strList.contains("examples"))) {
            keyWords[0] = "resume";
            keyWords[1] = "links";
            return keyWords;
        } else if (strList.contains("resume") && strList.contains("parts")) {
            keyWords[0] = "resume";
            keyWords[1] = "parts";
            return keyWords;
        } else if (strList.contains("interview") && strList.contains("prep")) {
            keyWords[0] = "interview";
            keyWords[1] = "prep";
            return keyWords;
        } else if (strList.contains("interview") && strList.contains("follow")) {
            keyWords[0] = "interview";
            keyWords[1] = "follow";
            return keyWords;
        } else if (strList.contains("interview") && strList.contains("outfit")) {
            keyWords[0] = "interview";
            keyWords[1] = "outfit";
            return keyWords;
        } else if (strList.contains("interview") && strList.contains("star")) {
            keyWords[0] = "interview";
            keyWords[1] = "star";
            return keyWords;
        } else if (strList.contains("cover") && strList.contains("parts")) {
            keyWords[0] = "cover";
            keyWords[1] = "parts";
            return keyWords;
        } else if (strList.contains("cover") && strList.contains("links")) {
            keyWords[0] = "cover";
            keyWords[1] = "links";
            return keyWords;
        } else if (strList.contains("social") && strList.contains("linkedin")) {
            keyWords[0] = "social";
            keyWords[1] = "link";
            return keyWords;
        } else if (strList.contains("social") && strList.contains("huntr")) {
            keyWords[0] = "social";
            keyWords[1] = "hunt";
            return keyWords;
        } else if (strList.contains("technical interview") && strList.contains("prep")) {
            keyWords[0] = "technical";
            keyWords[1] = "preparation";
            return keyWords;
        } else if (strList.contains("technical interview") && strList.contains("explanation")) {
            keyWords[0] = "technical";
            keyWords[1] = "explanation";
            return keyWords;
        } else if (strList.contains("networking") && strList.contains("prep")) {
            keyWords[0] = "networking";
            keyWords[1] = "prep";
            return keyWords;
        } else if (strList.contains("networking") && strList.contains("events")) {
            keyWords[0] = "networking";
            keyWords[1] = "events";
            return keyWords;
        } else if (strList.contains("matchmaking") && strList.contains("overview")) {
            keyWords[0] = "matchmaking";
            keyWords[1] = "overview";
            return keyWords;
        } else if (strList.contains("matchmaking") && strList.contains("prep")) {
            keyWords[0] = "matchmaking";
            keyWords[1] = "prep";
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
        } else if (strList.contains("databases")) {
            keyWords[0] = "databases";
            keyWords[1] = "default";
            return keyWords;
        } else if (strList.contains("front")) {
            keyWords[0] = "frontend";
            keyWords[1] = "default";
            return keyWords;
        }
        keyWords[0] = "main";
        keyWords[1] = "default";
        return keyWords;
    }
}
