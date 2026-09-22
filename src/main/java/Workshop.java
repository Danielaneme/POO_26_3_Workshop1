public double areaCirculo(double radio) {
    if (radio < 0) {
        throw new IllegalArgumentException("El radio no puede ser negativo");
    }
    return Math.PI * radio * radio;
}