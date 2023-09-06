package Seminars.Seminar4;
import java.util.Comparator;
public class StudentComparator implements Comparator<Student> { // переименовывать не стал, создам новый
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore() - o2.getScore();
    }

//    @Override // это когда в названии было без <Student>
//    public int compare(Object o1, Object o2) {
//        if (o1 instanceof Student && o2 instanceof Student){ // если о1 существует в 'Student'
//            int scoreRes = ((Student) o1).getScore() - ((Student) o2).getScore();
//                                                        // преобразование типов ((Student) o1)
//            return scoreRes;
//        }
//        return -1;
//    }
}
