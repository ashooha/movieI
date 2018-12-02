package web.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "performance")
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(targetEntity = Movie.class)
    @JoinColumn(nullable = false,name = "movie_id")
    private Movie movieId;
    @ManyToOne(targetEntity = Room.class)
    @JoinColumn(nullable = false,name = "room_id")
    private Room roomId;
    @Column private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovieId() {
        return movieId;
    }

    public void setMovieId(Movie movieId) {
        this.movieId = movieId;
    }

    public Room getRoomId() {
        return roomId;
    }

    public void setRoomId(Room roomId) {
        this.roomId = roomId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
