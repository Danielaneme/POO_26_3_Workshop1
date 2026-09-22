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