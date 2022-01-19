package com.codewars.utils;

public class Menu {
    private Runner runner;
    private ConsoleScanner scanner;

    private Runnable[] difficultyEightMethods;

    public Menu() {
        runner = new Runner();
        scanner = new ConsoleScanner();

        difficultyEightMethods = new Runnable[]{
                runner::difficulty_8_getChar,
                runner::difficulty_8_fakeBin
        };

    }

    public int selectDifficulty(){
        System.out.print("#Select  task difficulty\n");
        System.out.print("\t8. Difficulty #8\n" +
                "\t7. Difficulty #7\n" +
                "\t0. Main Menu\n" +
                "Input:");

        int difficult = scanner.readInt();
        return difficult;
    }

    public void difficultyEight() {
        System.out.println("\t#Select task:\n");
        System.out.print("1. Get character from ASCII Value\n" +
                "2. Fake Binary\n" +
                "0. Select another difficulty\n" +
                "Input:");
    }

    public void run() {
        menu:
        while(true) {
            System.out.println("\t\t##Code Wars");
            System.out.print("#Press:\n" +
                    "\t1. Select difficulty\n" +
                    "\t2. Exit\n" +
                    "Input: ");
            int menuItem = scanner.readInt();
            int taskNumber = 0;
            switch (menuItem) {
                case 1:
                    int difficulty  = selectDifficulty();
                    selectDifficulty:
                    while (true) {
                        switch (difficulty) {

                            case 8:
                                difficultyEight();
                                taskNumber = scanner.readInt();
                                difficultyEightMethods[taskNumber-1].run();
                                System.out.print("Try another task? (Y or N)");
                                String answer = scanner.readString();
                                break selectDifficulty;

                            case 7:
                                break;
                            case 0:
                                break selectDifficulty;
                        }
                    }
                    break;
                case 2:
                    System.exit(0);
            }

        }

    }
}