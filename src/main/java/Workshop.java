public boolean esPalindromo(String cadena) {
    if (cadena == null) return false;
    String limpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String invertida = new StringBuilder(limpia).reverse().toString();
    return limpia.equals(invertida);
}