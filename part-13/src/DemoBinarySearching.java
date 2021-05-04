public class DemoBinarySearching {

    // Trả về chỉ mục của x nếu nó có trong arr[l..r]
    // ngược lại trả về -1
    int binarySearch(int arr[], int l, int h, int x) {
        if (h >= l) {
            int mid = (l + h) / 2;

            // Nếu phần tử có ở chính giữa
            if (arr[mid] == x)
                return mid;

            // Nếu phần tử nhỏ hơn giữa, thì nó chỉ có thể
            // hiện diện trong mảng con bên trái
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Ngược lại, phần tử chỉ có thể có mặt
            // trong mảng con bên phải
            return binarySearch(arr, mid + 1, h, x);
        }

        // Nếu phầnt tử không có trong mảng
        return -1;
    }

    public static void main(String args[]) {
        DemoBinarySearching ob = new DemoBinarySearching();
        int arr[] = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Phần tử không tồn tại.");
        else
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
    }
}