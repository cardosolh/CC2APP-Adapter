package des_pat_adapter;

public class MkvPlayer implements AnotherAdvancedMediaPlayer {
    @Override
    public void playMkv(String fileName){
        System.out.println("Playing mkv file. Name: "+fileName);
    }
    @Override
    public void playFlac(String fileName){
        //do nothing
    }
}
