package com.design.pattern;

public class FailGradeHandler extends GradeHandler {
    // marks < 40 => F (Fail)
    @Override
    protected boolean handle(GradeRequest request) {
        int m = request.getMarks();
        if (m < 40) {
            System.out.println("You Fail the module for marks = " + m);
            return true;
        }
        return false;
    }
}
