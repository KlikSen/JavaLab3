package task4;



public class MultiThread {
    public static void main(final String[] args) {


        final Calculate1 calculate1 = new Calculate1();

        final Calculate2 calculate2 = new Calculate2();

        final Calculate3 calculate3 = new Calculate3();

        final Calculate4 calculate4 = new Calculate4();

        calculate1.start();
        calculate2.start();
        calculate3.start();
        calculate4.start();

    }
    static class Calculate1 extends Thread {
        @Override
        public void run() {
            Calculations.addition();
        }
    }
    static class Calculate2 extends Thread {
        @Override
        public void run() {
            Calculations.subtraction();
        }
    }
    static class Calculate3 extends Thread {
        @Override
        public void run() {
           Calculations.multiplication();
        }
    }
    static class Calculate4 extends Thread {
        @Override
        public void run() {
            Calculations.division();
        }
    }

}

