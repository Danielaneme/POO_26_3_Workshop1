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