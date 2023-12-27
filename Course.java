abstract class Course {
    private String name;
    private String names;
    public Course(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void someCourseMethod();
}
