package com.design.pattern;

public abstract class GradeHandler {
    protected GradeHandler successor;

    public void setSuccessor(GradeHandler successor) {
        this.successor = successor;
    }

    public void requestGrade(GradeRequest request) {
        if (!handle(request) && successor != null) {
            successor.requestGrade(request);
        }
    }

    protected abstract boolean handle(GradeRequest request);
}
