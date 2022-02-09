package com.example.demo.algorithm.controller;

import com.example.demo.algorithm.service.DfsService;
import com.example.demo.algorithm.service.DfsServiceImpl;
import com.example.demo.algorithm.service.SortService;
import com.example.demo.algorithm.service.SortServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algorithm.controller
 * fileName        : AlgorithmController
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner){
        SortService sortService = new SortServiceImpl();
        DfsService dfsService = new DfsServiceImpl();
        while (true){
            System.out.println("0.Exit 1.김지혜 2.권솔이 3.심민혜 4.하진희 5.최은아");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    System.out.println("0.Exit 1.Sort 2.DFS 3.BFS");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("### Sort ###");
                            sortService.kNumber(null,null);
                            sortService.maxNumber(null);
                            sortService.hIndex(null);
                            break;
                        case "2":
                            System.out.println("### DFS ###");
                            dfsService.tarNumber(null,0);
                            dfsService.netWort(0,null);
                            dfsService.trans("","",null);
                            dfsService.travel(null);
                    }
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;


            }
        }
    }
}
