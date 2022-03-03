package CS390hwsort.taskC;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;


public class DeptEmployeeData {

	void reverseSalary(DeptEmployee[] data){

		 class LocalInnerClass implements Comparator<DeptEmployee> {

			@Override
			 public int compare(DeptEmployee dp1, DeptEmployee dp2){
				Double d1 = dp1.getSalary();
				Double d2 = dp2.getSalary();
				return d2.compareTo(d1);
			}
		 }

		 Arrays.sort(data,new LocalInnerClass());
	}

	public static DeptEmployee[] getDeptData() {
		Professor p0 = new Professor("Joe",40000, LocalDate.of(1999,12,24));
		Professor p1 = new Professor("Bob",50000,LocalDate.of(1979,1,2));
		Professor p2 = new Professor("Anna",45000,LocalDate.of(2000,5,21));
		
		Secretary s0 = new Secretary("Joan",50000,LocalDate.of(1987,2,15),10);
		Secretary s1 = new Secretary("Janet",40000,LocalDate.of(1995,4,22),15);
		
		DeptEmployee[]  department = {p0,p1,p2,s0,s1};
		return department;

	}

	public static void main(String[] args) {

		 DeptEmployeeData d = new DeptEmployeeData();
		 DeptEmployee[] data = DeptEmployeeData.getDeptData();

		System.out.println("Sorting by salary using local inner class");
		//calling the reverse Method
	    d.reverseSalary(data);

		//traversing and printing
		for(DeptEmployee d1: data){
			System.out.println(d1.getSalary());
		}
	}
}