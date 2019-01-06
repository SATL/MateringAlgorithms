package algoritms_I_princeton.cs_interdisciplinaryapproach.first_java_program;

/******************************
 * Execution: TenHelloWorlds [number of repetiion]
 *
 * Description: Print x or ten lines of Hello World
 *
 *
 */


class TenHelloWorlds{

    public static void main(String[] args){
        int total = 10;

        /*
        Optional:
            Pass the number of lines per command line
         */
        if(args.length > 0){
            total = Integer.parseInt(args[0]);
        }

        for(int i=0; i<total; ++i){
            System.out.println("Hello World");
        }
    }
}