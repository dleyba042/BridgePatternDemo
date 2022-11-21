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

    //TODO implement the GuitarBridge
    //TODO Implement a ProGuitarist class that uses the more advanced guitar methods,
    // to show extension in the platform independent dimension
    //TODO add a PianoBridge class to show extension in the specific implementation dimension

    /**
     * Test classes
     * @param args NONE
     */
    public static void main(String[] args)
    {
        SheetMusic song = new SheetMusic(List.of("a","g","b","c"));
        //TODO fix this before you can run
        /*
        BasicMusician musician = new BasicMusician(new GuitarBridge(new Guitar()));

        System.out.println();
        musician.checkTuning();
        musician.adjustInstrumentVolume(3);
        musician.playSong(song);

         */
    }
}
