public int[] invertirArreglo(int[] arreglo) {
    if (arreglo == null) return new int[0];
    int[] invertido = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
        invertido[i] = arreglo[arreglo.length - 1 - i];
    }
    return invertido;
}