public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        private Course course;

        public Student(String name, int studentId, int numberOfCredits, double gpa, Course course) {
                this.name=name;
                this.studentId=studentId;
                this.numberOfCredits=numberOfCredits;
                this.gpa=gpa;
                this.course=course;
        }


        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }


        public int getStudentId() {
                return studentId;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public int getNumberOfCredits()
        {
                return numberOfCredits;
        }

        private void setGetNumberOfCredits(int getNumberOfCredits) {

                this.numberOfCredits = getNumberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        public Course getCourse() {
                return course;
        }

        public void setCourse(Course course) {
                this.course = course;
        }
}
