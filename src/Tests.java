import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by OSV on 13.11.15.
 */
public class Tests {

    int exp;
    int res;
    Triangles t = new Triangles();

    @Test
    public void test1() throws Exception {
        t.triangle("5", "4", "3");
        exp = 5;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void test2() throws Exception {
        t.triangle("5", "3", "5");
        exp = 4;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void test3() throws Exception {
        t.triangle("5", "5", "5");
        exp = 3;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void test4() throws Exception {
        t.triangle("2", "5", "3");
        exp = 2;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }

    @Test
    public void test5 () throws Exception {
        t.triangle("0", "5", "6");
        exp = 2;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void test6 () throws Exception {
        t.triangle("6", "0", "6");
        exp = 2;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void test7 () throws Exception {
        t.triangle("6", "6", "0");
        exp = 2;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void test8 () throws Exception {
        t.triangle("-6", "4", "6");
        exp = 2;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void test9 () throws Exception {
        t.triangle("6", "-4", "6");
        exp = 2;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
    @Test
    public void test10 () throws Exception {
        t.triangle("5", "5", "-8");
        exp = 2;
        res = t.fortest;
        assertEquals("Error", exp, res);
    }
}