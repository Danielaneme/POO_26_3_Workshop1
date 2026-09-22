public boolean validarCorreoElectronico(String correo) {
    if (correo == null) return false;
    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    return correo.matches(regex);
}