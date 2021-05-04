public class DemoSequentialSearching {
    public static int search(int arr[], int x){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,6,10,9,3,7,8};
        int x = 9;
        int rs = search(arr,x);
        if (rs == -1) {
            System.out.println("Không tồn tại");
        } else System.out.println("Giá trị x = " + x + "  ở vị trí: " + rs);
    }
}
