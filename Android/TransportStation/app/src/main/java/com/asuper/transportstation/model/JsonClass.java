package com.asuper.transportstation.model;

/**
 * Created by super on 2017-10-17.
 */

public class JsonClass
{
    private StationDayTrnsitNmpr StationDayTrnsitNmpr;

    public StationDayTrnsitNmpr getStationDayTrnsitNmpr () {
        return StationDayTrnsitNmpr;
    }

    public void setStationDayTrnsitNmpr (StationDayTrnsitNmpr StationDayTrnsitNmpr) {
        this.StationDayTrnsitNmpr = StationDayTrnsitNmpr;
    }

    @Override
    public String toString() {
        return "ClassPojo [StationDayTrnsitNmpr = "+StationDayTrnsitNmpr+"]";
    }
}