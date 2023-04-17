package com.techelevator.controller;

public class MessageControllerHelper {
    public String needCategory = "default";
    public String keyWord1 = "default";
    public String keyWord2 = "default";


    public String[] filterMessage(String message) {
        String[] keyWords = new String[3];
        String[] inputArray = message.toLowerCase().split(" ");
        for (String word : inputArray) {
            if (needCategory.equals("default") && keyWord1.equals("default") && keyWord2.equals("default")) {
                if (word.equals("pathway") || word.equals("interview") || word.equals("resume") || word.equals("cover") || word.equals("letter")) {
                    setNeedCategoryHelper("pathway", keyWords);
                    return keyWords;
                } else if (word.equals("curriculum") || word.equals("coding") || word.equals("java") || word.equals("sql") || word.equals("database")
                        || word.equals("api") || word.equals("javascript") || word.equals("html") || word.equals("css") || word.equals("dao")
                        || word.equals("vue")) {
                    setNeedCategoryHelper("curriculum", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("default") && keyWord2.equals("default")) {
                if (word.equals("resume")) {
                    setKeyword1Helper("resume", keyWords);
                    return keyWords;
                } else if (word.equals("interview")) {
                    setKeyword1Helper("interview", keyWords);
                    return keyWords;
                } else if (word.equals("cover") || word.equals("letter")) {
                    setKeyword1Helper("cover", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("resume") && keyWord2.equals("default")) {
                if (word.equals("parts") || word.equals("component") || word.equals("components") || word.equals("part")) {
                    setKeyword2Helper("parts", keyWords);
                    return keyWords;
                } else if (word.equals("links") || word.equals("link") || word.equals("examples") || word.equals("example")) {
                    setKeyword2Helper("links", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("cover") && keyWord2.equals("default")) {
                if (word.equals("parts") || word.equals("component") || word.equals("components") || word.equals("part")) {
                    setKeyword2Helper("parts", keyWords);
                    return keyWords;
                } else if (word.equals("links") || word.equals("link") || word.equals("examples") || word.equals("example")) {
                    setKeyword2Helper("links", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("default")) {
                if (word.equals("prep") || word.equals("prepare")) {
                    setKeyword2Helper("prep", keyWords);
                    return keyWords;
                } else if (word.equals("follow") || word.equals("up")) {
                    setKeyword2Helper("follow", keyWords);
                    return keyWords;
                } else if (word.equals("star") || word.equals("questions")|| word.equals("question")) {
                    setKeyword2Helper("star", keyWords);
                    return keyWords;
                } else if (word.equals("outfit") || word.equals("dress") || word.equals("clothes") || word.equals("clothing") || word.equals("wear")) {
                    setKeyword2Helper("outfit", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("resume") && keyWord2.equals("parts")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("resume") && keyWord2.equals("links")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("cover") && keyWord2.equals("parts")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("cover") && keyWord2.equals("links")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("prep")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("follow")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("star")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("outfit")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
                //beginning of curriculum filter
            } else if (needCategory.equals("curriculum") && keyWord1.equals("default") && keyWord2.equals("default")) {
                if (word.equals("java")) {
                    setKeyword1Helper("java", keyWords);
                    return keyWords;
                } else if (word.equals("client") || word.equals("server")) {
                    setKeyword1Helper("clientserver", keyWords);
                    return keyWords;
                } else if (word.equals("web") || word.equals("app")) {
                    setKeyword1Helper("webapp", keyWords);
                    return keyWords;
                } else if (word.equals("database") || word.equals("data") || word.equals("base") || word.equals("databases") ) {
                    setKeyword1Helper("databases", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("java") && keyWord2.equals("default")) {
                if (word.equals("variables") || word.contains("variable")) {
                    setKeyword2Helper("variables", keyWords);
                    return keyWords;
                } else if (word.equals("arrays") || word.equals("array")) {
                    setKeyword2Helper("arrays", keyWords);
                    return keyWords;
                } else if (word.equals("collections") || word.equals("collection")) {
                    setKeyword2Helper("collections", keyWords);
                    return keyWords;
                } else if (word.equals("unit") || word.equals("testing") || word.equals("test")) {
                    setKeyword2Helper("unittesting", keyWords);
                    return keyWords;
                } else if (word.equals("oop") || word.equals("object") || word.equals("oriented")) {
                    setKeyword2Helper("oop", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("clientserver") && keyWord2.equals("default")) {
                if (word.equals("api")) {
                    setKeyword2Helper("api", keyWords);
                    return keyWords;
                } else if (word.equals("dao")) {
                    setKeyword2Helper("dao", keyWords);
                    return keyWords;
                } else if (word.equals("networking") || word.equals("network")) {
                    setKeyword2Helper("networking", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("webapp") && keyWord2.equals("default")) {
                if (word.equals("css") || word.equals("style")) {
                    setKeyword2Helper("css", keyWords);
                    return keyWords;
                } else if (word.equals("html")) {
                    setKeyword2Helper("html", keyWords);
                    return keyWords;
                } else if (word.equals("javascript") || word.equals("java") || word.equals("script")) {
                    setKeyword2Helper("javascript", keyWords);
                    return keyWords;
                } else if (word.equals("vue")) {
                    setKeyword2Helper("vue", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("databases") && keyWord2.equals("default")) {
                if (word.equals("sql") || word.equals("sequel")) {
                    setKeyword2Helper("sql", keyWords);
                    return keyWords;
                } else if (word.equals("design")) {
                    setKeyword2Helper("databasedesign", keyWords);
                    return keyWords;
                } else if (word.equals("security")) {
                    setKeyword2Helper("datasecurity", keyWords);
                    return keyWords;
                } else if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("java") && keyWord2.equals("variables")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("java") && keyWord2.equals("arrays")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("java") && keyWord2.equals("collections")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("java") && keyWord2.equals("unittesting")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("java") && keyWord2.equals("oop")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("clientserver") && keyWord2.equals("api")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("clientserver") && keyWord2.equals("dao")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("clientserver") && keyWord2.equals("networking")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("webapp") && keyWord2.equals("css")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("webapp") && keyWord2.equals("html")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("webapp") && keyWord2.equals("javascript")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("webapp") && keyWord2.equals("vue")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("databases") && keyWord2.equals("sql")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("databases") && keyWord2.equals("databasedesign")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            } else if (needCategory.equals("curriculum") && keyWord1.equals("databases") && keyWord2.equals("datasecurity")) {
                if (word.equals("back")) {
                    back(keyWords);
                    return keyWords;
                } else if (word.equals("home")) {
                    home(keyWords);
                    return keyWords;
                }
            }
        }
        keyWords[0] = "help"; keyWords[1] = "default"; keyWords[2] = "default";
        return keyWords;
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

    public void home(String[] keyWords) {
        this.needCategory = "default";
        this.keyWord1 = "default";
        this.keyWord2 = "default";
        keyWords[0] = needCategory;
        keyWords[1] = keyWord1;
        keyWords[2] = keyWord2;
    }

    public void back (String[] keyWords) {
        if(!needCategory.equals("default") && !keyWord1.equals("default") && !keyWord2.equals("default")){
            this.keyWord2 = "default";
            keyWords[0] = needCategory;
            keyWords[1] = keyWord1;
            keyWords[2] = keyWord2;
        } else if (!needCategory.equals("default") && !keyWord1.equals("default") && keyWord2.equals("default")){
            this.keyWord1 = "default";
            keyWords[0] = needCategory;
            keyWords[1] = keyWord1;
            keyWords[2] = keyWord2;
        } else if (!needCategory.equals("default") && keyWord1.equals("default") && keyWord2.equals("default")){
            this.needCategory = "default";
            keyWords[0] = needCategory;
            keyWords[1] = keyWord1;
            keyWords[2] = keyWord2;
        } else {
            this.needCategory = "default";
            this.keyWord1 = "default";
            this.keyWord2 = "default";
            keyWords[0] = needCategory;
            keyWords[1] = keyWord1;
            keyWords[2] = keyWord2;
        }
    }

    public void setNeedCategoryHelper (String category, String[] keyWords){
        this.needCategory = category;
        keyWords[0] = needCategory;
        keyWords[1] = keyWord1;
        keyWords[2] = keyWord2;
    }

    public void setKeyword1Helper (String keyWord, String[] keyWords){
        this.keyWord1 = keyWord;
        keyWords[0] = needCategory;
        keyWords[1] = keyWord1;
        keyWords[2] = keyWord2;
    }

    public void setKeyword2Helper (String keyWord, String[] keyWords){
        this.keyWord2 = keyWord;
        keyWords[0] = needCategory;
        keyWords[1] = keyWord1;
        keyWords[2] = keyWord2;
    }

}


