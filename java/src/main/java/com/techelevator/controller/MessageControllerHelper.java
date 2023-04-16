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
                    this.needCategory = "pathway";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("curriculum") || word.equals("coding") || word.equals("java") || word.equals("sql") || word.equals("database")
                        || word.equals("api") || word.equals("javascript") || word.equals("html") || word.equals("css") || word.equals("dao")
                        || word.equals("vue")) {
                    this.needCategory = "curriculum";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord1 = "resume";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("interview")) {
                    this.keyWord1 = "interview";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("cover") || word.equals("letter")) {
                    this.keyWord1 = "cover";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord2 = "parts";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("links") || word.equals("link") || word.equals("examples") || word.equals("example")) {
                    this.keyWord2 = "links";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord2 = "parts";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("links") || word.equals("link") || word.equals("examples") || word.equals("example")) {
                    this.keyWord2 = "links";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord2 = "prep";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("follow") || word.equals("up")) {
                    this.keyWord2 = "follow";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("star") || word.equals("questions")|| word.equals("question")) {
                    this.keyWord2 = "star";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("outfit") || word.equals("dress") || word.equals("clothes") || word.equals("clothing") || word.equals("wear")) {
                    this.keyWord2 = "outfit";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord1 = "java";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("client") || word.equals("server")) {
                    this.keyWord1 = "clientserver";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("web") || word.equals("app")) {
                    this.keyWord1 = "webapp";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("database") || word.equals("data") || word.equals("base") || word.equals("databases") ) {
                    this.keyWord1 = "databases";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord2 = "variables";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("arrays") || word.equals("array")) {
                    this.keyWord2 = "arrays";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("collections") || word.equals("collection")) {
                    this.keyWord2 = "collections";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("unit") || word.equals("testing") || word.equals("test")) {
                    this.keyWord2 = "unittesting";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("oop") || word.equals("object") || word.equals("oriented")) {
                    this.keyWord2 = "oop";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord2 = "api";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("dao")) {
                    this.keyWord2 = "dao";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("networking") || word.equals("network")) {
                    this.keyWord2 = "networking";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord2 = "css";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("html")) {
                    this.keyWord2 = "html";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("javascript") || word.equals("java") || word.equals("script")) {
                    this.keyWord2 = "javascript";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("vue")) {
                    this.keyWord2 = "vue";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                    this.keyWord2 = "sql";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("design")) {
                    this.keyWord2 = "databasedesign";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("security")) {
                    this.keyWord2 = "datasecurity";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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

}
