package algorithms_I_princeton.cs_interdisciplinaryapproach.first_java_program;

/******************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument yourname
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *
 ******************************************************************************/

public class UseArgument {

    public static void main(String[] args) {

        /*
        Added: Check the size of the arguments

         */

        if(args.length ==0){
            System.out.println("No valid arguments, needs at least one");
            return;
        }


        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");
    }

}
