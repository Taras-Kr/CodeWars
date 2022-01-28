package com.codewars.utils;

public class ConsoleScanner implements Scanner{
    java.util.Scanner sc = new java.util.Scanner(System.in);

    @Override
    public int readInt() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.print("Bad integer number! Try again: ");
                sc.next();
            }
        }
    }

    @Override
    public String readString() {
        while (true) {
            if (sc.hasNext()) {
                return sc.next();
            }
        }
    }

    @Override
    public Long readLong() {
        while(true){
            if(sc.hasNextLong()){
                return sc.nextLong();
            }else{
                System.out.println("Bad Long value! Try again.");
                sc.next();
            }
        }

    }

    @Override
    public String readStringLine() {
        while(true){
            if(sc.hasNextLine()){
                return sc.nextLine();
            }else{
                System.out.print("Bad String Line. Try again: ");
                sc.next();
            }
    }


}

    @Override
    public boolean readBoolean() {
        String inputBoolean;
        while (true) {
            if (sc.hasNext()) {
                inputBoolean = sc.next().toLowerCase();
                if (inputBoolean.equals("true")) {
                    return true;
                }
                if (inputBoolean.equals("false")) {
                    return false;
                } else {
                    System.out.print("Bad boolean. Try again:");
                    sc.nextLine();
                }
            } else {
                System.out.print("Bad boolean. Try again:");
                sc.nextLine();
            }
        }
    }

    @Override
    public int[] readIntArray() {
        System.out.print("Input array size: ");
        int arraySize = readInt();
        int[] array = new int[arraySize];
        System.out.println("Input array elements: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("\tInput array element[" + i + "] : ");
            array[i] = readInt();
        }
        return array;
    }

}
