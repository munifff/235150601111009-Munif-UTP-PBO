public class Studio {
    Movie movie;
    String type;
    boolean seats[][];

    public Studio(String Studio){
        return;
    }

    public Movie getStudioInfo() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean[][] getSeats() {
        return seats;
    }

    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }

}
