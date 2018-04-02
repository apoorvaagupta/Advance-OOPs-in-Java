package me.apoorvaagupta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ConsoleInput<String> cis = new ConsoleInput<String>(String.class);
        AdditionProcessor<String> aps = new AdditionProcessor<String>(String.class);
        ReversalProcessor<String> rps = new ReversalProcessor<String>(String.class);
        ConsoleOutput<String> cos = new ConsoleOutput<String>();

        String s1 = cis.input();
        String s2 = cis.input();

        String sum = aps.process(s1, s2);
        String rev = rps.process(s1);

        cos.output(sum);
        cos.output(rev);

        ConsoleInput<Integer> cii = new ConsoleInput<Integer>(Integer.class);
        AdditionProcessor<Integer> api = new AdditionProcessor<Integer>(Integer.class);
        ReversalProcessor<Integer> rpi = new ReversalProcessor<Integer>(Integer.class);
        ConsoleOutput<Integer> coi = new ConsoleOutput<Integer>();

        Integer v1 = cii.input();
        Integer v2 = cii.input();

        Integer sum2 = api.process(v1, v2);
        Integer rev2 = rpi.process(v1);

        coi.output(sum2);
        coi.output(rev2);



    }
}
