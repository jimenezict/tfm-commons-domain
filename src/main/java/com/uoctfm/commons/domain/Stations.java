package com.uoctfm.commons.domain;

import java.time.LocalDate;
import java.util.List;

public class Stations {

    private final LocalDate date;
    private List<Station> stationList;

    Stations(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Station> getStationList() {
        return stationList;
    }

    public void setStationList(List<Station> stationList) {
        this.stationList = stationList;
    }
}
