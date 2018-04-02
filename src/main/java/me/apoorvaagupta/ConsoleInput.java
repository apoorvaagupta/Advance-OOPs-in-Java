package me.apoorvaagupta;

import java.util.Scanner;

public class ConsoleInput<T> implements ReaderInterface<T>{

    Scanner scn;
    private final Class<T> classname;


    public ConsoleInput(Class<T> classanme) {
        this.scn = new Scanner(System.in);
        this.classname = classanme;
    }

    public <T> T input() {

        if (this.classname == Integer.class) {
            return (T) new Integer(this.scn.nextInt());
        } else {
            return (T) this.scn.next();
        }


    }

}
