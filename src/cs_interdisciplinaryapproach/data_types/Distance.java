package cs_interdisciplinaryapproach.data_types;

/****
 *
 * takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 */

class Distance{

    public static void main(String[] args){
        if(args.length <2){
            System.out.println("No valid arguments, need at leas 2 ");
            return;
        }


        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double euclidean = Math.sqrt( (x*x) + (y*y) );

        System.out.println( String.format("Distance from (0,0) to (%d, %d) = "+euclidean, x, y));

    }

}