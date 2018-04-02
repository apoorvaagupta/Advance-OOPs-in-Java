package me.apoorvaagupta;

public interface ProcessorInterface<T> {

    public <T> T process(T ... v);


}
