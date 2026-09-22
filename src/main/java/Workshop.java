public int[] tablaMultiplicar(int numero, int limite) {
    int[] tabla = new int[limite];
    for (int i = 0; i < limite; i++) {
        tabla[i] = numero * (i + 1);
    }
    return tabla;
}