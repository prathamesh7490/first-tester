public class HelloWorld {
    public static void main(String[] args) {


        double firstdouble = 20.00d;
        double seconddouble = 899.00d;
        double addition = (firstdouble + seconddouble) * 100.00d;
        System.out.println("Addition of double is " +addition);
        double theremainder = addition % 40.00d;
        System.out.println("remainder is = " + theremainder);
        boolean isNoRemainder = (theremainder == 0) ? true : false;
        System.out.println("isNoRemainder =" + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("there is some remainder ");
        }



    }
}
