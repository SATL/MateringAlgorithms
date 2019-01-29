import edu.princeton.cs.algs4.WeightedQuickUnionUF;
/******************************************************************************
 *  Dependencies: WeightedQuickUnionUF.java
 *
 *  This program makes the percolation system using QuickUnion weight.
 *  Works with a balanced weight of the array. Uses an array 2d to save the data that is open
 *  and convert it to 1d for the QU.
 *
 ******************************************************************************/
public class Percolation{

    private boolean[][] items;
    private WeightedQuickUnionUF uf;
    private int size;
    private int oppended = 0;
    private int virtualTop;
    private int virtualBottom;

    /****
     * Percolation Contructor
     * Initialize the WeightedQuickUnionUF and create a virtualTop & virtualBottom
     * @param n
     */
    public Percolation(int n) {
        if(n<=0){
            throw new IllegalArgumentException("No valid input");
        }
        size = n;
        items = new boolean[n][n];

        uf = new WeightedQuickUnionUF((n * n) + 2);

        virtualTop = n*n;
        virtualBottom = n*n+1;
    }


    /***
     * Open a item in the 2d array
     * Also connect it to the neighbors, is in in the bottom or top, connect it to the virtuals
     * @param row
     * @param col
     */

    public void open(int row, int col) {
        checkLimits(row, col);
        if (!isOpen(row, col)) {
            oppended++;
        }
        items[row - 1][col - 1] = true;

        if(row == 1){
            uf.union(get2DPosition(1, col), virtualTop);
        }
        if(row == size){
            uf.union(get2DPosition(size, col), virtualBottom);
        }

        connectNeig(row, col);
    }

    /***
     * Get the 1d position of a 2f value
     * @param row
     * @param col
     * @return
     */

    private int get2DPosition(int row, int col) {
        row = row - 1;
        col = col - 1;
        return row * size + col;
    }

    /****
     * Connect the neighbors of the item if they are open
     * @param row
     * @param col
     */
    private void connectNeig(int row, int col) {
        int[] positions = {-1, 1};

        for (int i = 0; i < 2; i++) {
            int newRow = row + positions[i];
            int newCol = col + positions[i];
            if (isInLimits(newRow, col) && isOpen(newRow, col)) {
                connectItem(row, col, newRow, col);
            }
            if (isInLimits(row, newCol) && isOpen(row, newCol)) {
                connectItem(row, col, row, newCol);
            }
        }
    }

    /***
     * Make the quick union passing 2 values
     * @param row1
     * @param col1
     * @param row2
     * @param col2
     */
    private void connectItem(int row1, int col1, int row2, int col2) {
        int q = get2DPosition(row1, col1);
        int p = get2DPosition(row2, col2);
        uf.union(p, q);
    }

    /***
     * Check the limis of the input, row and col
     * @param row
     * @param col
     */
    private void checkLimits(int row, int col) {
        if (!isInLimits(row, col))
            throw new IllegalArgumentException();
    }

    /***
     * Check if is in limis
     * @param row
     * @param col
     * @return
     */

    private boolean isInLimits(int row, int col) {

        return row > 0 && col > 0 && row <= size && col <= size;
    }

    /***
     * Check if is open
     * @param row
     * @param col
     * @return
     */
    public boolean isOpen(int row, int col) {
        checkLimits(row, col);
        return items[row - 1][col - 1];
    }

    /***
     * Check if is full using the QuickUnion to the virtual top
     * @param row
     * @param col
     * @return
     */
    public boolean isFull(int row, int col) {
        checkLimits(row, col);
        if (!isOpen(row, col))
            return false;
        return uf.connected(get2DPosition(row, col), virtualTop);
    }

    /***
     * Return number of open sites
     * @return
     */
    public int numberOfOpenSites() {
        return oppended;
    }

    /***
     * Check if the system percolates using union find with the virtual top and bottom
     * @return
     */
    public boolean percolates() {
        return uf.connected(virtualBottom, virtualTop);
    }
}
