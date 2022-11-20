package interfaces;

/**
 * The bridge interface
 * @author Devin Leyba
 * @version 1.0
 */
public interface IInstrument
{
    /**
     * @param note to play
     */
    void playNote(String note);

    /**
     * @param volume of instrument
     */
    void setVolume(int volume);

    /**
     * tune instrument
     */
    void tuneUp();

    //TODO implement these
    //void modulateNote(String note, int degree);
    //void setEffect(String effect);
}
