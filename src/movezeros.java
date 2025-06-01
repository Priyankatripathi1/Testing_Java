public class movezeros {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 0, 6};
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < n) {
            arr[index] = 0;
            index++;
        }
        System.out.println("Array after moving zeros to end");
        for (int num : arr) {
            System.out.println(num + "");
        }
    }
}