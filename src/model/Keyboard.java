package model;

public class Keyboard
{
    protected int volume = 0;
    protected String effect = "Neutral";

    public void playKey(String note)
    {
        System.out.printf("\nPressed the " + note + " key on the Piano at a volume of %d",volume);
        if(!effect.equals("Neutral"))
        {
            System.out.printf(" with a %s effect!\n",effect);
        }
    }

    public void adjustVolumeKnob(int volume)
    {
        this.volume = volume;
    }

    public void callTuner()
    {
        System.out.println("Downloading tuning software...");
    }

    public void useModulatorKnob(String note,int steps)
    {
        playKey(note);
        System.out.printf(" and modulated using modulator Knob by %s steps!\n",steps);
    }

    public void setEffect(String effect)
    {
       this.effect = effect;
    }
}
