package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KeySkill {

    @SerializedName("name")
    @Expose
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KeySkill{" +
                "name='" + name + '\'' +
                '}';
    }
}