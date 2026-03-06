import time


def fibonacci_recursive(n):
    """Calculate nth Fibonacci number using recursion"""
    if n <= 1:
        return n
    return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2)


def run_recursive(n):
    """Run recursive method and measure time"""
    start_time = time.time()
    result = fibonacci_recursive(n)
    end_time = time.time()
    duration = end_time - start_time
    
    return {
        'method': 'Recursive',
        'result': result,
        'duration': duration
    }

if __name__ == "__main__":
    n = 30
    print(f"Calculating Fibonacci({n}) using Recursive Method")
    stats = run_recursive(n)
    print(f"Result: {stats['result']}")
    print(f"Duration Recursive: {stats['duration']:.8f} seconds")
