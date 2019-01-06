package algorithms_I_princeton.cs_interdisciplinaryapproach.data_types;

/***
 * takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d =20)
 * and June 20 (m = 6, d = 20), false otherwise.
 */

class SpringSeason{

    final static int START_DATE = 320;
    final static int END_DATE = 620;

    /***
     * Verify if the date is valid start(01/01 - 31/12)=100 & end < 1232
     * @param date
     * @return
     */
    public static boolean isValidDate(int date){
        return date > 100 && date < 1232;
    }

    /***
     * Check if the date is between March 20 and June 20, 320 - 620
     * @param date
     * @return
     */

    public static boolean checkDate(int date){
        return date >= 320 && date <= 620;
    }

    public static void main(String[] args){
        if(args.length < 2){
            System.out.println("No valid input, need at 2 values day and month");
            return;
        }

        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]) * 100;

        int totalDate = m+d;

        if(!isValidDate(totalDate)){
            System.out.println("No valid date range");
            return;
        }


        System.out.println(checkDate(totalDate));



    }
}