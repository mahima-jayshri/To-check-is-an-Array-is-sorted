# To-check-is-an-Array-is-sorted
## 🔍 Description

`ArraySortedChecker` is a simple and efficient Java utility that checks whether a given integer array is **sorted in non-decreasing (ascending) order**. This can be useful in a wide variety of scenarios including validating sorted input, preprocessing for binary search, or as part of algorithm correctness checks.

---
## 🛠 How It Works

1. The program defines a method `isSorted(int[] arr)` which takes an integer array as input.
2. It loops through the array elements and compares each element with its next neighbor.
3. If it finds any element greater than the next one (`arr[i] > arr[i + 1]`), it concludes that the array is not sorted and returns `false`.
4. If no such pair is found, it returns `true`, meaning the array is sorted in ascending order.

---
## complexity Analysis

Time Complexity: O(n) -> 	One linear scan of the array
Space complexity: O(1) -> Constant space — no additional data structures
