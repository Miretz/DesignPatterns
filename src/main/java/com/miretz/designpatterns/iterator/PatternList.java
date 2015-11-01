package com.miretz.designpatterns.iterator;

public interface PatternList {

    void addPattern(DesignPattern pattern);

    void removePattern(DesignPattern pattern);

    PatternIterator getPatternIterator();

}
