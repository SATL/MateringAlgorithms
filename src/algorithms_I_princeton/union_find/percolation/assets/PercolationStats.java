package algorithms_I_princeton.union_find.percolation.assets;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {

    private int size;
    private int trials;

    private double[] x;
    /***
     * Contructor passiong the n value of the nxn grid of the system
     * @param n
     * @param trials
     */
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException("No valid trials or n ");
        }
        this.size = n;
        this.trials = trials;
        this.x = new double[trials];

        makeTrials();
    }


    /***
     * Function that start the trials
     * Every trial will get the open sites necesary to percolate in the experiment and will
     * write it in a value of percentage for the stats
     */
    private void makeTrials(){
        for(int exp=0; exp<trials; exp++){
            Percolation pr = new Percolation(size);
            int openned=0;
            while(!pr.percolates()){
                int row = StdRandom.uniform(1, size+1);
                int col = StdRandom.uniform(1, size+1);
                if(!pr.isOpen(row, col)){
                    pr.open(row, col);
                    openned++;
                }
            }
            double fraction = (double) openned / (size*size);
            x[exp] = fraction;
        }
    }

    /***
     * sample mean of percolation threshold
     * @return
     */
    public double mean() {
        return StdStats.mean(x);
    }

    /***
     * sample standard deviation of percolation threshold
     * @return
     */
    public double stddev() {
        if(trials==1)
            return Double.NaN;
        return StdStats.stddev(x);
    }

    /***
     * low  endpoint of 95% confidence interval
     * @return
     */
    public double confidenceLo() {
        return mean() - ((1.96 * stddev()) / Math.sqrt(trials));

    }

    /***
     * high endpoint of 95% confidence interval
     * @return
     */
    public double confidenceHi() {
        return mean() + ((1.96 * stddev()) / Math.sqrt(trials));
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        PercolationStats ps = new PercolationStats(size, trials);

        String confidence = ps.confidenceLo() + ", " + ps.confidenceHi();
        StdOut.println("mean                    = " + ps.mean());
        StdOut.println("stddev                  = " + ps.stddev());
        StdOut.println("95% confidence interval = " + confidence);
    }
}
