package lab1;

public class Student {

    private String studentName;
    private String studentSurname;
    private String studentPatronymic;
    private String groupNumber;
    private String kindOfActivity;
    private String studentHobby;
    private String lifeMoto;

    Student(String[] info) {
        studentName = info[0];
        studentSurname = info[1];
        studentPatronymic = info[3];
        groupNumber = info[4];
        kindOfActivity = info[5];
        studentHobby = info[6];

        for (int i = 7; i < info.length; i++) {
            if (lifeMoto.isEmpty()){
                lifeMoto = info[i] + " ";
            } else {
                lifeMoto += info[i] + " ";
            }
        }

    }

    public void getInfo() {
        System.out.println("Name:" + "\tSurname:" + "\tPatronymic:" + "\tGroup number" +
                            "\tKind of activity:" + "\tHobby:" + "\tMoto:" + "\n" +
                            studentName + "\t" + studentSurname + "\t" + studentPatronymic + "\t" +
                            groupNumber + "\t" + kindOfActivity + "\t" + studentHobby + "\t" +
                            lifeMoto);
    }
}
