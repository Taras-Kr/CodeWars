package com.codewars.utils;

public class Menu {
    private Runner runner;
    private ConsoleScanner scanner;

    private Runnable[] difficultyEightMethods;
    private Runnable[] difficultySevenMethods;

    public Menu() {
        runner = new Runner();
        scanner = new ConsoleScanner();

        difficultyEightMethods = new Runnable[]{
                runner::difficulty_8_getChar,
                runner::difficulty_8_fakeBin,
                runner::difficult_8_doubleInteger,
                runner::difficult_8_multiply,
                runner::difficult_8_opposite,
                runner::difficult_8_isDivisible,
                runner::difficult_8_rentalCarCost,
                runner::difficult_8_repeatStr,
                runner::difficult_8_reverse,
                runner::difficult_8_century,
                runner::difficult_8_convert,
                runner::difficult_8_map
        };

        difficultySevenMethods = new Runnable[]{
                runner::difficult_7_stringMerge,
                runner::difficult_7_cost
        };

    }

    public int selectDifficulty(){
        System.out.print("\n\t#Select  task difficulty\nSelect difficulty:\n");
        System.out.print("\t8. Difficulty #8\n" +
                "\t7. Difficulty #7\n" +
                "\t0. Main Menu\n" +
                "Input:");

        int difficult = scanner.readInt();
        return difficult;
    }

    public void difficultyEight() {
        System.out.println("\n\t\t#Difficulty 8.\nSelect task:");
        System.out.print("\t1. Get character from ASCII Value\n" +
                "\t2. Fake Binary\n" +
                "\t3. You Can't Code Under Pressure #1\n" +
                "\t4. Function 3 - multiplying two numbers\n" +
                "\t5. Opposite number\n" +
                "\t6. Is n divisible by x and y?\n" +
                "\t7. Transportation on vacation\n"+
                "\t8. String repeat\n" +
                "\t9. Reversed String\n" +
                "\t10. Century From Year\n" +
                "\t11. Convert a Boolean to a String\n" +
                "\t12. Beginner - Lost Without a Map\n" +
                "\t0. Select another difficulty\n");
    }

    public void difficultySeven() {
        System.out.println("\n\t\t#Difficulty 7.\nSelect task:");
        System.out.print("\t1. String Merge!\n" +
                "\t2. Driving School Series #2\n" +
                "\t0. Select another difficulty\n");
    }

    public boolean runTask(Runnable[] tasks) {
        System.out.print("Input task number: ");
        int taskNumber = scanner.readInt();
        while (true) {
            if (taskNumber == 0) {
                return false;
            }
            if (taskNumber >= 0 && taskNumber <= tasks.length) {
                tasks[taskNumber - 1].run();
                return true;
            } else {
                System.out.print("Incorrect task number. Try again.\n" +
                        "Input task number: ");
            }
        }
    }

    public void run() {
        menu:
        while(true) {
            System.out.println("\n\t\t##Code Wars");
            System.out.print("\t#Menu:\nSelect option:\n" +
                    "\t1. Select difficulty\n" +
                    "\t2. Exit\n" +
                    "Input: ");
            int menuItem = scanner.readInt();
            int taskNumber = 0;
            switch (menuItem) {
                case 1:
                    int difficulty = selectDifficulty();
                    selectDifficulty:
                    while (true) {
                        switch (difficulty) {
                            case 8:
                                difficultyEight();
                                while (runTask(difficultyEightMethods)) {
                                    System.out.print("Try another task? (Y or N)");
                                    String answer = scanner.readString();
                                    if ((answer.toUpperCase()).equals("N")) {
                                        break;
                                    } else {
                                        difficultyEight();
                                    }
                                }
                                break selectDifficulty;
                            case 7:
                                difficultySeven();
                                while (runTask(difficultySevenMethods)) {
                                    System.out.print("Try another task? (Y or N)");
                                    String answer = scanner.readString();
                                    if ((answer.toUpperCase()).equals("N")) {
                                        break;
                                    } else {
                                        difficultySeven();
                                    }
                                }
                                break selectDifficulty;

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
