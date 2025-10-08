package Student;

    public class StudentPer extends StudentInfo 
	{
        private int[] marks = new int[6];

        public StudentPer(int rollno, String name, String studentClass, int[] marks) 
		{
            this.rollno = rollno;
            this.name = name;
            this.studentClass = studentClass;
            if (marks.length == 6) {
                System.arraycopy(marks, 0, this.marks, 0, 6);
            } else {
                System.out.println("Warning: Expected 6 marks, but received " + marks.length);
            }
            calculatePercentage();
        }

        private void calculatePercentage() {
            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }
            this.percentage = (double) totalMarks / 600 * 100; // Assuming max 100 marks per subject
        }
    }
	
