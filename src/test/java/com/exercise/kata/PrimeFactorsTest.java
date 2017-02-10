package com.exercise.kata;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by David_Mogyorosi on 2/10/2017.
 */
public class PrimeFactorsTest {

    PrimeFactors underTest;

    @Before
    public void setup() {
        underTest = new PrimeFactors();
    }


    @Test
    public void emptyListWhenTheInputIsOne() {
        //GIVEN

        //WHEN
        Integer input = 1;
        //THEN
        assertEquals(Collections.emptyList(), underTest.getListOfFactors(input));

    }

    @Test
    public void emptyListWhenTheInputIsLessThanZero() {
        //GIVEN

        //WHEN
        Integer input = -1;
        //THEN
        assertEquals(Collections.emptyList(), underTest.getListOfFactors(input));
    }

    @Test
    public void twoHasOnlyTwoAsPrimeFactor() {
        //GIVEN

        //WHEN
        Integer input = 2;
        //THEN
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, underTest.getListOfFactors(input));
    }

    @Test
    public void threeHasOnlyThreeAsFactor() {
        //GIVEN
        //WHEN
        Integer input = 3;
        //THEN
        List<Integer> expected = new ArrayList<>(Arrays.asList(3));
        assertEquals(expected, underTest.getListOfFactors(input));
    }

    @Test
    public void tenHasTwoAndFiveAsFactors() {
        //GIVEN
        //WHEN
        Integer input = 10;
        //THEN
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 5));
        assertEquals(expected, underTest.getListOfFactors(input));
    }

    @Test
    public void thirteenHasOnlyThirteenAsPrimeFactor() {
        //GIVEN
        //WHEN
        Integer input = 13;
        //THEN
        List<Integer> expected = new ArrayList<>(Arrays.asList(13));
        assertEquals(expected, underTest.getListOfFactors(input));
    }
}

