public int[] ordenarArreglo(int[] arreglo) {
    if (arreglo == null) return new int[0];
    int[] ordenado = arreglo.clone();
    java.util.Arrays.sort(ordenado);
    return ordenado;
}