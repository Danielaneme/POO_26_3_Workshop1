public String invertirCadena(String cadena) {
    if (cadena == null) return "";
    return new StringBuilder(cadena).reverse().toString();
}