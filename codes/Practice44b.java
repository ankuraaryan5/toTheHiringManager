// import folder.folder1.folder2;
import folder.folder1.folder2.Practice_44a;

class Subclass extends Practice_44a{
     Subclass(){
        // System.out.println(s); // can't access from outside the package
        System.out.println(e);
    }
}
public class Practice44b {
    public static void main(String[] args) {
        Subclass s = new Subclass();
    }   
}
