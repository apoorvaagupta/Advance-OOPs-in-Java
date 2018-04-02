package me.apoorvaagupta;

public class ConsoleOutput <T> implements WriterInterface<T> {

    public void output(T var) {
        System.out.println(var);
    }
}
