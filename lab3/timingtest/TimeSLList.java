package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();
        int n = 1000;
        while (n <= 128000) {
            getItem(n, Ns, times, opCounts);
            n *= 2;
        }

        printTimingTable(Ns, times, opCounts);
    }

    public static void getItem(int n, AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts){

        int M = 10000;
        Ns.addLast(n);

        SLList<Integer> test = new SLList<>();
        int j = 0;
        while (j < n){
            test.addLast(j);
            j++;
        }
        Stopwatch sw = new Stopwatch();
        for(int i= 0; i < M; ++i){
            test.getLast();
        }
        double time = sw.elapsedTime();
        times.addLast(time);
        opCounts.addLast(M);
    }
}



