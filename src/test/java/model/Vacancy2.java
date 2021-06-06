package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vacancy2 implements Serializable {
    public Vacancy2() {
    }

    public Vacancy2(String id, Boolean premium, String name, Object department, Boolean has_Test, Boolean responseLetterRequired, Area area, Object salary, Type type, Object address, Object responseUrl, Object sortPointDistance, String publishedAt, String createdAt, Boolean archived, String applyAlternateUrl, Object insiderInterview, String url, String alternateUrl, List<Object> relations, Employer employer, Snippet snippet, Object contacts, Schedule schedule, List<Object> workingDays, List<Object> workingTimeIntervals, List<Object> workingTimeModes, Boolean acceptTemporary) {
        this.id = id;
        this.premium = premium;
        this.name = name;
        this.department = department;
        this.has_Test = has_Test;
        this.responseLetterRequired = responseLetterRequired;
        this.area = area;
        this.salary = salary;
        this.type = type;
        this.address = address;
        this.responseUrl = responseUrl;
        this.sortPointDistance = sortPointDistance;
        this.publishedAt = publishedAt;
        this.createdAt = createdAt;
        this.archived = archived;
        this.applyAlternateUrl = applyAlternateUrl;
        this.insiderInterview = insiderInterview;
        this.url = url;
        this.alternateUrl = alternateUrl;
        this.relations = relations;
        this.employer = employer;
        this.snippet = snippet;
        this.contacts = contacts;
        this.schedule = schedule;
        this.workingDays = workingDays;
        this.workingTimeIntervals = workingTimeIntervals;
        this.workingTimeModes = workingTimeModes;
        this.acceptTemporary = acceptTemporary;
    }

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("premium")
    @Expose
    private Boolean premium;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("department")
    @Expose
    private Object department;
    @SerializedName("has_test")
    @Expose
    private Boolean has_Test;
    @SerializedName("response_letter_required")
    @Expose
    private Boolean responseLetterRequired;
    @SerializedName("area")
    @Expose
    private Area area;
    @SerializedName("salary")
    @Expose
    private Object salary;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("response_url")
    @Expose
    private Object responseUrl;
    @SerializedName("sort_point_distance")
    @Expose
    private Object sortPointDistance;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("apply_alternate_url")
    @Expose
    private String applyAlternateUrl;
    @SerializedName("insider_interview")
    @Expose
    private Object insiderInterview;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("alternate_url")
    @Expose
    private String alternateUrl;
    @SerializedName("relations")
    @Expose
    private List<Object> relations = null;
    @SerializedName("employer")
    @Expose
    private Employer employer;
    @SerializedName("snippet")
    @Expose
    private Snippet snippet;
    @SerializedName("contacts")
    @Expose
    private Object contacts;
    @SerializedName("schedule")
    @Expose
    private Schedule schedule;
    @SerializedName("working_days")
    @Expose
    private List<Object> workingDays = null;
    @SerializedName("working_time_intervals")
    @Expose
    private List<Object> workingTimeIntervals = null;
    @SerializedName("working_time_modes")
    @Expose
    private List<Object> workingTimeModes = null;
    @SerializedName("accept_temporary")
    @Expose
    private Boolean acceptTemporary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDepartment() {
        return department;
    }

    public void setDepartment(Object department) {
        this.department = department;
    }

    public Boolean getHas_Test() {
        return has_Test;
    }

    public void setHas_Test(Boolean has_Test) {
        this.has_Test = has_Test;
    }

    public Boolean getResponseLetterRequired() {
        return responseLetterRequired;
    }

    public void setResponseLetterRequired(Boolean responseLetterRequired) {
        this.responseLetterRequired = responseLetterRequired;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Object getSalary() {
        return salary;
    }

    public void setSalary(Object salary) {
        this.salary = salary;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getResponseUrl() {
        return responseUrl;
    }

    public void setResponseUrl(Object responseUrl) {
        this.responseUrl = responseUrl;
    }

    public Object getSortPointDistance() {
        return sortPointDistance;
    }

    public void setSortPointDistance(Object sortPointDistance) {
        this.sortPointDistance = sortPointDistance;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getApplyAlternateUrl() {
        return applyAlternateUrl;
    }

    public void setApplyAlternateUrl(String applyAlternateUrl) {
        this.applyAlternateUrl = applyAlternateUrl;
    }

    public Object getInsiderInterview() {
        return insiderInterview;
    }

    public void setInsiderInterview(Object insiderInterview) {
        this.insiderInterview = insiderInterview;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlternateUrl() {
        return alternateUrl;
    }

    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    public List<Object> getRelations() {
        return relations;
    }

    public void setRelations(List<Object> relations) {
        this.relations = relations;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    public Object getContacts() {
        return contacts;
    }

    public void setContacts(Object contacts) {
        this.contacts = contacts;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Object> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(List<Object> workingDays) {
        this.workingDays = workingDays;
    }

    public List<Object> getWorkingTimeIntervals() {
        return workingTimeIntervals;
    }

    public void setWorkingTimeIntervals(List<Object> workingTimeIntervals) {
        this.workingTimeIntervals = workingTimeIntervals;
    }

    public List<Object> getWorkingTimeModes() {
        return workingTimeModes;
    }

    public void setWorkingTimeModes(List<Object> workingTimeModes) {
        this.workingTimeModes = workingTimeModes;
    }

    public Boolean getAcceptTemporary() {
        return acceptTemporary;
    }

    public void setAcceptTemporary(Boolean acceptTemporary) {
        this.acceptTemporary = acceptTemporary;
    }

    @Override
    public String toString() {
        return "Vacancy2{" +
                "id='" + id + '\'' +
                ", premium=" + premium +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", hasTest=" + has_Test +
                ", response_Letter_Required=" + responseLetterRequired +
                ", area=" + area +
                ", salary=" + salary +
                ", type=" + type +
                ", address=" + address +
                ", responseUrl=" + responseUrl +
                ", sortPointDistance=" + sortPointDistance +
                ", publishedAt='" + publishedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", archived=" + archived +
                ", applyAlternateUrl='" + applyAlternateUrl + '\'' +
                ", insiderInterview=" + insiderInterview +
                ", url='" + url + '\'' +
                ", alternateUrl='" + alternateUrl + '\'' +
                ", relations=" + relations +
                ", employer=" + employer +
                ", snippet=" + snippet +
                ", contacts=" + contacts +
                ", schedule=" + schedule +
                ", workingDays=" + workingDays +
                ", workingTimeIntervals=" + workingTimeIntervals +
                ", workingTimeModes=" + workingTimeModes +
                ", acceptTemporary=" + acceptTemporary +
                '}';
    }

}