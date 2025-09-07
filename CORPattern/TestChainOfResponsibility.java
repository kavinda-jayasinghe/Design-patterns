package com.design.pattern;

import java.util.Scanner;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        BestGradeHandler best = new BestGradeHandler();
        MeritGradeHandler merit = new MeritGradeHandler();
        AverageGradeHandler avg = new AverageGradeHandler();
        FailGradeHandler fail = new FailGradeHandler();

        best.setSuccessor(merit);
        merit.setSuccessor(avg);
        avg.setSuccessor(fail);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter marks for Grade = ");
            if (!scanner.hasNextInt()) break;
            int marks = scanner.nextInt();
            best.requestGrade(new GradeRequest(marks));
        }
        scanner.close();
    }
}
