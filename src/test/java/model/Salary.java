package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Salary {

    @SerializedName("from")
    @Expose
    private Object from;
    @SerializedName("to")
    @Expose
    private Integer to;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("gross")
    @Expose
    private Boolean gross;

    public Object getFrom() {
        return from;
    }

    public void setFrom(Object from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getGross() {
        return gross;
    }

    public void setGross(Boolean gross) {
        this.gross = gross;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "from=" + from +
                ", to=" + to +
                ", currency='" + currency + '\'' +
                ", gross=" + gross +
                '}';
    }
}