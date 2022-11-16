package interfaces;

public interface IInstrument
{
    void playNote(String note);

   // void modulateNote(String note, int degree);
   //  void setEffect(String effect);
    void setVolume(int volume);

    void tuneUp();
}
