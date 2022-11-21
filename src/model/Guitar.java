package model;

/**
 * This is a class that we need a bridge to, in order to use in our musician class
 */

public class Guitar
{
    protected int volume = 0;
    protected String effect = "Neutral";

    public void pluckString(String note)
    {
        System.out.printf("\nPlucked the " + note + " note on the Guitar at a volume of %d",volume);
        if(!effect.equals("Neutral"))
        {
            System.out.printf(" with a %s effect!\n",effect);
        }
    }

    public void adjustVolumeKnob(int volume)
    {
        this.volume = volume;
    }

    public void adjustTuningPegs()
    {
        System.out.println("Adjusted the guitar tuning pegs");
    }

    public void bendNote(String note,int steps)
    {
        pluckString(note);
        System.out.printf(" and bent by %s steps!",steps);
    }

    public void setEffect(String effect)
    {
        this.effect = effect;
    }
}
