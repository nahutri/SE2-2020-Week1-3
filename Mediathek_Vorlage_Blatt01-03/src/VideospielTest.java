import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        _videospiel2.setTitel("titel2");
        assertEquals("titel2", _videospiel2.getTitel());
        _videospiel1.setKommentar(KOMMENTAR);
        assertEquals(KOMMENTAR, _videospiel1.getKommentar());
        _videospiel2.setSystem(SYSTEM);
        assertEquals(SYSTEM, _videospiel2.getSystem());

    }

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testGetFormatiertenString()
    {
        assertNotNull(_videospiel1.getFormatiertenString());

    }

}
