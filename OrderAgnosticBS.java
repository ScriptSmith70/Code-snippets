public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrAsc = {1, 3, 5, 7, 9, 11, 13};
        int[] arrDesc = {20, 15, 10, 5, 0, -5, -10};

        int target1 = 7;
        int target2 = -5;

        System.out.println(orderAgnosticBS(arrAsc, target1));   
        System.out.println(orderAgnosticBS(arrDesc, target2)); 
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { 
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
