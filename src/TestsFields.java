import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by OSV on 14.11.15.
 */
public class TestsFields {
    int exp;
    int res;
    Triangles t = new Triangles();

    @Test
    public void testFields1() throws Exception {
        t.triangle("shdg", "4", "3");
        exp = 0;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void testFields2() throws Exception {
        t.triangle("5", "b", "3");
        exp = 0;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void testFields3() throws Exception {
        t.triangle("5", "5", "zxz");
        exp = 0;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void testFieldsUn1() throws Exception {
        for (int ind = 32; ind < 48; ind++){
            char m = (char)ind;
            String a = String.valueOf(m);
            String b = "6";
            String c = "88";

            t.triangle(a, b, c);
            exp = 0;
            res = t.fortest;
            assertEquals("Error", exp, res);
        }
    }

    @Test
    public void testFieldsUn2() throws Exception {
        for (int ind = 32; ind < 48; ind++){
            char m = (char)ind;
            String a = "32";
            String b = String.valueOf(m);;
            String c = "88";

            t.triangle(a, b, c);
            exp = 0;
            res = t.fortest;
            assertEquals("Error", exp, res);
        }
    }

    @Test
    public void testFieldsUn3() throws Exception {
        for (int ind = 32; ind < 48; ind++){
            char m = (char)ind;
            String a = "32";
            String b = "0";
            String c = String.valueOf(m);


            t.triangle(a, b, c);
            exp = 0;
            res = t.fortest;
            assertEquals("Error", exp, res);
        }
    }
}