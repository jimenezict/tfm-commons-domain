package com.uoc.tfm.commons.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDateTime.now;

public class StationsStatus implements Serializable {

    private List<StationStatus> stationStatusList;
    private final LocalDateTime timestamp;

    public StationsStatus() {
        this.stationStatusList = new ArrayList<>();
        this.timestamp = now();
    }

    public StationsStatus(List<StationStatus> stationStatusList, LocalDateTime timestamp) {
        this.stationStatusList = stationStatusList;
        this.timestamp = timestamp;
    }

    public StationsStatus(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        stationStatusList = new ArrayList<>();
    }

    public List<StationStatus> getStationStatusList() {
        return stationStatusList;
    }

    public void setStationStatusList(List<StationStatus> stationStatusList) {
        this.stationStatusList = stationStatusList;
    }

    public void addStation(int id, int size, int occupacy){
        stationStatusList.add(new StationStatus(id, size, occupacy));
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
