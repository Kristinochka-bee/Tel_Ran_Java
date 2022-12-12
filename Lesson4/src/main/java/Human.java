public abstract class Human implements MoveToUnivercity {
    private String name;
    private String secondName;

    public Human(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    abstract void bePresentOnLesson (String lessonID);
}
