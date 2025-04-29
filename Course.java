class Course {
    String semester;
    String[] courseName;
    int[] marks;

   
    Course(String semester, String[] courseName, int[] marks) {
        this.semester = semester;
        this.courseName = courseName;
        this.marks = marks;
    }

    
    void displayCourse() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courseName.length; i++) {
            System.out.println("Course: " + courseName[i] + " Marks: " + marks[i]);
        }
    }

    
    public static void main(String[] args) {
        
        String[] courses = {"Java", "DevOps", "PALR"};
        int[] marks = {90, 86, 88};

        
        Course course = new Course("Semester 1", courses, marks);
        
        
        course.displayCourse();
    }
}
