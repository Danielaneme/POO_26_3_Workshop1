public int buscarSubcadena(String cadena, String subcadena) {
    if (cadena == null || subcadena == null) return -1;
    return cadena.indexOf(subcadena);
}