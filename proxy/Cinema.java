

public class Cinema implements Movie{
    
    RealMovie movie;

    public Cinema(RealMovie movie){
        this.movie = movie;
    }


    void playAd(boolean start){
        if(start){
            System.out.println("play ads,begin...");
        }else {
            System.out.println("play ads at ends.");
        }
        
    }


    @Override
    public void play(){
        playAd(true);

        movie.play();

        playAd(false);

    }

}