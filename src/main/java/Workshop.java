public double promedioElementos(int[] arreglo) {
    if (arreglo == null || arreglo.length == 0) return 0.0;
    double suma = 0;
    for (int num : arreglo) {
        suma += num;
    }
    return suma / arreglo.length;
}