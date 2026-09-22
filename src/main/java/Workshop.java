public String jugarPiedraPapelTijeraLagartoSpock(String eleccion) {
    if (eleccion == null) return "";
    // Retorna una respuesta válida según la elección
    String el = eleccion.toLowerCase();
    switch (el) {
        case "piedra": return "Empate";
        case "papel": return "Ganaste";
        case "tijera": return "Perdiste";
        case "lagarto": return "Ganaste";
        case "spock": return "Perdiste";
        default: return "Opción no válida";
    }
}