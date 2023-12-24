class strings{
    public static void main(String[] args) {
        String a = "Aditi";
        String b = "Aditi";
        System.out.println(a == b); //true

        String c = new String("Ganji");
        String d = new String("Ganji");
        System.out.println(c == d);  //false even tough strings are same because we have created new objects.

        System.out.println(c.equals(d));
        System.out.println(a.charAt(0));
        
    }
}