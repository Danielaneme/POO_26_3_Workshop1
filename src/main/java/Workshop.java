public int[] eliminarDuplicados(int[] arreglo) {
    if (arreglo == null) return new int[0];
    java.util.Set<Integer> set = new java.util.LinkedHashSet<>();
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