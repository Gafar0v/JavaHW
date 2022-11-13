import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] groupList = {"Вася Пробкин ", "Петя Клопкин ", "Коля Веревкин ", "Вика Черникина ", "Никита Бубликов ", "Глеб Хлебников ", "Саша Кашин ", "Маша Иванова ", "Игорь Сидоров ", "Рома Ломтиков "};
        setMarks(groupList);
    }

    static void setMarks(String[] groupList) {
        int quantity = groupList.length;
        int[][] markList = new int[quantity][2];
        Scanner in = new Scanner(System.in);

        String choice = "";
        String endCommand = "/q";
        String listCommand = "/p";
        String randomStu="/r";

        do {
            choice = in.nextLine();
            if (choice.equals(listCommand)) {
                for (int i = 0; i < groupList.length; i++) {
                    System.out.print(groupList[i]);
                    if (markList[i][1] == 0) {
                        System.out.println("-");
                    } else if (markList[i][1] == 1) {
                        System.out.println(markList[i][0]);
                    } else {
                        int totalMark=Math.round(markList[i][0]/markList[i][1]);
                        System.out.println(totalMark);
                    }
                }
            }

            if(choice.equals(randomStu)){
                int randomIndex=(int)(Math.random()*quantity);
                System.out.println(groupList[randomIndex]);
                System.out.print("Оценка : ");
                int mark=in.nextInt();
                markList[randomIndex][0]+=mark;
                markList[randomIndex][1]++;
            }

        } while (!(choice.equals(endCommand)));
    }
}