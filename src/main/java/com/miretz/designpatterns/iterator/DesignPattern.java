package com.miretz.designpatterns.iterator;

/**
 * Created by Miretz on 28. 10. 2015.
 */
//this object will be stored to the aggregate
public class DesignPattern {

    private final String patternType;
    private final String patternName;

    public DesignPattern(String patternType, String patternName){
        this.patternType = patternType;
        this.patternName = patternName;
    }

    public String getPatternType() {
        return patternType;
    }

    public String getPatternName() {
        return patternName;
    }
}
