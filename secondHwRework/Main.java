
public class Main {
    public static void main(String[] args){
        String[] names={"Вася Пробкин ", "Петя Клопкин ", "Коля Веревкин ", "Никита Бубликов ", "Вика Черникина ", "Рома Ломтиков "};
        Group group=new Group(names);
        TeacherHelper helper =new TeacherHelper(group);
        helper.setMarks();
    }
}