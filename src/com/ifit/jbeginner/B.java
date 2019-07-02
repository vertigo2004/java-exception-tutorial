package com.ifit.jbeginner;

/**
 * Поняття callstack.
 * Блок try/catch - як спосіб нелокальної передачи управління (nonlocal control transfer)
 */
public class B {

        public static void main(String[] args) {
            System.err.println("#1.in");
            try {
                f(); // створюємо фрейм, кладемо в стек, передаємо керування до нього
            } catch (Error e) { // "перехопили" "кинуте" виключення
                System.err.println("#1.CATCH");  // обробили
            }
            System.err.println("#1.out");  // працюємо далі
        }

        public static void f() {
            System.err.println(".   #2.in");
            g(); // створюємо фрейм, кладемо в стек, передаємо керування до нього
//            cпробуйте обгорнути виклик метора в try/catch {}
            System.err.println(".   #2.out"); // далі не працюємо
        }

        public static void g() {
            System.err.println(".   .   #3.in");
            h(); // створюємо фрейм, кладемо в стек, передаємо керування до нього
//            cпробуйте обгорнути виклик метора в try/catch {}
            System.err.println(".   .   #3.out"); // далі не працюємо
        }

        public static void h() {
            System.err.println(".   .   .   #4.in");
//            cпробуйте обгорнути ей блок в try/catch {}
            if (true) {

                System.err.println(".   .   .   #4.THROW");
                throw new Error(); // виходимо зі всієї пачки фреймов ("розкрутка стека") по 'throw'
            }
            System.err.println(".   .   .   #4.out"); // далі не працюємо
        }

}
