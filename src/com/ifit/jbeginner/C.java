package com.ifit.jbeginner;

public class C {

    public void noException() {
        try {
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }
    }

    public void withException() {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }

    public void withReturn() {
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }

    public void killJvm() {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }

    public static void main(String[] args) {
        C c = new C();

        c.noException();
        c.withException();
        c.withReturn();
        c.killJvm();
    }
}
