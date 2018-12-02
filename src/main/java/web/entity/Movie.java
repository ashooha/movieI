package web.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "movie_name") private String movieName;
    @Column private String director;
    @Column private String actors;
    @Column(name = "show_date") private Date showDate;
    @Column private String country;
    @Column(name = "time_length") private Double timeLength;
    @Column private String language;
    @Column private String intro;
    @Column(name = "off_time") private Date offTime;
    @Column private int heat;
//    @Column(name = "movie_id")
    @OneToMany(targetEntity = Performance.class)
    @JoinColumn(name = "movie_id")
    private List<Performance> performanceList;

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

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

    public List<Performance> getPerformanceList() {
        return performanceList;
    }

    public void setPerformanceList(List<Performance> performanceList) {
        this.performanceList = performanceList;
    }
}
