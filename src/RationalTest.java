public class RationalTest {

      public static void main(String[] args) {
          Rational x =new Rational( 2, 8);
          Rational y=new Rational( 3,8);
         System.out.print("add:");
           Rational ad=  x.add(y);
            ad.print();
            System.out.print("sub:");
            Rational su= x.sub(y);
            su.print();
            System.out.print("mul:");
            Rational mu=x.mul(y);
            mu.print();
            System.out.print("div:");
            Rational di=x.div(y);
            di.print();

            Rational rev=  x.reverse();
            rev.print();
            Rational rev1=   y.reverse();
            rev1.print();
           convert("10/1*2/1*3/1").print();
           convertP("(12/1-10/1)+(4/1-3/1)+(20/1*24/1)").print();



        }

        public static Rational convert(String str){

            int first=0 ,m=0;
            char [] c=new char[30];
            String string ;
            Rational [] rational = new Rational[30];
            char [] ch =str.toCharArray();

            for (int i=0 ; i<ch.length;i++){
                if( (ch[i]== '*') || (ch[i]== ':') || (ch[i]== '+') || (ch[i]== '-')) {
                    string = str.substring(first, i);
                    first = i + 1;
                    rational[m] = new Rational(string);
                    c[m] = ch[i];
                    m++;
                }
                else if(i==ch.length-1) {
                    string = str.substring(first, i + 1);
                    rational[m] = new Rational(string);

                }

            }

            for (int i=0; i<rational.length;i++){
                if(rational[i]==null){
                    break;
                }
                if(c[i]=='*'){
                    rational[i]=rational[i].mul(rational[i+1]);
                    for (int j = i+1; j < rational.length-1; j++) {
                        rational[j]=rational[j+1];
                    }
                    for (int j = i; j < c.length-1; j++) {
                        c[j]=c[j+1];
                    }

                }
                if(c[i]=='*'){
                    i=-1;
                }
            }


            for (int i=0; i<rational.length;i++){
                if(rational[i]==null){
                    break;
                }

                if(c[i]==':'){
                    rational[i]=rational[i].div(rational[i+1]);
                    for (int j = i+1; j < rational.length-1; j++) {
                        rational[j]=rational[j+1];
                    }
                    for (int j = i; j < c.length-1; j++) {
                        c[j]=c[j+1];
                    }
                }
                if(c[i]==':'){
                    i=-1;
                }
            }


            for (int i=0; i<rational.length;i++){
                if(rational[i]==null){
                    break;
                }


                if(c[i]=='+'){
                    rational[i]=rational[i].add(rational[i+1]);
                    for (int j = i+1; j < rational.length-1; j++) {
                        rational[j]=rational[j+1];
                    }
                    for (int j = i; j < c.length-1; j++) {
                        c[j]=c[j+1];
                    }
                }
                if(c[i]=='+'){
                    i=-1;
                }
            }

            for (int i=0; i<rational.length;i++){
                if(rational[i]==null){
                    break;
                }


                if(c[i]=='-'){
                    rational[i]=rational[i].sub(rational[i+1]);
                    for (int j = i+1; j < rational.length-1; j++) {
                        rational[j]=rational[j+1];
                    }
                    for (int j = i; j < c.length-1; j++) {
                        c[j]=c[j+1];
                    }
                }
                if(c[i]=='-'){
                    i=-1;
                }
            }

            return rational[0];
        }


        public  static Rational convertP(String str) {
            char[] cp = str.toCharArray();
            int first = 0, j = 0;
            String [] string1 =new String[30];
            String [] string2 =new String[30];
            String answer;


            for (int i = 0; i < cp.length; i++) {
                if (cp[i] == '(') {
                    first = i + 1;
                }
                if (cp[i] == ')') {
                    string1[j] = str.substring(first, i);
                     answer = convert(string1[j]).toString();
                     string2[j] ="("+string1[j]+")";
                     str=str.replace(string2[j],answer);
                     cp=str.toCharArray();
                     i=-1;


                }
            }
          return convert(str);
        }



}

