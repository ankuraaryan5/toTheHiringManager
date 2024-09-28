package folder.folder1.folder2;
class Prove{
    int a=5;
    protected int b =90;
    Prove(){
        System.out.println(a);
        System.out.println(b);
    }
}
// class Subclass extends Prove{
//     int z = this.a;
//     int c = this.b;
//     Subclass(){
//         System.out.println(z);
//         System.out.println(c);
//     }
// }
public class Practice_44a {
    int s = 56;
    protected int e =53;
    public static void main(String[] args) {
        Prove p = new Prove();
        // Subclass s = new Subclass();
    }
}
