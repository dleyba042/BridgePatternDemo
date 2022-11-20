package model;

import interfaces.IInstrument;

/**
 * A concrete bridge interface implementer.
 * This would be like the API reference in our real world example.
 */
public class Guitar implements IInstrument
{
    protected int volume = 0;
    protected String effect = "Neutral";


    @Override
    public void playNote(String note)
    {
        System.out.printf("\nStrummed the " + note + " on the Guitar at a volume of %d ",volume);
        //TODO maybe we can add something here to harness any sound effects -> FOR SET EFFECT
    }

    @Override
    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    @Override
    public void tuneUp()
    {
        System.out.println("Adjusted the guitar tuning pegs");
    }
}
