package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vacancy implements Serializable {
    public Vacancy() {
    }

    public Vacancy(String id, Boolean premium, BillingType billingType, List<Object> relations, String name, Object insiderInterview, Boolean responseLetterRequired, Area area, Salary salary, Type type, Address address, Boolean allowMessages, Site site, Experience experience, Schedule schedule, Employment employment, Object department, Object contacts, String description, Object brandedDescription, Object vacancyConstructorTemplate, List<KeySkill> keySkills, Boolean acceptHandicapped, Boolean acceptKids, Boolean archived, Object responseUrl, List<Specialization> specializations, Object code, Boolean hidden, Boolean quickResponsesAllowed, List<Object> driverLicenseTypes, Boolean acceptIncompleteResumes, Employer employer, String publishedAt, String createdAt, Object negotiationsUrl, Object suitableResumesUrl, String applyAlternateUrl, Boolean hasTest, Object test, String alternateUrl, List<Object> workingDays, List<Object> workingTimeIntervals, List<Object> workingTimeModes, Boolean acceptTemporary) {
        this.id = id;
        this.premium = premium;
        this.billingType = billingType;
        this.relations = relations;
        this.name = name;
        this.insiderInterview = insiderInterview;
        this.responseLetterRequired = responseLetterRequired;
        this.area = area;
        this.salary = salary;
        this.type = type;
        this.address = address;
        this.allowMessages = allowMessages;
        this.site = site;
        this.experience = experience;
        this.schedule = schedule;
        this.employment = employment;
        this.department = department;
        this.contacts = contacts;
        this.description = description;
        this.brandedDescription = brandedDescription;
        this.vacancyConstructorTemplate = vacancyConstructorTemplate;
        this.keySkills = keySkills;
        this.acceptHandicapped = acceptHandicapped;
        this.acceptKids = acceptKids;
        this.archived = archived;
        this.responseUrl = responseUrl;
        this.specializations = specializations;
        this.code = code;
        this.hidden = hidden;
        this.quickResponsesAllowed = quickResponsesAllowed;
        this.driverLicenseTypes = driverLicenseTypes;
        this.acceptIncompleteResumes = acceptIncompleteResumes;
        this.employer = employer;
        this.publishedAt = publishedAt;
        this.createdAt = createdAt;
        this.negotiationsUrl = negotiationsUrl;
        this.suitableResumesUrl = suitableResumesUrl;
        this.applyAlternateUrl = applyAlternateUrl;
        this.hasTest = hasTest;
        this.test = test;
        this.alternateUrl = alternateUrl;
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
    @SerializedName("billing_type")
    @Expose
    private BillingType billingType;
    @SerializedName("relations")
    @Expose
    private List<Object> relations = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("insider_interview")
    @Expose
    private Object insiderInterview;
    @SerializedName("response_letter_required")
    @Expose
    private Boolean responseLetterRequired;
    @SerializedName("area")
    @Expose
    private Area area;
    @SerializedName("salary")
    @Expose
    private Salary salary;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("allow_messages")
    @Expose
    private Boolean allowMessages;
    @SerializedName("site")
    @Expose
    private Site site;
    @SerializedName("experience")
    @Expose
    private Experience experience;
    @SerializedName("schedule")
    @Expose
    private Schedule schedule;
    @SerializedName("employment")
    @Expose
    private Employment employment;
    @SerializedName("department")
    @Expose
    private Object department;
    @SerializedName("contacts")
    @Expose
    private Object contacts;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("branded_description")
    @Expose
    private Object brandedDescription;
    @SerializedName("vacancy_constructor_template")
    @Expose
    private Object vacancyConstructorTemplate;
    @SerializedName("key_skills")
    @Expose
    private List<KeySkill> keySkills = null;
    @SerializedName("accept_handicapped")
    @Expose
    private Boolean acceptHandicapped;
    @SerializedName("accept_kids")
    @Expose
    private Boolean acceptKids;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("response_url")
    @Expose
    private Object responseUrl;
    @SerializedName("specializations")
    @Expose
    private List<Specialization> specializations = null;
    @SerializedName("code")
    @Expose
    private Object code;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("quick_responses_allowed")
    @Expose
    private Boolean quickResponsesAllowed;
    @SerializedName("driver_license_types")
    @Expose
    private List<Object> driverLicenseTypes = null;
    @SerializedName("accept_incomplete_resumes")
    @Expose
    private Boolean acceptIncompleteResumes;
    @SerializedName("employer")
    @Expose
    private Employer employer;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("negotiations_url")
    @Expose
    private Object negotiationsUrl;
    @SerializedName("suitable_resumes_url")
    @Expose
    private Object suitableResumesUrl;
    @SerializedName("apply_alternate_url")
    @Expose
    private String applyAlternateUrl;
    @SerializedName("has_test")
    @Expose
    private Boolean hasTest;
    @SerializedName("test")
    @Expose
    private Object test;
    @SerializedName("alternate_url")
    @Expose
    private String alternateUrl;
    @SerializedName("working_days")
    @Expose
    private List<Object> workingDays;
    @SerializedName("working_time_intervals")
    @Expose
    private List<Object> workingTimeIntervals;
    @SerializedName("working_time_modes")
    @Expose
    private List<Object> workingTimeModes;
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

    public BillingType getBillingType() {
        return billingType;
    }

    public void setBillingType(BillingType billingType) {
        this.billingType = billingType;
    }

    public List<Object> getRelations() {
        return relations;
    }

    public void setRelations(List<Object> relations) {
        this.relations = relations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getInsiderInterview() {
        return insiderInterview;
    }

    public void setInsiderInterview(Object insiderInterview) {
        this.insiderInterview = insiderInterview;
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

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getAllowMessages() {
        return allowMessages;
    }

    public void setAllowMessages(Boolean allowMessages) {
        this.allowMessages = allowMessages;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public Object getDepartment() {
        return department;
    }

    public void setDepartment(Object department) {
        this.department = department;
    }

    public Object getContacts() {
        return contacts;
    }

    public void setContacts(Object contacts) {
        this.contacts = contacts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getBrandedDescription() {
        return brandedDescription;
    }

    public void setBrandedDescription(Object brandedDescription) {
        this.brandedDescription = brandedDescription;
    }

    public Object getVacancyConstructorTemplate() {
        return vacancyConstructorTemplate;
    }

    public void setVacancyConstructorTemplate(Object vacancyConstructorTemplate) {
        this.vacancyConstructorTemplate = vacancyConstructorTemplate;
    }

    public List<KeySkill> getKeySkills() {
        return keySkills;
    }

    public void setKeySkills(List<KeySkill> keySkills) {
        this.keySkills = keySkills;
    }

    public Boolean getAcceptHandicapped() {
        return acceptHandicapped;
    }

    public void setAcceptHandicapped(Boolean acceptHandicapped) {
        this.acceptHandicapped = acceptHandicapped;
    }

    public Boolean getAcceptKids() {
        return acceptKids;
    }

    public void setAcceptKids(Boolean acceptKids) {
        this.acceptKids = acceptKids;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Object getResponseUrl() {
        return responseUrl;
    }

    public void setResponseUrl(Object responseUrl) {
        this.responseUrl = responseUrl;
    }

    public List<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getQuickResponsesAllowed() {
        return quickResponsesAllowed;
    }

    public void setQuickResponsesAllowed(Boolean quickResponsesAllowed) {
        this.quickResponsesAllowed = quickResponsesAllowed;
    }

    public List<Object> getDriverLicenseTypes() {
        return driverLicenseTypes;
    }

    public void setDriverLicenseTypes(List<Object> driverLicenseTypes) {
        this.driverLicenseTypes = driverLicenseTypes;
    }

    public Boolean getAcceptIncompleteResumes() {
        return acceptIncompleteResumes;
    }

    public void setAcceptIncompleteResumes(Boolean acceptIncompleteResumes) {
        this.acceptIncompleteResumes = acceptIncompleteResumes;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
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

    public Object getNegotiationsUrl() {
        return negotiationsUrl;
    }

    public void setNegotiationsUrl(Object negotiationsUrl) {
        this.negotiationsUrl = negotiationsUrl;
    }

    public Object getSuitableResumesUrl() {
        return suitableResumesUrl;
    }

    public void setSuitableResumesUrl(Object suitableResumesUrl) {
        this.suitableResumesUrl = suitableResumesUrl;
    }

    public String getApplyAlternateUrl() {
        return applyAlternateUrl;
    }

    public void setApplyAlternateUrl(String applyAlternateUrl) {
        this.applyAlternateUrl = applyAlternateUrl;
    }

    public Boolean getHasTest() {
        return hasTest;
    }

    public void setHasTest(Boolean hasTest) {
        this.hasTest = hasTest;
    }

    public Object getTest() {
        return test;
    }

    public void setTest(Object test) {
        this.test = test;
    }

    public String getAlternateUrl() {
        return alternateUrl;
    }

    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
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
        return "Vacancy{" +
                "id='" + id + '\'' +
                ", premium=" + premium +
                ", billingType=" + billingType +
                ", relations=" + relations +
                ", name='" + name + '\'' +
                ", insiderInterview=" + insiderInterview +
                ", responseLetterRequired=" + responseLetterRequired +
                ", area=" + area +
                ", salary=" + salary +
                ", type=" + type +
                ", address=" + address +
                ", allowMessages=" + allowMessages +
                ", site=" + site +
                ", experience=" + experience +
                ", schedule=" + schedule +
                ", employment=" + employment +
                ", department=" + department +
                ", contacts=" + contacts +
                ", description='" + description + '\'' +
                ", brandedDescription=" + brandedDescription +
                ", vacancyConstructorTemplate=" + vacancyConstructorTemplate +
                ", keySkills=" + keySkills +
                ", acceptHandicapped=" + acceptHandicapped +
                ", acceptKids=" + acceptKids +
                ", archived=" + archived +
                ", responseUrl=" + responseUrl +
                ", specializations=" + specializations +
                ", code=" + code +
                ", hidden=" + hidden +
                ", quickResponsesAllowed=" + quickResponsesAllowed +
                ", driverLicenseTypes=" + driverLicenseTypes +
                ", acceptIncompleteResumes=" + acceptIncompleteResumes +
                ", employer=" + employer +
                ", publishedAt='" + publishedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", negotiationsUrl=" + negotiationsUrl +
                ", suitableResumesUrl=" + suitableResumesUrl +
                ", applyAlternateUrl='" + applyAlternateUrl + '\'' +
                ", hasTest=" + hasTest +
                ", test=" + test +
                ", alternateUrl='" + alternateUrl + '\'' +
                ", workingDays=" + workingDays +
                ", workingTimeIntervals=" + workingTimeIntervals +
                ", workingTimeModes=" + workingTimeModes +
                ", acceptTemporary=" + acceptTemporary +
                '}';
    }
}
