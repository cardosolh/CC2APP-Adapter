package des_pat_adapter;

public class FlacPlayer implements AnotherAdvancedMediaPlayer {
    @Override
    public void playFlac(String fileName){
        System.out.println("Playing flac file. Name: "+fileName);
    }
    @Override
    public void playMkv(String fileName){
        //do nothing
    }
}
