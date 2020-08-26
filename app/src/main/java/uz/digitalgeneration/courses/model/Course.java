package uz.digitalgeneration.courses.model;

public class Course {

    private String courseTitle;
    private Integer courseCoolImageResId;
    private Integer courseMentorImageResId;
    private Integer progress;
    private String courseDescription;

    public Course(String courseTitle, Integer courseCoolImageResId, Integer courseMentorImageResId, Integer progress, String courseDescription) {
        this.courseTitle = courseTitle;
        this.courseCoolImageResId = courseCoolImageResId;
        this.courseMentorImageResId = courseMentorImageResId;
        this.progress = progress;
        this.courseDescription = courseDescription;
    }

    public Integer getCourseCoolImageResId() {
        return courseCoolImageResId;
    }

    public void setCourseCoolImageResId(Integer courseCoolImageResId) {
        this.courseCoolImageResId = courseCoolImageResId;
    }

    public Integer getCourseMentorImageResId() {
        return courseMentorImageResId;
    }

    public void setCourseMentorImageResId(Integer courseMentorImageResId) {
        this.courseMentorImageResId = courseMentorImageResId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
