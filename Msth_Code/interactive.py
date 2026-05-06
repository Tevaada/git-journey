"""
Iterative Linear-Time Method for calculating Fibonacci numbers
Time Complexity: O(n)
"""
import time


def fibonacci_iterative(n):
    """Calculate nth Fibonacci number using iteration (linear time)"""
    if n <= 1:
        return n
    
    prev, curr = 0, 1
    for _ in range(2, n + 1):
        prev, curr = curr, prev + curr
    
    return curr


def run_iterative(n):
    """Run iterative method and measure time"""
    start_time = time.time()
    result = fibonacci_iterative(n)
    end_time = time.time()
    duration = end_time - start_time
    
    return {
        'method': 'Iterative (Linear-Time)',
        'result': result,
        'duration': duration
    }


if __name__ == "__main__":
    n = 30
    print(f"Calculating Fibonacci({n}) using Iterative Method")
    stats = run_iterative(n)
    print(f"Result: {stats['result']}")
    print(f"Duration of iteractive: {stats['duration']:.8f} seconds")