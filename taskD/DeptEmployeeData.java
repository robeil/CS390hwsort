package CS390hwsort.taskD;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;


public class DeptEmployeeData {

	void reverseByName(DeptEmployee[] data){
		Comparator com = new Comparator<DeptEmployee>(){
			@Override
			public int compare(DeptEmployee dp1, DeptEmployee dp2){
				return dp2.getName().compareTo(dp1.getName());
			}
		};
		Arrays.sort(data,com);
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
		//creating outer class method
		DeptEmployeeData d = new DeptEmployeeData();
		//getting the data
		DeptEmployee[] data = DeptEmployeeData.getDeptData();

		//calling the reverse method
		d.reverseByName(data);
		System.out.println("sorting reverse name using anonymous inner class");
		//traversing and print the reverse name
		for(DeptEmployee d1: data){
			System.out.println(d1.getName());
		}

	}
}
