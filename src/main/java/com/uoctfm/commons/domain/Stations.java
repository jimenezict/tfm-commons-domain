package com.uoctfm.commons.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Stations implements Serializable {

    private final LocalDate date;
    private List<Station> stationList;

    public Stations(LocalDate date) {
        this.date = date;
        stationList = new ArrayList<>();
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Station> getStationList() {
        return stationList;
    }

    public void addStation(int id, double latitude, double longitude, String address){
        stationList.add(new Station(id, latitude, longitude, address));
    }
}
