public class demoArray {
    public static void main(String[] args) {
        int[] arr = array();
        printArray(arr);
        int max = maxValue(arr);
        System.out.printf("Số lớn nhất là %d",max);
    }
    public static int[] array() {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] =(int) Math.round(Math.random()*100);
        }
        return arr;
    }
    public static int maxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static void printArray(int[] array) {
        for (int x: array
        ) {
            System.out.println(x + "    ");
        };
    }
}