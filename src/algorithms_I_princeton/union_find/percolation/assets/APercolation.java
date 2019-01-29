package algorithms_I_princeton.union_find.percolation.assets;

public abstract class APercolation {
    abstract public void open(int row, int col);    // open site (row, col) if it is not open already

    abstract public boolean isOpen(int row, int col);  // is site (row, col) open?

    abstract public boolean isFull(int row, int col);  // is site (row, col) full?

    abstract public int numberOfOpenSites();       // number of open sites

    abstract public boolean percolates();              // does the system percolate?

}
