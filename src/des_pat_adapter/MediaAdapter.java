package des_pat_adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    AnotherAdvancedMediaPlayer anotherAdvancedMediaPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new VlcPlayer();
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer = new Mp4Player();
        else if (audioType.equalsIgnoreCase("flac"))
            anotherAdvancedMediaPlayer = new FlacPlayer();
        else if (audioType.equalsIgnoreCase("mkv"))
            anotherAdvancedMediaPlayer = new MkvPlayer();
    }
    @Override
    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVlc(fileName);
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.playMp4(fileName);
        else if(audioType.equalsIgnoreCase("flac"))
            anotherAdvancedMediaPlayer.playFlac(fileName);
        else if (audioType.equalsIgnoreCase("mkv"))
            anotherAdvancedMediaPlayer.playMkv(fileName);
    }
}

