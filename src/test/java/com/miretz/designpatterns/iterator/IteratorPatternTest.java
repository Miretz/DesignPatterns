package com.miretz.designpatterns.iterator;

import org.junit.Test;

import com.miretz.designpatterns.iterator.DesignPattern;
import com.miretz.designpatterns.iterator.PatternIterator;
import com.miretz.designpatterns.iterator.PatternList;
import com.miretz.designpatterns.iterator.PatternListImpl;

public class IteratorPatternTest {

    @Test
    public void iteratorPatternTest() {

        DesignPattern pattern1 = new DesignPattern("Creational", "Factory Method");
        DesignPattern pattern2 = new DesignPattern("Creational", "Abstract Factory");
        DesignPattern pattern3 = new DesignPattern("Structural", "Adapter");
        DesignPattern pattern4 = new DesignPattern("Structural", "Bridge");
        DesignPattern pattern5 = new DesignPattern("Behavioral", "Chain of Responsibility");
        DesignPattern pattern6 = new DesignPattern("Behavioral", "Iterator");

        PatternList patternList = new PatternListImpl();
        patternList.addPattern(pattern1);
        patternList.addPattern(pattern2);
        patternList.addPattern(pattern3);
        patternList.addPattern(pattern4);
        patternList.addPattern(pattern5);
        patternList.addPattern(pattern6);

        System.out.println("-----Pattern list-----");
        printPatterns(patternList);

        patternList.removePattern(pattern1);
        patternList.removePattern(pattern2);

        System.out.println("-----Pattern list after removal operation-----");
        printPatterns(patternList);

    }

    private void printPatterns(PatternList patternAggregate) {
        PatternIterator patternIterator = patternAggregate.getPatternIterator();
        while (!patternIterator.isLastPattern()) {
            DesignPattern designPattern = patternIterator.nextPattern();
            System.out.println(designPattern.getPatternType() + " : " + designPattern.getPatternName());

        }
    }

}
