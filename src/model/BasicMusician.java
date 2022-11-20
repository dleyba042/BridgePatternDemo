package model;

import interfaces.IInstrument;

/**
 * The RefinedAbstraction part of the Bridge Pattern. A concrete implementation of the
 * abstraction. We can further refine by creating a ProMusician class
 */

public class BasicMusician extends AbstractMusician
{
    /**
     * @param instrument the bridge
     */
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
