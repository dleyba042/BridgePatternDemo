package model;


import interfaces.AbstractMusician;
import interfaces.IInstrument;

public class BasicMusician extends AbstractMusician
{
    protected IInstrument instrument;

    public BasicMusician(IInstrument instrument)
    {
        this.instrument = instrument;
    }

    @Override
    public void playSong(SheetMusic song)
    {
        song.getSheet().forEach(instrument::playNote);
    }

    @Override
    public void checkTuning()
    {
        instrument.tuneUp();
    }

    @Override
    public void adjustInstrumentVolume(int volume)
    {
        instrument.setVolume(volume);
    }

}
