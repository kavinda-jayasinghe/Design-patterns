package com.design.pattern;

public class BestGradeHandler extends GradeHandler {
    // marks > 79 && marks <= 100 => A
    @Override
    protected boolean handle(GradeRequest request) {
        int m = request.getMarks();
        if (m > 79 && m <= 100) {
            System.out.println("Your Grade is A for marks = " + m);
            return true;
        }
        return false;
    }
}
