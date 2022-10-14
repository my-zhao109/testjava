package test.arraylist;

public class Movie {
    private String name;
    private Double score;
    private String acort;

    public Movie(){

    }
    public Movie(String name, Double score, String acort) {
        this.name = name;
        this.score = score;
        this.acort = acort;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getAcort() {
        return acort;
    }

    public void setAcort(String acort) {
        this.acort = acort;
    }
}
