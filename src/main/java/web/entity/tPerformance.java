package web.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "performance")
public class tPerformance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(targetEntity = tMovie.class)
    @JoinColumn(nullable = false,name = "movie_id")
    private tMovie tMovieId;
    @ManyToOne(targetEntity = tRoom.class)
    @JoinColumn(nullable = false,name = "room_id")
    private tRoom tRoomId;
    @Column private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public tMovie gettMovieId() {
        return tMovieId;
    }

    public void settMovieId(tMovie tMovieId) {
        this.tMovieId = tMovieId;
    }

    public tRoom gettRoomId() {
        return tRoomId;
    }

    public void settRoomId(tRoom tRoomId) {
        this.tRoomId = tRoomId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
