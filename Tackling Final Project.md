## Project Report on Enhancing Search Algorithms

### Thought Process:
1. **Understanding the Requirements**:
   - Initially ensured full comprehension of the assignment requirements and the starter code provided. This guided the planning for necessary modifications.

2. **Incremental Development**:
   - Approached the project incrementally, starting with simpler tasks like adding iteration counts to linear search and progressively tackling more complex tasks such as implementing recursive binary search and adding performance timings.

3. **Testing and Validation**:
   - After implementing each feature, tested the functionality to ensure it met expected outcomes, allowing for early identification and adjustment of any issues.

### Challenges and Solutions:
1. **Implementing Recursive Binary Search**:
   - **Challenge**: Transitioning from an iterative to a recursive method in binary search was complex, particularly in maintaining logic and efficiency.
   - **Solution**: Contacted fellow peers and used discord for assistance. After getting some tips from others, I started by understanding the core concept of recursion and its application to binary search, using pseudocode before actual coding to simplify the process.

2. **Robust Error Handling**:
   - **Challenge**: Ensuring the program could handle all types of user input errors, such as non-integer inputs and empty arrays, was challenging as it required anticipating various user behaviors.
   - **Solution**: Implemented checks using `Scanner`'s methods to validate inputs before processing them and used loops and conditions to re-prompt for correct input types as needed.

3. **Performance Comparison**:
   - **Challenge**: Accurately measuring and comparing the performance of different search algorithms was challenging, especially ensuring timing measurements were precise.
   - **Solution**: Used `System.nanoTime()` for high-resolution timing and performed multiple runs to ensure measurement consistency. Considered different test cases to reflect varied real-world usage scenarios.

### Reflections:
This project was a valuable learning experience, particularly in understanding and applying search algorithms and recursion. The challenges encountered pushed me to explore deeper into Java's capabilities and enhanced my problem-solving skills. Managing input errors and ensuring robust program design are practical skills that will benefit future projects.

By breaking down tasks, leveraging Java's functionalities, and iteratively testing and refining the code, I was able to successfully meet the project's objectives and gain deeper insights into algorithm efficiency and software development.
