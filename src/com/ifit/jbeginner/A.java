package com.ifit.jbeginner;

/**
 * Конструкції throws, throw і catch використовуються лише з нащадками класа Throwable
 */
public class A {

    public void thisIsRightThrows() throws Throwable {
    }

//     public void thisIsWrongThrows() throws String { }

    public void thisIsRightCatch() {
        try {
        } catch (Throwable t) {
        }
    }

    public void thisIsWrongCatch() {
//        try {
//            } catch (String s) {}
    }

    public void thisIsRightThrow() {
        // Error - extends Throwable
        throw new Error();
    }

    public void thisIsWrongThrow() {
//        throw new String("Hello!");
    }

    public void cantTrowNull() {
        throw null;
    }

    /**
     * Створення екземпляра виключення оператором new і вкидання його оператором throw -
     * це дві різні незалежні операції.
     */
    public void newAndThrow() {
        Error ref = new Error(); // створюємо екземпляр
        throw ref;               // "вкидаємо" його
    }

    public static void main(String[] args) throws Throwable {
        A a = new A();

        a.thisIsRightThrows();
        a.thisIsRightCatch();
        a.thisIsRightThrow();
        a.cantTrowNull();
        a.newAndThrow();
    }
}
