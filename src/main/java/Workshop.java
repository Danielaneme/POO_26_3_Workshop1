public double promedioLista(java.util.List<Integer> lista) {
    if (lista == null || lista.isEmpty()) return 0.0;
    double suma = 0;
    for (int num : lista) {
        suma += num;
    }
    return suma / lista.size();
}