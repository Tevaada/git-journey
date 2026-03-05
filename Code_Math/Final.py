"""
Fibonacci Algorithms Comparison
Methods included:
1. Iterative Method
2. Mathematical Formula using exp()
3. Recursive Method
"""

import time
import math

# -----------------------------
# 1. Iterative Method
# -----------------------------
def fibonacci_iterative(n):
    if n <= 1:
        return n

    prev, curr = 0, 1
    for _ in range(2, n + 1):
        prev, curr = curr, prev + curr

    return curr


# -----------------------------
# 2. Mathematical Formula using exp()
# -----------------------------
def fibonacci_formula_exp(n):
    sqrt5 = math.sqrt(5)
    phi = (1 + sqrt5) / 2
    psi = (1 - sqrt5) / 2

    result = (math.exp(n * math.log(phi)) -
              math.exp(n * math.log(abs(psi)))) / sqrt5

    return int(round(result))


# -----------------------------
# 3. Recursive Method
# -----------------------------
def fibonacci_recursive(n):
    if n <= 1:
        return n
    return fibonacci_recursive(n-1) + fibonacci_recursive(n-2)


# -----------------------------
# Timing Function
# -----------------------------
def measure_time(func, n):
    start = time.perf_counter()
    result = func(n)
    end = time.perf_counter()

    return result, end - start


# -----------------------------
# Run Comparison
# -----------------------------
def compare_methods(n):

    methods = [
        ("Iterative Method", fibonacci_iterative, "O(n)"),
        ("Formula using exp()", fibonacci_formula_exp, "≈ O(1)"),
        ("Recursive Method", fibonacci_recursive, "O(2^n)")
    ]

    print(f"\nComputing Fibonacci({n})\n")
    print("{:<25} {:<15} {:<15} {:<10}".format(
        "Method", "Result", "Time (seconds)", "Complexity"))
    print("-" * 65)

    for name, func, complexity in methods:
        result, duration = measure_time(func, n)
        print("{:<25} {:<15} {:<15.10f} {:<10}".format(
            name, result, duration, complexity))


# -----------------------------
# Main Program
# -----------------------------
if __name__ == "__main__":

    n = int(input("Enter Fibonacci index (n): "))

    if n < 0:
        print("Please enter a non-negative integer.")
    else:
        compare_methods(n)