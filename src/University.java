public class University {
    private String universityId;
    private Student[] students;

    public University(int n){
        this.students=new Student[n];
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    @Override
    public String toString(){
        String studentsInfo=" ";
        for (int i = 0; i < students.length; i++) {
            studentsInfo +="student_" +i +"=>" + students.toString()+"/n";

        }
        return String.format("universityId: %s%n,studentsInfo: %n%s",universityId,studentsInfo);
    }
}
