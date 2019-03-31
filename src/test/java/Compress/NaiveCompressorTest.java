package Compress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NaiveCompressorTest {

    private NaiveCompressor compresor;

    @Before
    public void setUp() throws Exception{
        compresor = new NaiveCompressor();
    }

    @Test
    public void test_compress() {
        String given = "Ala ma kota";
        String expected = "AlaMaKota";
        assertEquals(expected, compresor.compress(given));
    }

    @Test
    public void test_compress_empty() {
        String given = "";
        String expected = "";
        assertEquals(expected, compresor.compress(given));
    }

    @Test
    public void test_compress_mixed_case() {
        String given = "ALA mA kOtA";
        String expected = "AlaMaKota";
        assertEquals(expected, compresor.compress(given));
    }

    @Test
    public void test_uncompress(){
        String given = "AlaMaKota";
        String expected = "ala ma kota";
        assertEquals(expected, compresor.uncompress(given));
    }

    @Test
    public void test_uncompress_empty(){
        String given = "";
        String expected = "";
        assertEquals(expected, compresor.uncompress(given));
    }


}
