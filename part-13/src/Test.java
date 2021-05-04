public class Test {
    public static int search(int arr[], int x){
        int holder = -1;
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] == x) {
                count += 1;
            }
        } return count;
    }
    public static int searchSecondMin(int arr[]) {
        int n = arr.length;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;
        minIndex = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        } return arr[minIndex];
    }

    public static void main(String[] args) {
        int arr[] = {19,4,10,9,6,3,7,8};
        int x = 6;
        int rs = search(arr,x);
        System.out.println(searchSecondMin(arr));
        if (rs == -1) {
            System.out.println("Không tồn tại");
        }
//        } else System.out.println("Giá trị x = " + x + "  ở vị trí: " + rs);
//        else System.out.println(rs);
    }
}

