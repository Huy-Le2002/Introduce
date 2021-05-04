public class BinarySearchingRecursive {
//    public static int arr[] = {2,6,9,14,19,24,32,84};
    public static int binarySearch(int arr[],int key) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else return mid;
        } 
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,6,9,14,19,24,32,84};
        System.out.println(binarySearch(arr,6));
        System.out.println(binarySearch(arr,14));
        System.out.println(binarySearch(arr,24));
        System.out.println(binarySearch(arr,84));
        System.out.println(binarySearch(arr,99));
    }
}
