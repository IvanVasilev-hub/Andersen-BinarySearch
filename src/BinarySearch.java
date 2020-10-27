public class BinarySearch {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 7, -1};
    System.out.println(binarySearch(array, 2));
    System.out.println(binarySearch(array, 6));
    System.out.println(binarySearch(array, 0));
  }

  public static int binarySearch(int[] array, int elem) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (array[mid] == elem) {
        return mid;
      }

      if (elem < array[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    
    return -1;
  }

  public static int binarySearchRecursive(int[] array, int elem, int left, int right) {
    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (elem == array[mid]) {
      return mid;
    }

    if (elem < array[mid]) {
      return binarySearchRecursive(array, elem, left, mid - 1);
    } else {
      return binarySearchRecursive(array, elem, mid + 1, right);
    }
  }
}
