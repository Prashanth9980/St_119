class Course {
    String semester;
    String[] courseName;
    int[] marks;

    // Constructor should be named Course, not course
    Course(String semester, String[] courseName, int[] marks) {
        this.semester = semester;
        this.courseName = courseName;
        this.marks = marks;
    }

    // Correcting method declaration and syntax issues
    void displayCourse() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courseName.length; i++) {
            System.out.println("Course: " + courseName[i] + " Marks: " + marks[i]);
        }
    }

    // Main method should be in a separate class
    public static void main(String[] args) {
        // Correctly initializing the arrays
        String[] courses = {"Java", "DevOps", "PALR"};
        int[] marks = {90, 86, 88};

        // Creating the Course object
        Course course = new Course("Semester 1", courses, marks);
        
        // Correct method name to display course details
        course.displayCourse();
    }
}
