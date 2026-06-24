import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // byte    1 byte   -128  -   127
        // short   2 byte   -32k   - 32k
        // int     4 byte   -2b   -    2b
        // long    8 byte

        // float   4 byte
        // double  8 byte

        // char
        // boolean 1 byte

        // Primitive
        int age = 14;
        byte avg = 12;
        long phone = 123-456-890-111-144;
        int herAge = age;
        System.out.println(herAge);

        //Refrens
        Date d = new Date();
        System.out.println(d);
        }
    }