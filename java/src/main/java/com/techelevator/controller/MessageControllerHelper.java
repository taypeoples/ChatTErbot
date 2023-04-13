package com.techelevator.controller;

public class MessageControllerHelper {
    public String needCategory = "default";
    public String keyWord1 = "default";
    public String keyWord2 = "default";

    QuotesController quotesController = new QuotesController();

    public String filterQuote(String quote) {
        String[] inputArray = quote.toLowerCase().split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals("quote")) {
                // implement this for quotes service
            }
        }
        return null;
    }

    public String[] filterMessage(String message) {
        String[] keyWords = new String[3];
        String[] inputArray = message.toLowerCase().split(" ");
        for (String word : inputArray) {
            if (word.equals("quote")) {
                quotesController.getQuote();
                //do something here to make the quotes work?
                return null;
            } else if (needCategory.equals("default") && keyWord1.equals("default") && keyWord2.equals("default")) {
                if (word.equals("pathway")) {
                    this.needCategory = "pathway";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("curriculum")) {
                    this.needCategory = "curriculum";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
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
                } else if (word.equals("cover")) {
                    this.keyWord1 = "cover";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("back")) {
                    this.needCategory = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("resume") && keyWord2.equals("default")) {
                if (word.equals("parts")) {
                    this.keyWord2 = "parts";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("links")) {
                    this.keyWord2 = "links";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("back")) {
                    this.keyWord1 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("cover") && keyWord2.equals("default")) {
                if (word.equals("parts")) {
                    this.keyWord2 = "parts";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("links")) {
                    this.keyWord2 = "links";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("back")) {
                    this.keyWord1 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("default")) {
                if (word.equals("prep")) {
                    this.keyWord2 = "prep";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("follow")) {
                    this.keyWord2 = "follow";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("star")) {
                    this.keyWord2 = "star";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("outfit")) {
                    this.keyWord2 = "outfit";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }else if (word.equals("back")) {
                    this.keyWord1 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("resume") && keyWord2.equals("parts")) {
                if (word.equals("back")) {
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("resume") && keyWord2.equals("links")) {
                if (word.equals("back")) {
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("cover") && keyWord2.equals("parts")) {
                if (word.equals("back")) {
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("cover") && keyWord2.equals("links")) {
                if (word.equals("back")) {
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("prep")) {
                if (word.equals("back")) {
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("follow")) {
                if (word.equals("back")) {
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("stars")) {
                if (word.equals("back")) {
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            } else if (needCategory.equals("pathway") && keyWord1.equals("interview") && keyWord2.equals("outfit")) {
                if (word.equals("back")) {
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                } else if (word.equals("home")) {
                    this.needCategory = "default";
                    this.keyWord1 = "default";
                    this.keyWord2 = "default";
                    keyWords[0] = needCategory;
                    keyWords[1] = keyWord1;
                    keyWords[2] = keyWord2;
                    return keyWords;
                }
            }
        }
        return null;
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
