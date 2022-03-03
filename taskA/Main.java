package CS390hwsort.taskA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        Arrays.sort(data,new NameComparator());
        System.out.println("Sorting by name naturally");
        for(DeptEmployee d: data){
            System.out.println(d.getName());
        }
    }
}
