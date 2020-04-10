package com.uoc.tfm.commons.domain;

import java.io.Serializable;

public class StationStatus implements Serializable {

    private final int id;
    private final int size;
    private final int occupacy;

    public StationStatus() {
        id = 0; size = 1; occupacy = 0;
    }

    public StationStatus(int id, int size, int occupacy) {
        this.id = id;
        this.size = size;
        this.occupacy = occupacy;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public int getOccupacy() {
        return occupacy;
    }
}
