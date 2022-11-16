package Driver;

import model.BasicMusician;
import model.Guitar;
import model.SheetMusic;

import java.util.List;

public class Main
{

    //TODO implement the missing interface methods
    //TODO Implement a ProGuitarist class that uses these methods
    //TODO add a NEW class that can use the IInstrument interface

    public static void main(String[] args)
    {
        SheetMusic song = new SheetMusic(List.of("a","g","b","c"));
        BasicMusician musician = new BasicMusician(new Guitar());

        musician.checkTuning();
        musician.adjustInstrumentVolume(3);
        musician.playSong(song);

    }
}
