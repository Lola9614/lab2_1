package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void sequenceShouldHaveOneItemAndSearchElementIsInIt() {

        int[] sequence = {8};
        int searchElement = 8;

        Assert.assertEquals(1, sequence.length);

        SearchResult result = BinarySearch.search(searchElement, sequence);

        Assert.assertEquals(true, result.isFound());

    }

    @Test
    public void sequenceShouldHaveOneItemAndSearchElementIsNotInIt() {

    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsFirst() {

    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsLast() {

    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsInMiddle() {

    }

    @Test
    public void sequneceShouldHaveMoreThanOneItemAndSearchElementIsNotInIt() {

    }

}