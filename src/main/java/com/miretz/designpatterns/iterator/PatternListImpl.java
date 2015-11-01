package com.miretz.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miretz on 28. 10. 2015.
 */
public class PatternListImpl implements PatternList {

    List<DesignPattern> patternList;

    public PatternListImpl(){
        patternList = new ArrayList<>();
    }

    @Override
    public void addPattern(final DesignPattern pattern) {
        patternList.add(pattern);
    }

    @Override
    public void removePattern(final DesignPattern pattern) {
        patternList.remove(pattern);
    }

    @Override
    public PatternIterator getPatternIterator() {
        return new PatternIteratorImpl(patternList);
    }
}
