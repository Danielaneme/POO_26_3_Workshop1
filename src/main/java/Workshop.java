public int[] serieFibonacci(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("El número no puede ser negativo");
    }
    if (n == 0) return new int[0];
    int[] fib = new int[n];
    if (n >= 1) fib[0] = 0;
    if (n >= 2) fib[1] = 1;
    for (int i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib;
}