public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("byte = " + p.b);
        System.out.println("short = " + p.s);
        System.out.println("int = " + p.i);
        System.out.println("long = " + p.l);
        System.out.println("float = " + p.f);
        System.out.println("double = " + p.d);
        System.out.println("boolean = " + p.bool);
        System.out.println("char = " + (int)p.c);
        System.out.println("str = " + p.str);
        System.out.println("child = " + p.child);
    }
}