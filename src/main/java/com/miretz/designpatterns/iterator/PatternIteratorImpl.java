package com.miretz.designpatterns.iterator;

import java.util.List;

public class PatternIteratorImpl implements PatternIterator {

    List<DesignPattern> patternList;

    int position;
    DesignPattern designPattern;

    public PatternIteratorImpl(List<DesignPattern> patternList) {
        this.patternList = patternList;
    }

    @Override
    public DesignPattern nextPattern() {
        System.out.println("Returning pattern at position: " + position);
        designPattern = patternList.get(position);
        position++;
        return designPattern;
    }

    @Override
    public boolean isLastPattern() {
        return position >= patternList.size();
    }
}
