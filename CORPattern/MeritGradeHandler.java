package com.design.pattern;

public class MeritGradeHandler extends GradeHandler {
    // marks >= 60 && marks < 80 => B
    @Override
    protected boolean handle(GradeRequest request) {
        int m = request.getMarks();
        if (m >= 60 && m < 80) {
            System.out.println("Your Grade is B for marks = " + m);
            return true;
        }
        return false;
    }
}
