package com;

import com.ejercicios.ExercisesGettingStarted;
import com.loops.Loops;

public class Main {
    public static void main(String[] args) {
        //  PRIMITIVOS
        int number1 = 20;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println(result);
        double pi = 3.14159265358979;
        boolean isAdult = false;
        char a = 'A';
        // Guiones bajos para visibilizar mejor los numeros declarados
        // Sirve con varibels decimales tambien
        int amount = 1_000_000_008;
        // Ejericicios
        ExercisesGettingStarted.numberOne();
        ExercisesGettingStarted.numberTwo();
        ExercisesGettingStarted.numberThree();
        ExercisesGettingStarted.numberFour();
        ExercisesGettingStarted.numberFive();
        ExercisesGettingStarted.numberSix();
        // LOOPS
        Loops.ejercicioUno();
        Loops.ejercicioDos();
        Loops.ejercicioTres();
        Loops.ejercicioCuatro();
        Loops.ejercicioCinco();
        Loops.ejercicioSeis();
        Loops.ejercicioSiete();
}
}
