package interfaces;

import model.SheetMusic;

public abstract class AbstractMusician
{
    //The strategy pattern relies on just being able to switch out one algorithm that has
    //a similar interface where the Bridge pattern has an object being part of the composition
    //that can have many methods within it
    protected IInstrument instrument;
    public abstract void playSong(SheetMusic song);
    public abstract void checkTuning();
    public abstract void adjustInstrumentVolume(int volume);
}
