/** A class representing individual songs.
 *  @author Surya Duggirala
 *  */
public class Song {
    private String _fileName;

    /** Constructor */
    public Song(String song) {
        _fileName = song;
    }

    /** Plays the song. */
    public void play() {
        StdAudio.play(FILE_NAME);
    }

    /** Access method. Returns the filename. */
    public String getFileName() {
        return _fileName;
    }
}