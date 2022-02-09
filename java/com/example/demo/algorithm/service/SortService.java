package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName        : SortService
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public interface SortService {
    int kNumber(int[] array, int[][] commands);
    String maxNumber(int[] numbers);
    int hIndex(int[] citations);
}
