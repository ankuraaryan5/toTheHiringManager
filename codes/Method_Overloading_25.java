public class Method_Overloading_25 {
    static void tellJoke(){
        System.out.println("What do you call an alligator detective? An investi-gator.");
    }
    static void tellJoke(int a){
        System.out.println(a+ " What do you call an alligator detective? An investi-gator.");
    }
//    static int tellJoke(int a){
//        System.out.println(a+ " What do you call an alligator detective? An investi-gator.");
//    }
//  method overloading cannot happen by changing return type of a method, it can happen only by changing/adding parameters to a method
    public static void main(String[] args) {
        tellJoke();
        tellJoke(3000); //arguments are actual
    }
}

