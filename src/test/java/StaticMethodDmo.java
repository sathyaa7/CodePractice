public class StaticMethodDmo {
    public static void main(String args[]) {
       StaticMethodDmo obj = new StaticMethodDmo();
       obj.nonStaticMethod1();
//        obj.staticMethod1();
        StaticMethodDmo nullObj = null;
        nullObj.staticMethod1();
 //       staticMethod1();
    }

    public static void staticMethod1() {
        System.out.println("Static method called");
    }

    public void nonStaticMethod1() {
        System.out.println("Non static method called");
    }
}
