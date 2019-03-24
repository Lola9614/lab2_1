package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void sequenceShouldHaveOneItemAndSearchElementIsInIt() {

        int[] sequence = {8};
        int searchElement = 8;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        Assert.assertEquals(true, result.isFound());

    }

    @Test
    public void sequenceShouldHaveOneItemAndSearchElementIsNotInIt() {

        int[] sequence = {8};
        int searchElement = 5;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        Assert.assertEquals(false, result.isFound());

    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsFirst() {

        int[] sequence = {1,4,6,7,8,10,22,60};
        int searchElement = 1;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        Assert.assertEquals(true, result.isFound());
        Assert.assertEquals(1,result.getPosition());
    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsLast() {

        int[] sequence = {1,4,6,7,8,10,22,60};
        int searchElement = 60;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        Assert.assertEquals(true, result.isFound());
        Assert.assertEquals(8,result.getPosition());
    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsInMiddle() {
        int[] sequence = {1,4,5,6,7,8,10,22,60};
        int searchElement = 7;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        Assert.assertEquals(true, result.isFound());
        Assert.assertEquals(5,result.getPosition());

    }

    @Test
    public void sequneceShouldHaveMoreThanOneItemAndSearchElementIsNotInIt() {

    }

}