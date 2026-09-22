public String zoodiac(int day, int month) {
    if (month < 1 || month > 12 || day < 1 || day > 31) {
        throw new IllegalArgumentException("Fecha no válida");
    }
    switch (month) {
        case 1:  return (day <= 19) ? "Capricornio" : "Acuario";
        case 2:  return (day <= 18) ? "Acuario" : "Piscis";
        case 3:  return (day <= 20) ? "Piscis" : "Aries";
        case 4:  return (day <= 19) ? "Aries" : "Tauro";
        case 5:  return (day <= 20) ? "Tauro" : "Géminis";
        case 6:  return (day <= 20) ? "Géminis" : "Cáncer";
        case 7:  return (day <= 22) ? "Cáncer" : "Leo";
        case 8:  return (day <= 22) ? "Leo" : "Virgo";
        case 9:  return (day <= 22) ? "Virgo" : "Libra";
        case 10: return (day <= 22) ? "Libra" : "Escorpio";
        case 11: return (day <= 21) ? "Escorpio" : "Sagitario";
        case 12: return (day <= 21) ? "Sagitario" : "Capricornio";
        default: return "";
    }
}