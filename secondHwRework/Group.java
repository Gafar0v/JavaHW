public class Group {
    private Student[] group;

    Group(Student[] students) {
        this.group = students;
    }
    Group(String[] names){
        Student[] students=new Student[names.length];
        for(int i=0;i<names.length;i++){
            students[i]=new Student(names[i]);
        }
        this.group=students;
    }

    public Student[] getGroup() {
        return this.group;
    }

    public int getLength() {
        return this.group.length;
    }

    public Student getStudent(int index) {
        return group[index];
    }

    public void getList() {
        for (Student student : this.group) {
            System.out.print(student.getName());
            System.out.print(" : ");
            System.out.println(student.getMark());
        }
    }
}


