package com.techelevator.controller;

public class MessageControllerHelper {
    public String needCategory = "default";
    public String keyWord1 = "default";
    public String keyWord2 = "default";

    public String filterQuote(String quote) {
        String[] inputArray = quote.toLowerCase().split(" ");
        for (int i = 0; i < inputArray.length ; i++) {
            if (inputArray[i].equals("quote")) {
        // implement this for quotes service
            }
        }
        return null;
    }

    public String[] filterMessage(String message) {
        String[] keyWords = new String[3];
        String[] inputArray = message.toLowerCase().split(" ");
        for (int i = 0; i <inputArray.length ; i++) {
            if(inputArray[i].equals("pathway")) {
                this.needCategory = "pathway";
                keyWords[0] = needCategory;
                ke
                return needCategory + this.keyWord1 + this.keyWord2;
            }
        }
        return  null;
    }




    public String getNeedCategory() {
        return needCategory;
    }

    public void setNeedCategory(String needCategory) {
        this.needCategory = needCategory;
    }

    public String getKeyWord1() {
        return keyWord1;
    }

    public void setKeyWord1(String keyWord1) {
        this.keyWord1 = keyWord1;
    }

    public String getKeyWord2() {
        return keyWord2;
    }

    public void setKeyWord2(String keyWord2) {
        this.keyWord2 = keyWord2;
    }
}
