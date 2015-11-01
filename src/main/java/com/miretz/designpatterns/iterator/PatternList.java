package com.miretz.designpatterns.iterator;

/**
 * Created by Miretz on 28. 10. 2015.
 */
public interface PatternList {

    void addPattern(DesignPattern pattern);

    void removePattern(DesignPattern pattern);

    PatternIterator getPatternIterator();

}
