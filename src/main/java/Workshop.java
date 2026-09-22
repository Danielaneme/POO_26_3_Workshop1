public boolean buscarElemento(int[] arreglo, int elemento) {
    if (arreglo == null) return false;
    for (int num : arreglo) {
        if (num == elemento) return true;
    }
    return false;
}