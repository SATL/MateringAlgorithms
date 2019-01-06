package algorithms_I_princeton.cs_interdisciplinaryapproach.first_java_program;

/***
 * Description: takes three names and prints out a proper sentence with the names in the reverse of the order given
 * so that for example, "java UseThree Alice Bob Carol" gives "Hi Carol, Bob, and Alice."
 *
 */

class UseThree{

    public static void main(String[] args){
        if(args.length < 3){
            System.out.println("No valid arguments, need at leas three");
            return;
        }

        System.out.println( String.format("Hi %s, %s, and %s", args[2], args[1], args[0]) );
    }
}