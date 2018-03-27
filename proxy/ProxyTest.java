
public class ProxyTest {
    
    public static final void main(String[] args){

        RealMovie movie = new RealMovie();

        Cinema cinema = new Cinema(movie);
        cinema.play();
    }




}