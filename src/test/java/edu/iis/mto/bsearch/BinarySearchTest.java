package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

    @Test
    public void sequenceShouldHaveOneItemAndSearchElementIsInIt() {

        int[] sequence = {8};
        int searchElement = 8;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        assertThat(result.isFound(),is(true));

    }

    @Test
    public void sequenceShouldHaveOneItemAndSearchElementIsNotInIt() {

        int[] sequence = {8};
        int searchElement = 5;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        assertThat(result.isFound(),is(false));
    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsFirst() {

        int[] sequence = {1,4,6,7,8,10,22,60};
        int searchElement = 1;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        assertThat(result.isFound(),is(true));
        assertThat(result.getPosition(),is(1));
    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsLast() {

        int[] sequence = {1,4,6,7,8,10,22,60};
        int searchElement = 60;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        assertThat(result.isFound(),is(true));
        assertThat(result.getPosition(),is(8));
    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndEvenSizeOfItAndSearchElementIsInMiddle() {
        int[] sequence = {1,4,5,6,7,8,9,10,22,60};
        int searchElement = 7;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        assertThat(result.isFound(),is(true));
        assertThat(result.getPosition(),is(5));
    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndOddSizeOfItAndSearchElementIsInMiddle() {
        int[] sequence = {1,4,5,6,7,2,8,10,22,60};
        int searchElement = 7;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        assertThat(result.isFound(),is(true));
        assertThat(result.getPosition(),is(5));
    }

    @Test
    public void sequenceShouldHaveMoreThanOneItemAndSearchElementIsNotInIt() {

        int[] sequence = {1,4,5,6,7,8,10,22,60};
        int searchElement = 0;

        SearchResult result = BinarySearch.search(searchElement, sequence);
        assertThat(result.isFound(),is(false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumnetExceptionIfSeguenceIsEmpty(){
        int [] sequence = {};
        int searchElement = 0;

        BinarySearch.search(searchElement, sequence);
    }

}