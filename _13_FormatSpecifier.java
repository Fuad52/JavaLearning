public class _13_FormatSpecifier {
    

    public static void main(String[] args){

        boolean bln = true;

        char chr = 'F';
        
        byte byt = 46;

        short shrt = 52;

        int intgr = 0124654;

        long lng = 4654654646L;

        float flt = 654.254f;

        double dbl = 465413.564651465665254;

        System.out.printf("Boolean values: %b\n", bln);
        System.out.printf("character value: %c\n", chr);
        System.out.printf("Byte values is: %d\n", byt);
        System.out.printf("Short value: %d\n", shrt);
        System.out.printf("Integer value: %d\n", intgr);
        System.out.printf("Long value: %d\n", lng);
        System.out.printf("Float value: %f\n", flt);
        System.out.printf("Double value: %.3f\n", dbl);
    }
}
