public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
    if (arreglo1 == null) arreglo1 = new int[0];
    if (arreglo2 == null) arreglo2 = new int[0];
    int[] combinado = new int[arreglo1.length + arreglo2.length];
    System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
    System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
    return combinado;
}