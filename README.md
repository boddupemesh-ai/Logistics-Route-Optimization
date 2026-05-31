# Logistics Route Optimization and Delivery Management System

## Project Overview

This project demonstrates the implementation and comparison of shortest path algorithms and sorting algorithms used in logistics, transportation, and routing systems. The system helps determine optimal delivery routes between warehouses and customer locations while efficiently organizing delivery records.

The project implements:

- Dijkstra's Algorithm
- Bellman-Ford Algorithm
- Floyd-Warshall Algorithm
- Merge Sort
- Quick Sort

These algorithms are widely used in GPS navigation, supply chain management, transportation networks, and logistics planning.

---

## Objectives

- Analyze shortest path algorithms for different graph types.
- Compare Dijkstra's, Bellman-Ford, and Floyd-Warshall algorithms.
- Implement route optimization techniques for logistics systems.
- Evaluate sorting algorithms for organizing delivery records.
- Compare Merge Sort and Quick Sort performance.
- Demonstrate real-world applications of graph and sorting algorithms.

---

## Algorithms Implemented

### 1. Dijkstra's Algorithm

**Purpose:**
Finds the shortest path from a source node to all other nodes in a weighted graph with non-negative edge weights.

**Applications:**
- GPS Navigation
- Route Planning
- Network Routing

**Complexity:**

```text
Time Complexity: O(V²)
```

---

### 2. Bellman-Ford Algorithm

**Purpose:**
Computes shortest paths even when negative edge weights exist.

**Applications:**
- Transportation Cost Optimization
- Financial Networks
- Dynamic Routing Systems

**Complexity:**

```text
Time Complexity: O(VE)
```

---

### 3. Floyd-Warshall Algorithm

**Purpose:**
Calculates shortest paths between every pair of vertices.

**Applications:**
- City-wide Traffic Analysis
- Transportation Networks
- Logistics Systems

**Complexity:**

```text
Time Complexity: O(V³)
```

---

### 4. Merge Sort

**Purpose:**
Efficiently sorts delivery records using the divide-and-conquer approach.

**Advantages:**
- Stable Sorting
- Guaranteed O(n log n)

**Complexity:**

```text
Time Complexity: O(n log n)
```

---

### 5. Quick Sort

**Purpose:**
Provides fast in-place sorting for large datasets.

**Advantages:**
- Efficient Average Performance
- Low Memory Usage

**Complexity:**

```text
Average Case: O(n log n)
Worst Case: O(n²)
```

---

## Sample Input

### Weighted Graph

```text
0 --4-- 1
|      / |
1    2   5
|  /     |
2 --8-- 3
```

### Delivery Distances

```text
45, 12, 89, 23, 5
```

---

## Expected Output

```text
Dijkstra Distances:
0 : 0
1 : 3
2 : 1
3 : 8

Bellman-Ford Distances:
0 : 0
1 : 3
2 : 1
3 : 8

Floyd-Warshall Completed

Merge Sort Completed
Quick Sort Completed
```

---

## Performance Analysis

| Algorithm | Time Complexity |
|------------|----------------|
| Dijkstra | O(V²) |
| Bellman-Ford | O(VE) |
| Floyd-Warshall | O(V³) |
| Merge Sort | O(n log n) |
| Quick Sort (Average) | O(n log n) |
| Quick Sort (Worst) | O(n²) |

Where:

- V = Number of vertices
- E = Number of edges
- n = Number of elements

---

## Comparison of Shortest Path Algorithms

| Feature | Dijkstra | Bellman-Ford | Floyd-Warshall |
|-----------|-----------|--------------|---------------|
| Weighted Graph | Yes | Yes | Yes |
| Directed Graph | Yes | Yes | Yes |
| Negative Weights | No | Yes | Yes |
| Negative Cycle Detection | No | Yes | No |
| All-Pairs Shortest Path | No | No | Yes |

---

## Applications

### Logistics and Transportation
- Delivery Route Optimization
- Fleet Management
- Warehouse Routing

### Network Systems
- Internet Routing
- Communication Networks

### Navigation Systems
- GPS Route Planning
- Smart Transportation Systems

### Data Processing
- Sorting Customer Orders
- Delivery Scheduling
- Shipment Prioritization

---

## Results

The implemented algorithms successfully optimized delivery routes and organized delivery records.

Key findings:

- Dijkstra's Algorithm efficiently handled positive-weight graphs.
- Bellman-Ford supported graphs with negative weights.
- Floyd-Warshall provided complete shortest-path information between all locations.
- Merge Sort guaranteed stable and consistent sorting performance.
- Quick Sort provided fast average-case sorting for large datasets.

---

## Conclusion

This project successfully demonstrates the implementation of shortest path and sorting algorithms in a logistics and delivery management environment. The comparison highlights the strengths and limitations of Dijkstra's, Bellman-Ford, and Floyd-Warshall algorithms for different graph types. Merge Sort and Quick Sort efficiently handled delivery record organization. These algorithms provide practical solutions for routing, transportation planning, and supply chain optimization.

