package lista01.ex07;

public class VideoPlayer {
    private IVideo iVideo;

    public VideoPlayer(IVideo iVideo) {
        this.iVideo = iVideo;
    }

    public IVideo getiVideo() {
        return iVideo;
    }

    public void setiVideo(IVideo iVideo) {
        this.iVideo = iVideo;
    }
    
    public void play() {
        System.out.println(getiVideo().getContent());
    }
}
