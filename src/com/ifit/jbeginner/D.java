package com.ifit.jbeginner;

public class D {

    public void noException() {
        try {
            System.err.print(" 0");
            // nothing
            System.err.print(" 1");
        } catch (Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }

    public void handledException() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new Error();
            }
            System.err.print(" 1");
        } catch (Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");

    }

    public void notHandledException() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }

    public static void main(String[] args) {
        D d = new D();

        d.noException();
        d.handledException();
        d.notHandledException();
    }
}
