package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Specialization {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("profarea_id")
    @Expose
    private String profareaId;
    @SerializedName("profarea_name")
    @Expose
    private String profareaName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfareaId() {
        return profareaId;
    }

    public void setProfareaId(String profareaId) {
        this.profareaId = profareaId;
    }

    public String getProfareaName() {
        return profareaName;
    }

    public void setProfareaName(String profareaName) {
        this.profareaName = profareaName;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", profareaId='" + profareaId + '\'' +
                ", profareaName='" + profareaName + '\'' +
                '}';
    }
}