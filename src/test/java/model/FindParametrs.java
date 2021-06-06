package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindParametrs {
    @Builder.Default
    @SerializedName("text")
    private String text = "text";
    private String search_field;
    private String experience;
    private String employment;
    private String schedule;
    private String area = "area";
    private String metro;
    private String specialization;
    private String industry;
    private String employer_id;
    private String currency;
    private String salary = "salary";
    private String label;
    private String only_with_salary="only_with_salary";
    private String period = "period";
    private String date_from;
    private String date_to;
    private String order_by;
    private String per_page;
    private String part_time;

}
