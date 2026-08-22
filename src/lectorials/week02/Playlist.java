package lectorials.week02;

import java.util.LinkedList;

public class Playlist {
    public static void main(String[] args) {
        LinkedList<Playable> p1 = new LinkedList<Playable>();
        p1.add(new AudioPlayer());
        p1.add(new VideoPlayer());

        for(Playable item:p1){
            item.play();
        }
    }
}
