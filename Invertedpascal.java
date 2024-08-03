import java.util.*;
class Invertedpascal
{
public static void main(String arg[])
{
int rows = 5; 
        for (int i = rows; i >=0; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            int value = 1;
            for (int j = 0; j <= i; j++) {
                if (value != 0) {
                    System.out.print("* ");
                }
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}