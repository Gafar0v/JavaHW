import java.util.Scanner;

public class TeacherHelper {
    private Group group;

    TeacherHelper(Group group) {
        this.group = group;
    }


    void setMarks() {
        Scanner in = new Scanner(System.in);
        System.out.println("print /h to get list of commands");
        String choice = "";
        while (!(choice.equals(Command.end))) {
            choice = in.nextLine();
            if (choice.equals(Command.list)) {
                this.group.getList();
            }


            if (choice.equals(Command.random)) {
                int randomIndex = (int) (Math.random() * group.getLength());
                System.out.println();
                Student student = this.group.getStudent(randomIndex);
                System.out.println(student.getName());
                System.out.print("Оценка : ");
                int mark = in.nextInt();
                student.setMark(mark);
            }

            if (choice.equals(Command.help)) {
                System.out.println("print /p to get list of students");
                System.out.println("print /r to get random student and set him mark");
                System.out.println("print /q to exit");
            }
        }
    }
}


