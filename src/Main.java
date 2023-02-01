public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "05555555555");
        Teacher t2 = new Teacher("Ebru Hoca", "KİM", "05444444444");
        Teacher t3 = new Teacher("Yunus Hoca", "FİZ", "05333333333");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course kimya = new Course("Kimya", "101", "KİM");
        kimya.addTeacher(t2);

        Course fizik = new Course("Fizik", "101", "FİZ");
        fizik.addTeacher(t3);
        //printTeacherInfo();

        Student s1 = new Student("Cookie", "2403", "2", tarih, kimya, fizik);
        s1.addBulkExamNotes(50, 80, 95);
        s1.isPass();

        Student s2 = new Student("Misha", "906", "2", tarih, kimya, fizik);
        s2.addBulkExamNotes(70, 75, 90);
        s2.isPass();

        Student s3 = new Student("Alex", "2204", "1", tarih, kimya, fizik);
        s3.addBulkExamNotes(55,40,30);
        s3.isPass();

    }
}
