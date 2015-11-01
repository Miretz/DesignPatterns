package com.miretz.designpatterns.iterator;

import java.util.List;

/**
 * Created by Miretz on 28. 10. 2015.
 */
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
        if (position < patternList.size()) {
            return false;
        }
        return true;
    }
}
