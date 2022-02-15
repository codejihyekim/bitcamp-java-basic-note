package com.example.demo.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Feb10ServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         codejihyekim      최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {
    /** author       : 하진희
     * 1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
     * 2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
     * 3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
     * */
    @Override
    public void bubbleSort() {
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {
            arr[i]= (int)(Math.random()*100)+1;  //랜덤함수를 이용해 1~100까지의 정수 중 10개를 뽑는다.
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;  //숫자가 나오는 순서대로 중복되는 값이 있으면 그 자리에 다시 새로운 값이 들어오도록 한다.
                }
            }
        }
        int temp = 0;
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length-1; j++){ //1회전 후 가장 큰 수가 제일 뒤에 위치하면서 마지막 요소는 자연스럽게 정렬되므로 -1
                if(arr[j]>arr[j+1]){    //왼쪽값(j)이 오른쪽값(j+1)보다 크면
                    temp = arr[j];    //우선 temp에 arr[j] 값을 넣어두고
                    arr[j] = arr[j+1];  //비어있는 arr[j] 자리에 arr[j+1]값을 넣어준다.
                    arr[j+1] = temp;}    //마지막으로 temp에 있던 값을 비어있는 arr[j+1]자리에 넣어주면 두 숫자의 자리가 바뀐다.
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    /** author       : 하진희
     * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다.
     * 2. 첫 번째 타겟은 두 번째 원소부터 시작해 첫 번째 값과 비교한다.
     * 3. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
     * 4. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
     */
    @Override
    public void insertionSort() {
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {       //1~100까지의 정수 중 랜덤으로 10개 숫자 뽑기
            arr[i]= (int)(Math.random()*100)+1;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;
                }
            }
        }
        int temp = 0;
        int j = 0;
        for (int i=1; i<arr.length; i++) {  //0번은 정렬된 상태로 가정하고 1번 값부터 왼쪽에 있는 값들과 비교한다.
            temp = arr[i];  //현재 선택된 원소의 값을 temp 에 넣어준다.
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) { //j의 인덱스가 0이상이고 왼쪽값이 temp 값보다 크면 반복문을 실행한다.
                arr[j  + 1] = arr[j]; //조건에 부합하는 값을 만나면 그 값은 오른쪽으로 이동한다.
            } arr[j+1] = temp; //삽입할 자리를 찾으면 그곳에 temp 값을 넣어준다. 다시 위로 올라가 인덱스 2번 값부터 다시 반복한다.
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ "\t");
        }
    }
    /** author       : 하진희
     * 1. 주어진 리스트에서 최솟값을 찾는다.
     * 2. 최솟값을 맨 앞 자리의 값과 교환한다.
     * 3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
     * */
    @Override
    public void selectionSort() {
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {    //1~100까지의 정수 중 랜덤으로 10개 숫자 뽑기
            arr[i]= (int)(Math.random()*100)+1;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;
                }
            }
        }

        int min = 0;
        for (int i=0; i<arr.length-1; i++) {  //1~9회전을 하면 마지막 요소는 자연스럽게 정렬 되므로 -1
            min = i;                             //우선 i를 최솟값 변수에 저장해둔다. -> arr[min]
            for (int j=i+1; j<arr.length; j++) {   //arr[i+1]번째 원소부터 arr[min] 값과 비교한다.
                if (arr[min] > arr[j]) {         //arr[min]의 값이 arr[j]의 값보다 크면 arr[min]은 j가 된다.
                    min = j;                      //반복해서 비교하며 최종 최솟값을 찾아낸다.
                }
            }
            int temp = 0;
            temp = arr[min];        //temp에 최솟값을 넣어주고,
            arr[min] = arr[i];      //비어있는 arr[min] 자리에 arr[i]에 있던 값을 넣어준다.
            arr[i] = temp;       //다시 비어있는 arr[i]로 temp에 있던 최솟값을 넣어준다.
        }                          //이제 인덱스0번 자리는 최솟값이 들어갔고, 인덱스1번부터 다시 반복한다.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    /** author   : 김지혜
     * https://javaoop.tistory.com/8
     * 임의의 원소를 선택한 후 pivot으로 지정한다.
     * pivot의 왼쪽에는 pivot보다 작은 원소, 오른쪽에는 pivot보다 큰 원소들이 오도록 교환한다.
     * 하나의 pivot에 대해 정렬이 완료되면 피벗을 제외하고 왼쪽, 오른쪽의 리스크를 다시 정렬한다.
     * 분할된 리스트의 크기가 0이 될 때까지 반복한다.
     * */
    @Override
    public int[] quickSort(int[] array, int m, int n) {
        // pivot은 m, 배열의 마지막 인덱스는 n
        int i, j, temp;
        if (m < n) {
            i = m;
            j = n + 1;
            do {
                do {
                    i++;
                } while (i <= n && array[i] < array[m]); // 왼쪽에서 오른쪽으로 가면서 pivot보다 큰 것을 검색
                do {
                    j--;
                } while (j > m && array[j] > array[m]); // 오른쪽에서 왼쪽으로 가면서 pivot보다 작은 것을 검색
                if (i < j) { // 큰 값과 작은 값 교환
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            } while (i < j);
            // 데이터가 엇갈릴 경우 array[j]에 pivot보다 작은 값이 들어있으므로 array[j]와 pivot(array[m])의 값을 교환
            temp = array[j];
            array[j] = array[m];
            array[m] = temp;
            // pivot을 기준으로 왼쪽과 오른쪽 부분 리스트로 나누어 위 과정을 반복
            quickSort(array, m, j-1);
            quickSort(array, j+1, n);
        }
        return array;
    }

    /** author   : 김지혜
     * 합병정렬 알고리즘은 원소를 반으로 분할한 후 분할한 원소를 다시 병합하는 정렬 방법
     * 주어진 리스트를 절반으로 분할하여 부분리스트로 나누다.
     * 해당 부분리스트의 길이가 1이 아니라면 1번 과정을 되풀이한다.
     * 인접한 부분리스트끼리 정렬하여 합친다.
     *
     * https://javaoop.tistory.com/7?category=836002
     * */
    @Override
    public void mergeSort(/*int[] arr, int left, int right*/) {
       //식은 어느정도 이해가 되는데 실행시키는데 어려움이 있습니다.
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i]= (int)(Math.random()*100)+1;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;
                }
            }
        }
        /*원소를 반으로 나누는 함수
        mergeSortDevide(arr, 0, arr.length -1);

        private static void mergeSortDevide(int[]arr, int left, int right){
          원소의 수가 2개 이상일 경우 실행
           if(left < right) {
               int mid = (left+right)/2; 반으로 나누기 위한 변수
               mergeSortDevide(arr,left,mid); 앞(왼쪽)부분 재귀호출
               mergeSortDevide(arr,mid+1,right); 뒤(오른쪽)부분 재귀 호출
               merge(arr,left,mid,right); 원소를 Merge하는 함수
           }
         }

         private static void merge(int[] arr,int left, int mid, int right){
           int i = left; 왼쪽 부분리스트 시작점
           int j = mid+1; 오른쪽 부분리스트의 시작점
           int tempIndex = left; 채워넣을 배열의 인덱스
           int[] temp = new int[arr.length];
           while(i <= mid && j <= right){
               if(arr[i] < arr[j]){
                   temp[tempIndex++]=arr[i++];
               }else{
                   temp[tempIndex++]=arr[j++];
               }
           }
           앞 부분 배열에 원소가 남아있는 경우
           while(i <= mid){
               temp[tempIndex++]=arr[i++];
           }
           뒤부분 배열에 원소가 남아있는 경우우
           while(j <= right){
               temp[tempIndex++]=arr[j++];
           }
           for(int index = left;index < tempIndex;index++){
               arr[index] = temp[index];
           }
         }
        */

        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    /** author      : 최은아
     * 홀수 마방진 구하기
     * 1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
     * 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
     * 3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
     * 4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
     * 5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화가 없다.
     * */
    @Override
    public void magicSquare() {

        int num;
        while (true) {
            num = (int) (Math.random() * 9) + 1;
            if (num % 2 == 1 && num != 1) {
                break;
            }
        }

        int array[][] = new int[num][num];
        int row, col;
        int cnt;
        row = 0;
        col = num / 2; // 마방진은 1행 가운데 열에서부터 시작

        for (int i = 1; i <= num * num; i++) {
            array[row][col] = i;
            if (i % num == 0) {
                row++;
                if (row == num) {
                    row = 0;
                }
            } else {
                row--;
                col++;
                if (row == -1) {
                    row = num - 1;
                }
                if (col == num) {
                    col = 0;
                }
            }
        }
        for (row = 0; row < num; row++) {
            for (col = 0; col < num; col++) {
                System.out.printf("%3d", array[row][col]);
            }
            System.out.println();
        }

    }
    /**
     * author : 심민혜
     * desc : 지그재그
     * 목표 : 랜덤 값을 n*n구조의 2차원 배열로 지그재그(ㄹ자)형태로 출력하기
     *
     * (출처 : http://ontheinfo.com/2241)
     * */
    @Override
    public void zigzag() {
        Random random = new Random();
        int a = random.nextInt(10);
        int[][] number = new int[a][a];
        int count = 1;
        int i;
        int j;

        for (i = 0; i < a ; i++) {
            if ((i % 2) == 0) {
                for (j = 0; j < a ; j++) {
                    number[i][j] = count;
                    count++;
                }
            } else {

                for (j = a - 1; j >= 0; j--) {

                    number[i][j] = count;
                    count++;
                }
            }
        }

        for (i = 0; i < a; i++){
            for (j = 0; j < a; j++){
                System.out.print(number[i][j]+"\t");
            }
            System.out.println();
        }
    }
    /** author      : 권솔이
     ★좌측 90도 직각삼각형
     랜덤 값을 생성한다.변수 rand는 20까지의 숫자중 랜덤이다.
     int i=0이고 i부터 rand 값 전까지 반복하며 1씩 늘어난다.
     int j=0이고,j부터 i까지 반복하여 1씩 늘어난다.조건을 만족하면 *을 출력한다.
     내부 for문을 완료하면 줄바꿈 실행
     ex) random값이 3이면 rand=3이다.
     i=0,0<3(3번 반복),1씩증가
     j=0, 0<=0,1씩증가 이때 만족하여
     *
     다시 for문으로 돌아가 j=1,1<=0, 1씩증가.
     이때 조건에 만족하지 못하여 내부 for문을 빠져 나와 외부 for문으로 돌아간다.
     i=1, 1<3,
     j=1, 1<=1,   -조건만족
     *(줄바꿈)
     **
     i=2, 2<3
     j=2, 1 2<=2 -조건만족
     *
     **(줄바꿈)
     ***
     i=3, 3<3   - 조건 불만족.끝.
     */
    @Override
    public void rectangleStarPrint(Scanner scanner) {
        Random random = new Random();
        int rand = random.nextInt(20);
        for (int i = 0; i<rand; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /** author      : 권솔이
     ★정삼각형 별찍기
     랜덤 값을 생성한다.변수 rand1는 20까지의 숫자중 랜덤이다.
     ex)rand1=3이면
     i=0, 0<3 1씩증가
     j=0, 0<3-0 / j=1, 1<3-0/j=2, 2<3-0 조건에 만족하여 공백을 출력한다
     ```
     j=0, 0<0*2+1 1씩증가 조건에 만족하여 *출력한다.
     ```*
     줄을 바꾼뒤 맨 처음 for문으로 돌아가 3번 반복한다.
     ```*
     ``***
     *****
     */
    @Override
    public void triangleStarPrint(Scanner scanner) {
        Random random1 = new Random();
        int rand1 = random1.nextInt(20);
        for (int i = 0; i<rand1; i++){
            for (int j= 0; j < rand1-i; j++){
                System.out.printf(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
