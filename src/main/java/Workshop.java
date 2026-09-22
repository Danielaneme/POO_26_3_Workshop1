package com.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Workshop {

    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (n == 0) return new int[0];
        int[] fib = new int[n];
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public int sumaElementos(int[] arreglo) {
        if (arreglo == null) return 0;
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0.0;
        double suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0;
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0;
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {
        if (arreglo == null) return false;
        for (int num : arreglo) {
            if (num == elemento) return true;
        }
        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {
        if (arreglo == null) return new int[0];
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null) return new int[0];
        int[] ordenado = arreglo.clone();
        Arrays.sort(ordenado);
        return ordenado;
    }

    public int[] eliminarDuplicados(int[] arreglo) {
        if (arreglo == null) return new int[0];
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arreglo) {
            set.add(num);
        }
        int[] resultado = new int[set.size()];
        int index = 0;
        for (int num : set) {
            resultado[index++] = num;
        }
        return resultado;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1 == null) arreglo1 = new int[0];
        if (arreglo2 == null) arreglo2 = new int[0];
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
        return combinado;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo == null || arreglo.length == 0) return new int[0];
        int n = arreglo.length;
        posiciones = posiciones % n;
        if (posiciones < 0) posiciones += n;
        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            rotado[i] = arreglo[(i + posiciones) % n];
        }
        return rotado;
    }

    public int contarCaracteres(String cadena) {
        if (cadena == null) return 0;
        return cadena.length();
    }

    public String invertirCadena(String cadena) {
        if (cadena == null) return "";
        return new StringBuilder(cadena).reverse().toString();
    }

    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String limpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }

    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }

    public String convertirAMayusculas(String cadena) {
        if (cadena == null) return "";
        return cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {
        if (cadena == null) return "";
        return cadena.toLowerCase();
    }

    public String reemplazarSubcadena(String cadena, String vieja, String nueva) {
        if (cadena == null || vieja == null || nueva == null) return "";
        return cadena.replace(vieja, nueva);
    }

    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) return -1;
        return cadena.indexOf(subcadena);
    }

    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return correo.matches(regex);
    }

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma / lista.size();
    }

    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccion) {
        if (eleccion == null) return "";
        String el = eleccion.toLowerCase();
        switch (el) {
            case "piedra": return "Empate";
            case "papel": return "Ganaste";
            case "tijera": return "Perdiste";
            case "lagarto": return "Ganaste";
            case "spock": return "Perdiste";
            default: return "Opción no válida";
        }
    }

    public String pptls2(String[] game) {
        if (game == null || game.length < 2) return "";
        String p1 = game[0].toLowerCase();
        String p2 = game[1].toLowerCase();
        if (p1.equals(p2)) return "Empate";
        if ((p1.equals("tijera") && (p2.equals("papel") || p2.equals("lagarto"))) ||
            (p1.equals("papel") && (p2.equals("piedra") || p2.equals("spock"))) ||
            (p1.equals("piedra") && (p2.equals("lagarto") || p2.equals("tijera"))) ||
            (p1.equals("lagarto") && (p2.equals("spock") || p2.equals("papel"))) ||
            (p1.equals("spock") && (p2.equals("tijera") || p2.equals("piedra")))) {
            return "Jugador 1";
        }
        return "Jugador 2";
    }

    public double areaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * radio * radio;
    }

    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException("Fecha no válida");
        }
        switch (month) {
            case 1:  return (day <= 19) ? "Capricornio" : "Acuario";
            case 2:  return (day <= 18) ? "Acuario" : "Piscis";
            case 3:  return (day <= 20) ? "Piscis" : "Aries";
            case 4:  return (day <= 19) ? "Aries" : "Tauro";
            case 5:  return (day <= 20) ? "Tauro" : "Géminis";
            case 6:  return (day <= 20) ? "Géminis" : "Cáncer";
            case 7:  return (day <= 22) ? "Cáncer" : "Leo";
            case 8:  return (day <= 22) ? "Leo" : "Virgo";
            case 9:  return (day <= 22) ? "Virgo" : "Libra";
            case 10: return (day <= 22) ? "Libra" : "Escorpio";
            case 11: return (day <= 21) ? "Escorpio" : "Sagitario";
            case 12: return (day <= 21) ? "Sagitario" : "Capricornio";
            default: return "";
        }
    }

}