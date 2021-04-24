public class Student {
    private String studentName;
    private int studentId;
    private double [] studentGrades;

    public Student(String studentName, int studentId, double[] studentGrades) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentGrades = studentGrades;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double[] getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(double[] studentGrades) {
        this.studentGrades = studentGrades;
    }

    public double [] calculateGrades(){
        double min , max , sum=0;
        min= max = studentGrades[0];
        for (int i=0 ; i< studentGrades.length; i++){
            if(studentGrades[i]>max){
                max=studentGrades[i];
            }
            if(studentGrades[i]<min){
                min=studentGrades[i];
            }
            sum +=studentGrades[i];
        }
        double [] value={min,max,sum/studentGrades.length};
        return value;
    }

    @Override
     public String toString(){

        double [] value=calculateGrades();

        return String.format("studentName: %s ,studentId: %d , minGrades: %.1f , maxGrades: %.1f,avgGrades: %.1f",studentName,studentId,value[0],value[1],value[2]);
    }








}
