public String pptls2(String[] game) {
    if (game == null || game.length < 2) return "";
    String p1 = game[0].toLowerCase();
    String p2 = game[1].toLowerCase();
    if (p1.equals(p2)) return "Empate";
    if ((p1.equals("tijera") && (p2.equals("papel") || p2.equals("lagarto"))) ||
        (p1.equals("papel") && (p2.equals("piedra") || p2.equals("spock"))) ||
        (p1.equals("piedra") && (p2.equals("lagarto") || p2.equals("tijera"))) ||
        (p1.equals("lagarto") && (p2.equals("spock") || p2.equals("papel"))) ||
        (p1.equals("spock") && (p2.equals("tijera") || p2.equals("piedra")))) {
        return "Jugador 1";
    }
    return "Jugador 2";
}