package Paginator;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaginatorTest {


    @Test
    public void paginateTest(){
        Paginator paginator = new Paginator(3);
        String given = "Ala ma kota";
        String[] expected = {"Ala", " ma", " ko", "ta"};
        assertArrayEquals(expected, paginator.paginate(given));
    }

    @Test
    public void paginateEmptyTest(){
        Paginator paginator = new Paginator(160);
        String given = "";
        String[] expected = {""};
        assertArrayEquals(expected, paginator.paginate(given));
    }

    @Test
    public void paginateShortTekst(){
        Paginator paginator = new Paginator(160);
        String given = "Ala ma kota";
        String[] expected = {"Ala ma kota"};
        assertArrayEquals(expected, paginator.paginate(given));
    }


}
