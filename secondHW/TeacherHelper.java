import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherHelper {
    private String[] groupList = new String[1];

    void setMarks() {
        int quantity = this.groupList.length;
        int[][] markList = new int[quantity][2];
        Scanner in = new Scanner(System.in);

        String endCommand = "/q";
        String listCommand = "/p";
        String randomStu = "/r";
        String helpCommand = "/h";

        System.out.println("print /h to get list of commands");
        String choice = "";
        while (!(choice.equals(endCommand))) {
            choice = in.nextLine();
            if (choice.equals(listCommand)) {
                for (int i = 0; i < this.groupList.length; i++) {
                    System.out.print(this.groupList[i]);
                    if (markList[i][1] == 0) {
                        System.out.println("-");
                    } else if (markList[i][1] == 1) {
                        System.out.println(markList[i][0]);
                    } else {
                        int totalMark = Math.round(markList[i][0] / markList[i][1]);
                        System.out.println(totalMark);
                    }
                }
            }

            if (choice.equals(randomStu)) {
                int randomIndex = (int) (Math.random() * quantity);
                System.out.println(this.groupList[randomIndex]);
                System.out.print("Оценка : ");
                int mark = in.nextInt();
                markList[randomIndex][0] += mark;
                markList[randomIndex][1]++;
            }

            if (choice.equals(helpCommand)) {
                System.out.println("print /p to get list of students");
                System.out.println("print /r to get random student and set him mark");
                System.out.println("print /q to exit");
            }
        }

    }

    void getGroupList() {
        System.out.println("print /f if ypu want to get group list from file");
        System.out.println("print /pr if you want to get group list from program");

        Scanner in = new Scanner(System.in);

        String fileCommand = "/f";
        String prgrmCommand = "/pr";
        String choice = in.nextLine();
        if (choice.equals(fileCommand)) {
            File file = new File("C:\\Users\\User\\IdeaProjects\\secondHW\\src\\group.txt");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                List<String> listOfStrings = new ArrayList<String>();
                while (line != null) {
                    listOfStrings.add(line);
                    line = reader.readLine();
                }
                this.groupList = listOfStrings.toArray(new String[0]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (choice.equals(prgrmCommand)) {
            this.groupList = new String[]{"Вася Пробкин ", "Петя Клопкин ", "Коля Веревкин ", "Никита Бубликов ", "Вика Черникина ", "Рома Ломтиков "};
        }


    }

    void printGroup() {
        for (int i = 0; i < this.groupList.length; i++) {
            System.out.println(this.groupList[i]);
        }
    }


}
