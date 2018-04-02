package me.apoorvaagupta;

public class AdditionProcessor<T> implements ProcessorInterface<T> {

    private final Class<T> classname;


    public AdditionProcessor(Class<T> classanme) {
        this.classname = classanme;
    }


    public <T> T process(T ... v) {

        T sum;

        if(this.classname == String.class)
            sum = (T) "";
        else
            sum = (T) new Integer(0);

        for (T i: v) {
            if (this.classname == Integer.class) {
                sum = (T) new Integer((Integer) sum + (Integer) i);
            } else {
                sum = (T) ((String) sum + (String) i);
            }
        }

        return sum;
    }
}
