package lista01.ex07;

public class Program {
    public static void main(String[] args) {
        YoutubeVideo youtubeVideo = new YoutubeVideo(); 
        FaceVideo faceVideo = new FaceVideo(); 
        
        VideoPlayer videoPlayer = new VideoPlayer(faceVideo);
        videoPlayer.play();
        
        videoPlayer.setiVideo(youtubeVideo);
        videoPlayer.play();
    }
}
