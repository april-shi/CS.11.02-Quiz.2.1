public class Main {
    public static void main(String[] args) {

        int resultOne = add(1,2);
        String resultTwo = greeting("Mr. Ewing");
        int resultThree = add(4,5,6,7);
        printMe("I love pizza!");

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
    }

    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour){
        return add(add(numOne,numTwo),add(numThree,numFour));
    }

    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
        return;
    }

}
