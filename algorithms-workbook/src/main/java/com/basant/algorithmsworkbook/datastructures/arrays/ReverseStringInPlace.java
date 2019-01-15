package com.basant.algorithmsworkbook.datastructures.arrays;

public class ReverseStringInPlace {

   public static char[] reverseString(char[] inputArray){

        for(int i=0,j=(inputArray.length-1);i<j;i++,j--){
            char temp;
            temp = inputArray[i];
            inputArray[i]=inputArray[j];
            inputArray[j]=temp;
        }
        return inputArray;
    }

    public static void main(String[] args) {
        char[] inputArr={'h','e','l','l','p'};
        System.out.println(reverseString(inputArr));
    }
}
