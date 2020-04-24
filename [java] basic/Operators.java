
public class Operators{

    static int result = 0;
    static int operand = 0;
    static char operator = ' ';

    public static void main(String argv[]){

        String str = new String("1+2*5"); 
 
        for(int i=0; i<str.length(); i++){
            
            if( Character.isDigit(str.charAt(i)) ){

                operand = operand * 10 + Character.getNumericValue(str.charAt(i));

            } else {

                compute();
                operator = str.charAt(i);
                operand = 0; 

            }

        }
                
        compute();

        System.out.println(str+"="+result);

    }

    static void compute(){

        if (operator == ' '){ 
            result = operand;
        } else if (operator == '+'){
            result += operand;
        } else if (operator == '-'){
            result -= operand;
        } else if (operator == '*'){
            result *= operand;
        } else if (operator == '/'){
            result /= operand;
        } else {
            result = 0;
        }

    }

}