import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by OSV on 11.11.15.
 */
public class Triangles {

    int fortest;

    public boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            System.out.println("Value is not integer");
            return false;
        }
        System.out.println("Value is integer");
        return true;
    }

    public void triangle(String a, String b, String c) throws Exception {
        if (checkString(a) & checkString(b) & checkString(c)) {
            System.out.println("valid value");fortest = 1;System.out.println(fortest);

            Integer a2 = Integer.valueOf(a);
            Integer b2 = Integer.valueOf(b);
            Integer c2 = Integer.valueOf(c);

            if (a2+b2> c2 & a2+c2>b2 & c2+b2 >a2 & a2>0 & b2>0 & c2>0) {
                if (a == b & b == c) {System.out.println("Triangle equilateral");fortest = 3;System.out.println(fortest);
                } else if (a == b || b == c ||a == c) {System.out.println("Triangle isosceles");fortest = 4;System.out.println(fortest);
                } else {System.out.println("Not an equilateral triangle or isosceles");fortest = 5;System.out.println(fortest);
                }

            } else {System.out.println("Triangle does not exist");fortest = 2;System.out.println(fortest);
            }


        } else {System.out.println("Invalid value");fortest = 0;System.out.println(fortest);
        }
    }


    public static void main(String[] args) throws Exception {
        Triangles t = new Triangles();
        t.triangle("1000", "2000", "2000");
    }
}
