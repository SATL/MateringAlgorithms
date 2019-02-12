package cs_interdisciplinaryapproach.data_types;

class Dragon{

    public static String getReverse(String str){ //FLF
        String resp = ""; //F
        for(char c:str.toCharArray()){ //L
            char x = 'F';
            if(c == 'L'){
                x = 'R';
            }else if(c == 'R'){
                x = 'L';
            }
            resp += x;
        }
        return resp;
    }


    public static String getDragon(String str){
        //FLF L FRF
        return str +'L'+ getReverse(str);
    }

    public static void main(String[] args){
        String dragon = "F";
        System.out.println("Strart dragon: "+dragon);
        for(int i=0; i<5; i++){ //"FLF"
            dragon = getDragon(dragon);
            System.out.println(dragon);
        }
    }
}