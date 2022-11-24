package streamAPI;

public class Movies {
	String name,director,hero;
	int releace;
	public int getReleace() {
		return releace;
	}
	public void setReleace(int releace) {
		this.releace = releace;
	}
	double rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Movies(String name, String director, String hero, double rating,int releace) {
		this.name = name;
		this.director = director;
		this.hero = hero;
		this.rating = rating;
		this.releace=releace;
	}
	public String toString() {
		return "Movies [name=" + name + ", director=" + director + ", hero=" + hero + ", releace=" + releace
				+ ", rating=" + rating + "]";
	}
}
