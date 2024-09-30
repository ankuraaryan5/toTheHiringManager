public class String_Methods_9 {
    public static void main(String[] args) {
        String name = "Ankur";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("cg"));
        System.out.println(name);
        String new_name= "   ankur   ";
        System.out.println(new_name.length());
        System.out.println(new_name.trim());
        System.out.println(new_name);
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('a','A'));
        System.out.println(name.startsWith("ank"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('r'));
        System.out.println(name.indexOf('w',4));
        System.out.println(name.equals("ankur"));
        System.out.println(name.equals("ankurs"));
        System.out.println(name.equalsIgnoreCase("ankur"));
    }
}
