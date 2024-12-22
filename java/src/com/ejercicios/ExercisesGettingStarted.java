package com.ejercicios;

public class ExercisesGettingStarted {

    public static void numberOne(){
        System.out.println("I love cats");
//        System.out.println("I hate cats");
    }

    public static void numberTwo(){
         /*
            Write a program that compares two numbers. Use any comparison operator
            Create 3 variables.
            2 variables to store both numbers and 1 variable store the result
            Print the result
        */
        int  numeroUno = 4;
        int  numeroDos = 5;
        boolean resultado = numeroUno == numeroDos;
        System.out.println("El resultado es: " + resultado);
    }

    public static void numberThree(){
        String name = "Ruben Contreras";
        String title = "Hola Mundo";
        boolean resultado = name.equals(title);
        System.out.println("El resultado es: " + resultado);

    }

    public static void numberFour(){
        String name = "Amigoscode";
        System.out.println("El resultado es: " + name.toUpperCase());
    }

    public static void numberFive(){
        String name = "amigoscode";
        String resultado = name.substring(0,1).toUpperCase();
        resultado += name.substring(1);
        System.out.println("El resultado es: " + resultado);
    }

    public static void numberSix(){
        // Create variables to store the numbers and the result
        int number1 = 10;
        int number2 = 20;
        String result;

        // Compare the numbers using the comparison operator
        if (number1 > number2) {
            result = number1 + " is greater than " + number2;
        } else if (number1 < number2) {
            result = number1 + " is less than " + number2;
        } else {
            result = number1 + " is equal to " + number2;
        }

        // Print the result
        System.out.println(result);
    }
}
