package src;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicioRecursividad {

    //Función para verificar si un número es primo
    public static boolean esPrimo (int num, int divisor) {
        if (divisor == 1) {
            return true; //Caso base: el número es primo si no tiene divisores diferentes de 1
        }
        if (num % divisor == 0) {
            return false; //El número no es primo si es divisible por un número diferente de 1 y por sí mismo
        }
        return esPrimo(num, divisor - 1); //Llamada recursiva con un divisor más pequeño
    }


    //Función para generar los primeros 'n' números primos
    public static ArrayList<Integer> generarPrimos (int n, int num) {
        ArrayList<Integer> primos = new ArrayList<>();

        if (n == 0) {
            return primos; //Caso base: no se generan más número primos
        }

        if (esPrimo(num, num / 2)) {
            primos.add(num); //Agregar número primo a la lista
            primos.addAll(generarPrimos(n - 1, num + 1)); //Llamada recursiva con el siguiente número
        } else {
            primos.addAll(generarPrimos(n, num + 1)); //Llamada recursiva con el siguiente número
        }
        return primos;
    }

    //ArrayList<Integer> se utiliza en Java para crear una lista dinámica que puede contener elementos enteros (Integer). Es una implementación de la interfaz List que utiliza un arreglo de tamaño dinámico para almacenar los elementos y permite el acceso aleatorio a través de índices.


    //Función para mostrar la sucesión de izquierda a derecha
    public static void mostrarSucesionIzquierda (ArrayList<Integer> sucesion) {
        System.out.println("Sucesión de izquierda a derecha:");

        for (int num : sucesion) {
            System.out.println(num + " ");
        }

        System.out.println();
    }

    //Función para mostrar la sucesión de derecha a izquierda
    public static void mostrarSucesionDerecha (ArrayList<Integer> sucesion) {
        System.out.println("Sucesión de derecha a izquierda:");

        for (int i = sucesion.size() - 1; i >= 0; i--) {
            System.out.println(sucesion.get(i) + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar al usuario la cantidad de números primos a generar
        System.out.println("Ingrese la cantidad de números primos a generar: ");
        int n = scanner.nextInt();

        //Generar la sucesión de números primos
        ArrayList<Integer> primos = generarPrimos(n, 2);

        //Mostrar la sucesión de izquierda a derecha
        mostrarSucesionIzquierda(primos);

        //Mostrar la sucesión de derecha a izquierda}
        mostrarSucesionDerecha(primos);

        scanner.close();
    }
}
