package web.pageModle;

import java.util.Date;
import java.util.List;
import java.util.Set;


public class Movie {
    private int id;
    private String movieName;
    private String director;
    private String actors;
    private Date showDate;
    private String country;
    private Double timeLength;
    private String language;
    private String intro;
    private Date offTime;
    private int heat;
    private Set<Integer> performanceIdList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(Double timeLength) {
        this.timeLength = timeLength;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Date getOffTime() {
        return offTime;
    }

    public void setOffTime(Date offTime) {
        this.offTime = offTime;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public Set<Integer> getPerformanceIdList() {
        return performanceIdList;
    }

    public void setPerformanceIdList(Set<Integer> performanceIdList) {
        this.performanceIdList = performanceIdList;
    }
}
