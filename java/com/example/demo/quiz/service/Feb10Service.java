package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Feb10Service
 * author          : codejihyekim
 * date            : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         codejihyekim      최초 생성
 */
public interface Feb10Service {
    void bubbleSort();
    void insertionSort();
    void selectionSort();
    int[] quickSort(int[] array, int m, int n);
    void mergeSort();
    void magicSquare();
    void zigzag(Scanner scanner);
    void rectangleStarPrint(Scanner scanner);
    void triangleStarPrint(Scanner scanner);
}
