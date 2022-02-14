package com.example.demo;

/**
 * packageName: com.example.demo
 * fileName        : Test
 * author          : codejihyekim
 * date            : 2022-02-12
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-12         codejihyekim      최초 생성
 */
public class Test {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length;i++){
            arr[i] = (int)(Math.random()*100)+1;
            for (int j =0; j <i;j++){
                if(arr[i]==arr[j]){
                    i--;break;
                }
            }
        }

        quick_Sort(arr, 0, arr.length - 1);
        output(arr);
    }

    private static void quick_Sort(int[] arr, int start, int end) {

        int left = start;
        int right = end;
        /*pivot을 중앙 값으로 셋팅*/
        int pivot = arr[(left + right) / 2];

        do {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        } while (left <= right);

        if (start < right) {
            quick_Sort(arr, start, right);

        }
        if (end > left) {
            quick_Sort(arr, left, end);
        }
    }

    private static void output(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
