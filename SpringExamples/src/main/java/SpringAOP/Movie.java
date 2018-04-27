package SpringAOP;
class Movie{

private String movieName;
private String movieReleaseDate;

public Movie(String name,String date){
this.movieName = name;
this.movieReleaseDate = date;

}


public void displayMovieInfo(){
System.out.println( this.movieName+" and "+ this.movieReleaseDate);
}


}