public class ConstructorNull {

    public ConstructorNull(Object object)
    {
  System.out.println("Object constructor");
    }
    public ConstructorNull(String object)
    {
        System.out.println("String constructor");
    }
    public ConstructorNull(Integer object)
    {
        System.out.println("Integer constructor");
    }
    public static void main(String args[])
    {
        int i=0;
        ConstructorNull constructorNull=new ConstructorNull(new String("ggsy"));
        try
        {
            throw new Exception(new NumberFormatException());
        }
        catch (Exception e)
        {
            i=1;
        }
        finally {
            System.out.println("In Finally---------------------       "+i);
            try {
                throw new ArithmeticException();
                //System.out.println("after execption in finally");
            }
            catch(Exception e)
            {
                System.out.println("After exception in finally");
            }
            finally {
                System.out.println("done");
            }

        }
    }
}
