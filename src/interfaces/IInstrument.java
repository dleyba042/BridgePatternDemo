package interfaces;

/**
 * The bridge interface, the implementation part, this would be like the reference to
 * the underlying system api in our real world example
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

     void modulateNote(String note, int degree);
     void setEffect(String effect);
}
