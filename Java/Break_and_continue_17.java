public class Break_and_continue_17 {
    public static void main(String[] args) {
        //break and continue using loops
        for (int i=0; i<5; i++){
            System.out.println(i);
            if (i==2){
                System.out.println("ending the loop");
                break;
            }
        }
        for (int j=0; j<5; j++){
//            System.out.println(j);
            if (j==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(j);
        }
    }
}