package model;

import interfaces.IInstrument;

public class Guitar implements IInstrument
{
    protected int volume = 0;
    protected String effect = "Neutral";

    @Override
    public void playNote(String note)
    {
        System.out.printf("\nStrummed the " + note + " on the Guitar at a volume of %d ",volume);
    }

    @Override
    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public void tuneUp()
    {
        System.out.println("Adjusted the guitar tuning pegs");
    }
}
