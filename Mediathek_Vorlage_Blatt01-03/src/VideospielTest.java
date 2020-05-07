import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VideospielTest
{
    private static final String SYSTEM = "System";
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private Videospiel _videospiel1;
    private Videospiel _videospiel2;

    @Before
    public void setUp()
    {
        _videospiel1 = getMedium();
        _videospiel2 = getMedium();

    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _videospiel1.getTitel());
        assertEquals(KOMMENTAR, _videospiel1.getKommentar());
        assertEquals(SYSTEM, _videospiel1.getSystem());

    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videospiel2.getMedienBezeichnung());
    }

    @Test
    public void testSetter()
    {

    }

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }

}
