package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName        : DfsService
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public interface DfsService {
    int tarNumber(int[] numbers, int target);
    int netWort(int n, int[][] computers);
    int trans(String begin, String target, String[] words);
    String travel(String[][] tickets);
}
