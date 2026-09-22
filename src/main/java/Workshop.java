public String reemplazarSubcadena(String cadena, String vieja, String nueva) {
    if (cadena == null || vieja == null || nueva == null) return "";
    return cadena.replace(vieja, nueva);
}