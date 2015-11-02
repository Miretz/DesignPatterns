package com.miretz.designpatterns.decorator;

import org.junit.Test;

import com.miretz.designpatterns.decorator.AbstractBasket;
import com.miretz.designpatterns.decorator.ColorDecoration;
import com.miretz.designpatterns.decorator.PaperDecoration;
import com.miretz.designpatterns.decorator.PlasticBasket;
import com.miretz.designpatterns.decorator.RibbonDecoration;
import com.miretz.designpatterns.decorator.WoodenBasket;

public class DecoratorPatternTest {

    @Test
    public void testDecoratorPattern(){

        AbstractBasket undecoratedBasket = new WoodenBasket();
        System.out.println(undecoratedBasket.getDescription() + " $ " + undecoratedBasket.cost());

        AbstractBasket decoratedWoodenBasket = new WoodenBasket();
        decoratedWoodenBasket=new PaperDecoration(decoratedWoodenBasket);
        decoratedWoodenBasket=new RibbonDecoration(decoratedWoodenBasket);
        decoratedWoodenBasket=new ColorDecoration(decoratedWoodenBasket);
        System.out.println(decoratedWoodenBasket.getDescription() + " $ " + decoratedWoodenBasket.cost());

        AbstractBasket decoratedPlasticBasket = new PlasticBasket();
        decoratedPlasticBasket=new PaperDecoration(decoratedPlasticBasket);
        decoratedPlasticBasket=new RibbonDecoration(decoratedPlasticBasket);
        decoratedPlasticBasket=new ColorDecoration(decoratedPlasticBasket);
        System.out.println(decoratedPlasticBasket.getDescription() + " $ " + decoratedPlasticBasket.cost());
    }

}
