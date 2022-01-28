package com.codewars.utils;

public class ConsoleScanner implements Scanner{
    java.util.Scanner sc = new java.util.Scanner(System.in);

    @Override
    public int readInt() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Bad integer number! Try again.");
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
}
