package Junit;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxFinder {


    public int[] findMinMax(int[] numberArray) {

        int[] finalArray = new int[2];
        int max = Arrays.stream(numberArray).max().getAsInt();
        int min = Arrays.stream(numberArray).min().getAsInt();

        finalArray[0] = max;
        finalArray[1] = min;

        return finalArray;

    }

    public MinMaxResult findMinMaxObject(int[] numberArray) {

        MinMaxResult minMaxResult = new MinMaxResult();


        int max = Arrays.stream(numberArray).max().getAsInt();
        int min = Arrays.stream(numberArray).min().getAsInt();

        minMaxResult.setMaxValue(max);
        minMaxResult.setMinValue(min);


        return minMaxResult;


    }
    class MinMaxResult
    {
        private int minValue, maxValue;

        public int getMinValue() {
            return minValue;
        }

        public void setMinValue(int minValue) {
            this.minValue = minValue;
        }

        public int getMaxValue() {
            return maxValue;
        }

        public void setMaxValue(int maxValue) {
            this.maxValue = maxValue;
        }
    }
}