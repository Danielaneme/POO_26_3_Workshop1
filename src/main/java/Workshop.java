public int contarPalabras(String cadena) {
    if (cadena == null || cadena.trim().isEmpty()) return 0;
    String[] palabras = cadena.trim().split("\\s+");
    return palabras.length;
}