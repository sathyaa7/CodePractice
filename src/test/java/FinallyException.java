public class FinallyException {
    public static void main(String[] args) {
        try {
            int var1 = 7 / 0;
            System.out.println("LINE AFTER EXCEPTION IN TRY BLOCK 1"); //SKIPPED
        }
        catch (ArithmeticException e)
        {
            System.out.println("Catch block 1 is executed");
        }
        finally {
            try {
                int var2 = 7 / 0;
                System.out.println("LINE AFTER EXCEPTION IN TRY BLOCK INSIDE FINALLY"); //SKIPPED
            }
            catch (ArithmeticException e)
            {
                System.out.println("Catch block 2 is executed");
            }
            finally {
                System.out.println("Finally block 2 is executed");
            }

        }
    }
}
