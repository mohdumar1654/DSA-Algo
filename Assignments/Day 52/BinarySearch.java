public class BinarySearch {
    public static void main(String[] args) {

        // Here we have implemented Binary Search on a Sorted array
        // Notes Link :
        // https://scaler-production-new.s3.ap-southeast-1.amazonaws.com/attachments/attachments/000/045/134/original/Adv_BS1.pdf?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIDNNIRGHAQUQRWYA%2F20230530%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Date=20230530T162124Z&X-Amz-Expires=561600&X-Amz-SignedHeaders=host&X-Amz-Signature=7d71aec688846427b5f11a2dcf50061315e4c8515c1cc527e6a972a5ab3cbe5e

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 13;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                System.out.print(mid);
                break;
            }
            if (arr[mid] < k) {
                low = mid + 1;
            }
            if (arr[mid] > k) {
                high = mid - 1;
            }
        }
        System.out.print(-1);
    }
}
