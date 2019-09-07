package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Address;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.StudentOrder;

import java.time.LocalDate;

public class SaveStudentOrder {

  public static void main(String[] args) {
//    StudentOrder so = new StudentOrder();
//    long ans = saveStudentOrder(so);
//    System.out.println(ans);

  }

  static long saveStudentOrder(StudentOrder studentOrder) {
    long answer = 199;
    System.out.println("saveStudentOrder");
    return answer;
  }

   public static StudentOrder buildStudentOrder(long id) {
     StudentOrder so = new StudentOrder();
     so.setStudentOrderId(id);
     so.setMarriageCertificateId("" + (123456000 + id));
     so.setMarriageDate(LocalDate.of(2017,12,15));
     so.setMarriageOffice("Отдел ЗАГС");

     Address address = new Address("195000", "Занавеский пр.", "12", "", "142");

     // Муж
     Adult husband = new Adult("Петров","Виктор","Сергеевич",LocalDate.of(1998,8,24));
     husband.setPassportSeria("" + (1000 +  id));
     husband.setPassportNumber("" + (100000 +  id));
     husband.setIssueDate(LocalDate.of(2017,9,15));
     husband.setIssueDepartment("Отдел милиции %" + id);
     husband.setStudentId("" + (10000 +  id));
     husband.setAddres(address);
     // Жена
     Adult wife = new Adult("Петрова","Вироника","Алексеевна",LocalDate.of(1998,3,12));
     wife.setPassportSeria("" + (2000 +  id));
     wife.setPassportNumber("" + (200000 +  id));
     wife.setIssueDate(LocalDate.of(2018,4,5));
     wife.setIssueDepartment("Отдел милиции %" + id);
     wife.setStudentId("" + (20000 +  id));
     wife.setAddres(address);
     // Ребонок
     Child child1 = new Child("Петрова","Ирина","Викторовна",LocalDate.of(2018,6,29));
     child1.setCertificateNumber("" + (300000) + id);
     child1.setIssueDate(LocalDate.of(2018,7,19));
     child1.setIssueDepartment("Отдел ЗАГС %" + id);
     child1.setAddres(address);
     // Ребонок2
     Child child2 = new Child("Петров","Евгений","Викторович",LocalDate.of(2018,6,29));
     child2.setCertificateNumber("" + (400000) + id);
     child2.setIssueDate(LocalDate.of(2018,7,19));
     child2.setIssueDepartment("Отдел ЗАГС %" + id);
     child2.setAddres(address);

     so.setHusband(husband);
     so.setWife(wife);
     so.addChild(child1);
     so.addChild(child2);

     return so;
   }
}
