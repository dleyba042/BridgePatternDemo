package Driver;

import model.BasicMusician;
import model.Guitar;
import model.SheetMusic;

import java.util.List;

/**
 * Tests our BridgePattern example
 * @author Devin Leyba
 * @version 1.0
 */
public class Main
{
    //TODO implement the missing interface methods

    //TODO Implement a ProGuitarist class that uses these methods

    //TODO add a NEW class that can use the IInstrument interface

    /**
     * Test classes
     * @param args NONE
     */
    public static void main(String[] args)
    {
        SheetMusic song = new SheetMusic(List.of("a","g","b","c"));
        BasicMusician musician = new BasicMusician(new Guitar());

        System.out.println();
        musician.checkTuning();
        musician.adjustInstrumentVolume(3);
        musician.playSong(song);
    }
}
