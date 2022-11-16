public class Student {
    private String name;
    private int[] answers;
    Student(String name){
        this.name=name;
        this.answers = new int[1];
    }
    public void setMark(int mark) {
        if (answers[0] > 0) {
            int[] ansNew = new int[this.answers.length + 1];
            System.arraycopy(this.answers, 0, ansNew, 0, this.answers.length);
            ansNew[answers.length] = mark;
            this.answers = ansNew;
        }else{
            answers[0]=mark;
        }

    }
    public int getMark(){
        if(this.answers[0]==0){
            return 0;
        }else{
            int marksSum=0;
            for (int answer : this.answers) {
                marksSum += answer;
            }
            return Math.round(marksSum/this.answers.length);
        }
    }
    public String getName(){
        return this.name;
    }


}
