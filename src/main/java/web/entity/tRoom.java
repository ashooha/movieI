package web.entity;


import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class tRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column private String name;
    @Column private String type;
    @Column private int sites;
//    @Column(name = "room_id")
    @OneToMany(targetEntity = tPerformance.class)
    @JoinColumn(name = "room_id")
    private List<tPerformance> tPerformanceList;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSites() {
        return sites;
    }

    public void setSites(int sites) {
        this.sites = sites;
    }

    public List<tPerformance> gettPerformanceList() {
        return tPerformanceList;
    }

    public void settPerformanceList(List<tPerformance> tPerformanceList) {
        this.tPerformanceList = tPerformanceList;
    }
}
