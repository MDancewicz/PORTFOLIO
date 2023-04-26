public class Zadanie_10 {
    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 10000;
        double myDouble = 10.5;
        System.out.println("Liczby " + myInt + " " + myLong + " " + myDouble);
//        myInt = myLong;
//        myInt = myDouble;
        myLong = myInt;
//        myLong = myDouble;
        myDouble = myInt;
        myDouble = myLong;
    }
}