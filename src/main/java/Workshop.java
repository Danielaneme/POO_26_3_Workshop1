import java.util.*;

public class Workshop {

    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    public int mayorDeTresNumeros(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Número negativo");
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Número negativo");
        int[] fib = new int[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) suma += num;
        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0.0;
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int num : arreglo) {
            if (num > mayor) mayor = num;
        }
        return mayor;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int num : arreglo) {
            if (num < menor) menor = num;
        }
        return menor;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento) return true;
        }
        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        int[] ordenado = arreglo.clone();
        Arrays.sort(ordenado);
        return ordenado;
    }

    public int[] eliminarDuplicados(int[] arreglo) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arreglo) set.add(num);
        int[] resultado = new int[set.size()];
        int i = 0;
        for (int num : set) resultado[i++] = num;
        return resultado;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
        return combinado;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        if (n == 0) return arreglo;
        posiciones = posiciones % n;
        if (posiciones < 0) posiciones += n;
        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            rotado[i] = arreglo[(i + posiciones) % n];
        }
        return rotado;
    }

    public int contarCaracteres(String cadena) {
        return cadena != null ? cadena.length() : 0;
    }

    public String invertirCadena(String cadena) {
        return cadena != null ? new StringBuilder(cadena).reverse().toString() : "";
    }

    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String limpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return limpia.equals(new StringBuilder(limpia).reverse().toString());
    }

    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    public String convertirAMayusculas(String cadena) {
        return cadena != null ? cadena.toUpperCase() : "";
    }

    public String convertirAMinusculas(String cadena) {
        return cadena != null ? cadena.toLowerCase() : "";
    }

    public String reemplazarSubcadena(String cadena, String vieja, String nueva) {
        return cadena != null ? cadena.replace(vieja, nueva) : "";
    }

    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) return -1;
        return cadena.indexOf(subcadena);
    }

    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double suma = 0;
        for (int num : lista) suma += num;
        return suma / lista.size();
    }

    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccion) {
        if (eleccion == null) return "Elección inválida";
        String p1 = eleccion.toLowerCase();
        List<String> opciones = Arrays.asList("piedra", "papel", "tijera", "lagarto", "spock");
        if (!opciones.contains(p1)) return "Elección inválida";
        String pc = opciones.get(new Random().nextInt(opciones.size()));
        if (p1.equals(pc)) return "Empate";
        
        if ((p1.equals("tijera") && (pc.equals("papel") || pc.equals("lagarto"))) ||
            (p1.equals("papel") && (pc.equals("piedra") || pc.equals("spock"))) ||
            (p1.equals("piedra") && (pc.equals("lagarto") || pc.equals("tijera"))) ||
            (p1.equals("lagarto") && (pc.equals("spock") || pc.equals("papel"))) ||
            (p1.equals("spock") && (pc.equals("tijera") || pc.equals("piedra")))) {
            return "Ganaste";
        }
        return "Perdiste";
    }

    public String pptls2(String[] game) {
        if (game == null || game.length < 2) return "Empate";
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
        if (radio < 0) throw new IllegalArgumentException("Radio negativo");
        return Math.PI * radio * radio;
    }

    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12 || day < 1 || day > 31) return "Fecha inválida";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Géminis";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cáncer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Escorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagitario";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricornio";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Acuario";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Piscis";

        return "Fecha inválida";
    }
}