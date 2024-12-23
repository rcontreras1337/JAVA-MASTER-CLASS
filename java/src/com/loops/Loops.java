package com.loops;

import java.util.Arrays;

public class Loops {
    public static void ejercicioUno(){
        int [] intArray = new int [3];
        System.out.printf("IntArray: %d\n", intArray.length);
        System.out.println("IntArray: " + Arrays.toString(intArray));
    }

    public static void ejercicioDos(){
        int [] intArray = new int [3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 4;
        }
        System.out.println("IntArray: " + Arrays.toString(intArray));
    }

    public static void ejercicioTres(){
        int [] intArray = new int [3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 4;
        }
        intArray[1] = 17;
        System.out.println("IntArray: " + Arrays.toString(intArray));
    }

    public static void ejercicioCuatro(){
        String [] stringArray = {"a","b","c","d"};
        System.out.printf("StringArray: %s\n", Arrays.toString(stringArray));
        String [] stringArray2 = stringArray;
        stringArray2[0] = "z";
        System.out.println("StringArray: " + Arrays.toString(stringArray2));
    }

    public static void ejercicioCinco(){
        // Declare and initialize the original String array
        String[] stringArray = {"a", "b", "c", "d"};

        // Create a second array initialized using the original array (not a copy)
        String[] newArray = stringArray;

        // Create a copy of the original array and assign it to another array
        String[] copiedArray = Arrays.copyOf(stringArray, stringArray.length);

        // Change the value at index 0 of the copied array to "z"
        copiedArray[0] = "z";

        // Print the contents of the original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(stringArray));

        // Print the contents of the copied array
        System.out.println("\nCopied Array:");
        System.out.println(Arrays.toString(copiedArray));
    }

    public static void ejercicioSeis(){
        String[] stringArray = {"you", "are", "how", "hello"};
        String resultado = "";
        for (int i = stringArray.length-1; i >= 0; i--) {
            resultado += stringArray[i];
            if(i != 0){
                resultado +=" ";
            }
        }
        resultado += "?";
        System.out.println("Resultado: " + resultado);
    }

    public static void ejercicioSiete(){
     /*
        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip:
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.split(", ")
        - then loop.
        - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
    */
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] numbers = input.split(", ");
        for (int i = 0; i < numbers.length; i++) {
            result += Double.parseDouble(numbers[i]);
        }
        System.out.println("Resultado: " + result);
    }

}
