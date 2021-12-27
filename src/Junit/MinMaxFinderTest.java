package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.lang.model.type.NullType;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class MinMaxFinderTest {

    @Test
    public void findMinOfGivenArray() {

        MinMaxFinder minMaxFinder = new MinMaxFinder();
        int[] sampleArray1 = {2, 5, 1, 7};
        int[] resultArray = minMaxFinder.findMinMax(sampleArray1);

        assertEquals(1, resultArray[1]);


    }

    @Test
    public void findMaxOfGivenArray() {

        MinMaxFinder minMaxFinder = new MinMaxFinder();
        int[] sampleArray1 = {2, 5, 1, 7};
        int[] resultArray = minMaxFinder.findMinMax(sampleArray1);

        assertEquals(7, resultArray[0]);


    }

    @Test(expected = NoSuchElementException.class)
    public void throwExceptionWhenArrayIsEmpty() {

        MinMaxFinder minMaxFinder = new MinMaxFinder();
        int[] array = {};
        minMaxFinder.findMinMax(array);


    }

    @Test
    public void findMinOfGivenArrayForQ2() {

        MinMaxFinder minMaxFinder = new MinMaxFinder();
        int[] sampleArray1 = {2, 5, 1, 7};

        MinMaxFinder.MinMaxResult minMaxObject = minMaxFinder.findMinMaxObject(sampleArray1);


        assertEquals(1, minMaxObject.getMinValue());


    }

    @Test
    public void findMaxOfGivenArrayForQ2() {

        MinMaxFinder minMaxFinder = new MinMaxFinder();
        int[] sampleArray1 = {2, 5, 1, 7};

        MinMaxFinder.MinMaxResult minMaxObject = minMaxFinder.findMinMaxObject(sampleArray1);


        assertEquals(7, minMaxObject.getMaxValue());


    }

    @Test(expected = NoSuchElementException.class)
    public void throwExceptionWhenArrayIsEmptyInQ2() {

        MinMaxFinder minMaxFinder = new MinMaxFinder();
        int[] array = {};
        minMaxFinder.findMinMaxObject(array);


    }
}