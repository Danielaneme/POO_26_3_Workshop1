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