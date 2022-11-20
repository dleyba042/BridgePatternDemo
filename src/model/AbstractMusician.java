package model;

import interfaces.IInstrument;

/**
 * The Abstraction part of the Bridge Pattern. One of the dimensions we can expand in
 * This would be like the VirtualBox from our real world example.
 *@author Devin Leyba
 *  @version 1.0
 */
public abstract class AbstractMusician
{
    //the bridge is being composed here
    protected IInstrument instrument;

    /**
     * @param song to play
     */
    public abstract void playSong(SheetMusic song);

    /**
     * tune composed instrument
     */
    public abstract void checkTuning();

    /**
     * @param volume adjust volume
     */
    public abstract void adjustInstrumentVolume(int volume);

    @Override
    public String toString() {
        return "AbstractMusician{" +
                "instrument=" + instrument +
                '}';
    }
}
