package com.desgin.pattern.behavioral.visitor;

/**
 * Create by eval on 2019/2/11
 */
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
