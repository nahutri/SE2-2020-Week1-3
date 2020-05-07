/**
 * 
 * @author MyAnna
 * @version SoSe 2020
 *
 */
public class Videospiel implements Medium
{
    /**
     * Der Titel des Videospiels
     */
    private String _titel;
    /**
     * Kommentar des Videospiels
     */
    private String _kommentar;
    /**
     * Das System des Videospiels
     */
    private String _system;

    /**
     * Konstruktor
     * 
     * @param titel
     * @param kommentar
     * @param system
     *          des Videospiel
     * @require titel !=null
     * @require kommentar !=null
     * @require system != null
     * 
     * @ensure getTitel== titel
     * @ensure getKommentar==kommentar
     * @ensure getSystem == system
     *           
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        assert titel != null : "Vorbedingung verletzt:titel ist null";
        assert kommentar != null : "Vorbedingung verletzt:kommentar ist null";
        assert system != null : "Vorbedingung verletzt:system ist null";

        _titel = titel;
        _kommentar = kommentar;
        _system = system;

    }

    /**
     *
     */
    @Override
    public String getKommentar()
    {

        return _kommentar;
    }

    @Override
    public String getMedienBezeichnung()
    {

        return "Videospiel";
    }

    /**
     * 
     */

    @Override
    public String getTitel()
    {

        return _titel;
    }

    /**
     * Gibt das System des Videospiels zurück
     * @return das System des Videospiels
     */

    public String getSystem()
    {
        return _system;
    }

    /**
     *Setzt den Titel
     * @param titel
     * @require titel !=0
     */

    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt:titel ist null";
        _titel = titel;

    }

    /**
     * Setzt das Kommentar
     * @param kommentar
     * @require kommentar != 0
     */

    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt:kommentar ist null";
        _kommentar = kommentar;
    }

    /**
     * Setzt das System
     * @param system
     * @require system !=0
     */

    public void setSystem(String system)
    {
        assert system != null : "Vorbedingung verletzt:system ist null";
        _system = system;
    }

}
