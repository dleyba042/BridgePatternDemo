package model;

import java.util.List;

/**
 * Helper class -> just stores a "song" in an ArrayList of notes
 */
public class SheetMusic
{
    private List<String> sheet;

    public SheetMusic(List<String> sheet)
    {
        this.sheet = sheet;
    }

    public List<String> getSheet()
    {
        return sheet;
    }

    public void setSheet(List<String> sheet)
    {
        this.sheet = sheet;
    }
}
