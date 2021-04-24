public class Rational {
        private int numerator;
        private int denominator;

        public Rational() {

        }

        public Rational(int numerator, int denominator) {

           this.numerator = numerator;
           this.denominator = denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        public int simple (int a , int b){
            int tmp=1 , x ,y;
            x=a;
            y=b;
            if(a==0)
                return 1;
            while(b !=0){
                tmp=a%b;
                a=b;
                b=tmp;
            }
            return a;

        }
        public Rational add(Rational num){
            return new Rational( (numerator*num.denominator)+(num.numerator*denominator), denominator*num.denominator);
        }
        public Rational sub(Rational num){
            return new Rational( (numerator*num.denominator)-(num.numerator*denominator) , denominator*num.denominator);
        }
        public Rational mul(Rational num){
            return new Rational(numerator*num.numerator ,denominator*num.denominator);
        }
        public Rational div(Rational num){
            return new Rational(numerator*num.denominator ,denominator*num.numerator);
        }

        public void print() {
            int a=simple(numerator,denominator);
            if(denominator==0){
                System.out.println("it is not defined!");
            }else

            System.out.println(+numerator/a + "/" + denominator/a);
        }
        public Rational reverse() {
            Rational r;

            if(numerator==0) {


                System.out.print("it is not possible ,the previous value is:");
                r=new Rational(numerator,denominator);
            }
            else {
                r=new Rational(denominator,numerator);
            }
            return r;
        }

        public Rational (String str){
            String[]temp=str.split("/");
            setNumerator(Integer.parseInt(temp[0]));
            setDenominator(Integer.parseInt(temp[1]));
        }

        public String toString(){

            return (numerator+"/"+denominator);
        }

    }


