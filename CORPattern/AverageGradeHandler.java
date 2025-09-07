package com.design.pattern;

public class AverageGradeHandler extends GradeHandler {
    // marks > 39 && marks <= 60 => C
    @Override
    protected boolean handle(GradeRequest request) {
        int m = request.getMarks();
        if (m > 39 && m <= 60) {
            System.out.println("Your Grade is C for marks = " + m);
            return true;
        }
        return false;
    }
}
