package packManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainDrive {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Student student1=new Student();
		student1.setAddress("Rajajinagar");
		student1.setGread("Intermediat");
		student1.setName("Priyadarshini");
		student1.setStudentId("11RFSGJRYF");

		Student student2=new Student();
		student2.setAddress("Basavanagudi");
		student2.setGread("Intermediat");
		student2.setName("Varsha");
		student2.setStudentId("99RFEJRYF");

		Student student3=new Student();
		student3.setAddress("Southendcirle");
		student3.setGread("Intermediat");
		student3.setName("rajbala");
		student3.setStudentId("11RFSGJRYF");

		Student student4=new Student();
		student4.setAddress("Hassan");
		student4.setGread("Intermediat");
		student4.setName("Pankaja");
		student4.setStudentId("21RFSGJRYF");


		List<Student> l1=new ArrayList<Student>();
		l1.add(student1);
		l1.add(student2);

		List<Student> l2=new ArrayList<Student>();
		l2.add(student3);
		l2.add(student4);

		List<Student> l3=new ArrayList<Student>();
		l3.add(student1);
		l3.add(student4);

		List<Student> l4=new ArrayList<Student>();
		l4.add(student1);
		l4.add(student2);

		Teacher teacher=new Teacher();
		teacher.setDesignation("HeadOfTheDepartment");
		teacher.setName("Sashikala");
		teacher.setStafeId("FJGF452413");
		teacher.setTeachingSub("Maths");
		teacher.setStudents(l4);

		Teacher teacher1=new Teacher();
		teacher1.setDesignation("techingstaff");
		teacher1.setName("Rajbala");
		teacher1.setStafeId("FJGF234413");
		teacher1.setTeachingSub("Science");
		teacher1.setStudents(l3);

		Teacher teacher2=new Teacher();
		teacher2.setDesignation("HeadOfTheDepartment");
		teacher2.setName("Abhishek G P");
		teacher2.setStafeId("FJGF2613");
		teacher2.setTeachingSub("english");
		teacher2.setStudents(l4);

		Teacher teacher3=new Teacher();
		teacher3.setDesignation("HeadOfTheDepartment");
		teacher3.setName("PunithRaj");
		teacher3.setStafeId("FJGF244513");
		teacher3.setTeachingSub("Kannada");
		teacher3.setStudents(l4);


		entityTransaction.begin();
		entityManager.persist(teacher);
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(teacher3);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(student4);
       entityTransaction.commit();


	}
}
