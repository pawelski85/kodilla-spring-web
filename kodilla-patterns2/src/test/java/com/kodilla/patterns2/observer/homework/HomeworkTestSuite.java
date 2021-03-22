package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Homework potions = new PotionsHomework();
        Homework careMagical = new CareOfMagicalCreaturesHomework();
        Homework history = new HistoryOfMagic();
        Mentor Snape = new Mentor("Severus Snape");
        Mentor Binns = new Mentor("Cuthbert Binns");
        Mentor Dumbledore = new Mentor("Albus Percival Wulfryk Brian Dumbledore");
        Mentor Hagrid = new Mentor("Rubeus Hagrid");
        potions.registerObserver(Snape);
        potions.registerObserver(Dumbledore);
        careMagical.registerObserver(Hagrid);
        careMagical.registerObserver(Dumbledore);
        history.registerObserver(Binns);
        history.registerObserver(Dumbledore);

        //When
        potions.addHomework("Harry's \'Everlasting Potions\'");
        potions.addHomework("Hermione's \'Hair-raising Potions\'");
        history.addHomework("Hermione's \'the Medieval Assembly of European Wizards.\'");
        careMagical.addHomework("Harry's \'Blast-Ended Skrewt's behaviour\'");
        potions.addHomework("Malfoy's \'Half-rising Potions\'");
        history.addHomework("Hermione's \'Goblin Rebellions.\'");
        careMagical.addHomework("Ron's \'Flobberworms\'");
        potions.addHomework("Hermione's \'Antidotes\'");
        potions.addHomework("Ron's \'The properties of Moonstone and its uses in Potion making\'");

        //Then
        assertEquals(5, Snape.getUpdateCount());
        assertEquals(2, Hagrid.getUpdateCount());
        assertEquals(2,Binns.getUpdateCount());
        assertEquals(9, Dumbledore.getUpdateCount());
    }


}
