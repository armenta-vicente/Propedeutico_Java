package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String input;
        String inputLowerCase;
        String input;
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa un dato a evaluar -> ");
        input = ob.readLine();
        inputLowerCase = input.toLowerCase();

        if(inputLowerCase.length() == 0){
            System.out.println("No ingresaste ningun dato");
        }
        else if(inputLowerCase.length() < 2){
            switch(inputLowerCase){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":{
                    System.out.println("El dato que ingresaste '" + input + "', es una vocal");
                    break;
                }
                case "b":
                case "c":
                case "d":
                case "f":
                case "g":
                case "h":
                case "j":
                case "k":
                case "l":
                case "m":
                case "n":
                case "p":
                case "q":
                case "r":
                case "s":
                case "t":
                case "v":
                case "x":
                case "w":
                case "y":
                case "z":{
                    System.out.println("El dato que ingresaste '" + input + "', es una consonante.");
                    break;
                }
                default: {
                    System.out.println("El dato que ingresaste '" + input + "', es un caracter.");
                }
            }
        }
        else {
            try {
                Integer.parseInt(inputLowerCase);
                System.out.println("El dato que ingresaste '" + input + "', es numerico");
            }
            catch (NumberFormatException e) {
                System.out.println("El dato que ingresaste '" + input + "', no se pudo evaluar");
            }
        }
    }
}