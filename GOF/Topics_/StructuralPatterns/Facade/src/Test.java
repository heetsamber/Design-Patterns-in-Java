package Facade;

import java.io.File;

public class Test {
    public static void main(String[] args){
        VideoCoversionFacade converter = new VideoCoversionFacade();
        File mp4Video = converter.convertVideo("youtubeVideo.ogg", "mp4");
    }
}
