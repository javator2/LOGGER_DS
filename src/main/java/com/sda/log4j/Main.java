package com.sda.log4j;

public class Main {

//    static class Task1 implements Runnable {
//
//        @Override
//        public void run() {
//            Logger logger = Logger.getInstance();
//            logger.error("TO JEST TEST ERROR1");
//            logger.debug("TO JEST TEST DEBUG1");
//        }
//    }
//
//    static class Task2 implements Runnable {
//
//        @Override
//        public void run() {
//            Logger logger = Logger.getInstance();
//            logger.error("TO JEST TEST ERROR2");
//            logger.debug("TO JEST TEST DEBUG2");
//        }
//    }


    public static void main(String[] args) {

//            Thread task1 = new Thread(new Task1());
//            Thread task2 = new Thread(new Task2());
//            task1.start();
//            task2.start();


        Runnable task1 = () -> {
            Logger logger = Logger.getInstance();
            logger.error("TO JEST TEST ERROR1");
            logger.debug("TO JEST TEST DEBUG1");
        };

        Runnable task2 = () -> {
            Logger logger = Logger.getInstance();
            logger.error("TO JEST TEST ERROR2");
            logger.debug("TO JEST TEST DEBUG2");
        };

        new Thread(task1).start();
        new Thread(task2).start();

    }
}

