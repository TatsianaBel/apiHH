package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metro {

    @SerializedName("station_name")
    @Expose
    private String stationName;
    @SerializedName("line_name")
    @Expose
    private String lineName;
    @SerializedName("station_id")
    @Expose
    private String stationId;
    @SerializedName("line_id")
    @Expose
    private String lineId;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Metro{" +
                "stationName='" + stationName + '\'' +
                ", lineName='" + lineName + '\'' +
                ", stationId='" + stationId + '\'' +
                ", lineId='" + lineId + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}