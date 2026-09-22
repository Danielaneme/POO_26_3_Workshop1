public int sumaElementos(int[] arreglo) {
    if (arreglo == null) return 0;
    int suma = 0;
    for (int num : arreglo) {
        suma += num;
    }
    return suma;
}