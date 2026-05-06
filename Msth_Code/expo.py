"""
Mathematical Formula Method (using exponentials) for calculating Fibonacci numbers
Uses Binet's formula with Math.exp
"""
import time
import math


def fibonacci_formula(n):
    """
    Calculate nth Fibonacci number using Binet's formula
    Uses mathematical exponentials (golden ratio)
    """
    # Golden ratio
    phi = (1 + math.sqrt(5)) / 2
    psi = (1 - math.sqrt(5)) / 2
    
    # Binet's formula
    result = (phi**n - psi**n) / math.sqrt(5)
    
    return int(round(result))


def fibonacci_formula_with_exp(n):
    """
    Alternative using math.exp for exponential calculation
    """
    sqrt5 = math.sqrt(5)
    phi = (1 + sqrt5) / 2
    
    # Using exp(n * log(phi)) instead of phi**n
    result = (math.exp(n * math.log(phi)) - math.exp(n * math.log((1 - sqrt5) / 2))) / sqrt5
    
    return int(round(result))


def run_formula(n):
    """Run mathematical formula method and measure time"""
    start_time = time.time()
    result = fibonacci_formula(n)
    end_time = time.time()
    duration = end_time - start_time
    
    return {
        'method': 'Mathematical Formula (Exponential)',
        'result': result,
        'duration': duration
    }


if __name__ == "__main__":
    n = 30
    print(f"Calculating Fibonacci({n}) using Mathematical Formula (with exponentials)")
    stats = run_formula(n)
    print(f"Result: {stats['result']}")
    print(f"Duration Exponential: {stats['duration']:.8f} seconds")