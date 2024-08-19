
    public class FormattedPrinting
    {
        public static void main (String[]args)
        {
            System.out.printf("Color:%s%n FirstI:%c%n", "pink", 'Y');
            String age = String.format("Age:%d", 21);
            System.out.println(age);
        }//end main
    }//end class