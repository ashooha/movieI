package web.pageModle;

import web.entity.tPerformance;

import java.util.List;
import java.util.Set;

public class Room {
    private int id;
    private String name;
    private String type;
    private int sites;
    private Set<Integer> performanceIdList;


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

    public Set<Integer> getPerformanceIdList() {
        return performanceIdList;
    }

    public void setPerformanceIdList(Set<Integer> performanceIdList) {
        this.performanceIdList = performanceIdList;
    }
}
