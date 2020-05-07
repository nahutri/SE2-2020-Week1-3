import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team
 * @version SoSe 2020
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        // TODO Aufgabe 3.4.2 Die Mediendetails sollen angezeigt werden
        selectedMedienTextArea.setText("");
        for (Medium medium : medien)
        {
            if (medium instanceof CD)
            {
                medium = (CD) medium;
                selectedMedienTextArea.setText(medium.getTitel());
            }
            if (medium instanceof DVD)
            {
                medium = (DVD) medium;
                selectedMedienTextArea.setText(medium.getTitel());
            }
            if (medium instanceof Videospiel)
            {
                medium = (Videospiel) medium;
                selectedMedienTextArea.setText(medium.getTitel());
            }
        }
    }

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public JPanel getUIPanel()
    {
        return _ui.getUIPanel();
    }
}
