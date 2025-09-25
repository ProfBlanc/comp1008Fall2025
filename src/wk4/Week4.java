package wk4;

public class Week4 {

    public static void main(String[] args) {

        Grade grade1 = new Grade();
        grade1.setPercentage(900);
        System.out.println(grade1.getLetter());

        Grade grade = new Grade(75);
        System.out.println(grade.getLetter());

        Grade grade2 = new Grade("A");
        System.out.println(grade2.getPercentage());

        Grade grade3 = new Grade(65, "C");
        System.out.println(grade3.getPercentage());

        Grade grade4 = Grade.PassingGrade();
        System.out.println(grade4.getPercentage());

        int targetGradePercentage = 200;
        grade4.setPercentage(targetGradePercentage);
        System.out.println(targetGradePercentage==grade4.getPercentage());
    }
}
