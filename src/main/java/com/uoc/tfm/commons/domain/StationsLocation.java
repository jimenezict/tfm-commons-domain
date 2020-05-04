package com.uoc.tfm.commons.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.now;

public class StationsLocation implements Serializable {

    private final LocalDate date;
    private List<StationLocation> stationLocationList;

    public StationsLocation() {
        this.date = now();
        stationLocationList = new ArrayList<>();
    }
    public StationsLocation(LocalDate date, List<StationLocation> stationLocationList) {
        this.date = date;
        this.stationLocationList = stationLocationList;
    }

    public StationsLocation(LocalDate date) {
        this.date = date;
        stationLocationList = new ArrayList<>();
    }

    public LocalDate getDate() {
        return date;
    }

    public List<StationLocation> getStationLocationList() {
        return stationLocationList;
    }

    public void addStation(int id, double latitude, double longitude, String address){
        stationLocationList.add(new StationLocation(id, latitude, longitude, address));
    }
}
