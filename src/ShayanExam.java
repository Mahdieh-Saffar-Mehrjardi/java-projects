import java.util.Scanner;
import java.util.Stack;

public class ShayanExam {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        String[] array=user.nextLine().split(" ");
        Stack<String> operator = new Stack<String>();
        Stack<Integer> number = new Stack<Integer>();


        number.push(Integer.valueOf(array[0]));
        operator.push(array[1]);
        number.push(Integer.valueOf(array[2]));
        if(operator.peek().equals("*")){
            int x=number.pop();
            int sub=number.pop()*x;
            number.push(sub);
            operator.pop();
        }
        if( operator.empty()==false && operator.peek().equals("/")  ){
            int y=number.pop();
            int sub=number.pop()/y;
            number.push(sub);
            operator.pop();
        }
        if( operator.empty()==false &&operator.peek().equals("-")){
            int z=(-1*number.pop());
            number.push(z);
            operator.pop();
            operator.push("+");
        }
        for (int i=3 ; i< array.length;i+=2){
            number.push(Integer.valueOf(array[i+1]));
            operator.push(array[i]);
            if(operator.peek().equals("-")){
                int z=(-1*number.pop());
                number.push(z);
                operator.pop();
                operator.push("+");
                continue;

            }
            if(operator.peek().equals("*")){
                int x=number.pop();
                int sub=number.pop()*x;
                operator.pop();
                number.push(sub);
                continue;

            }
            if(operator.peek().equals("/")){
                int y=number.pop();
                int sub=number.pop()/y;
                operator.pop();
                number.push(sub);
                continue;

            }

        }
        while (operator.isEmpty()==false){
            int f=number.pop();
            int sum = (number.pop()+f);
            operator.pop();
            number.push(sum);

        }
        int result=number.pop();
        System.out.println(result);


    }


}
