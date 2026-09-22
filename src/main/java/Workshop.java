public long factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("El número no puede ser negativo");
    }
    long fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}