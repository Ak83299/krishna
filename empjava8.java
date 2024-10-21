
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

public class empjava8 {
    public static void main(String[] args) {
        //i/p list of employee
        List<employee> empList;
        empList = new ArrayList<>();
        empList.add(new employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
    

//  Group by employee city name 
 //Map<String, List<employee>> epc = empList.stream().collect(Collectors.groupingBy(employee ::getCity));
// System.out.println(epc);    

//  // group by age
// Map<Integer,List<employee>> byage = empList.stream().collect(Collectors.groupingBy(employee::getAge));
//  System.out.println(byage); 

 // Find  the count of male and female employees present in the organization
    //empList.stream().collect(Collectors.groupingBy(employee::getGender,Collectors.counting()));
//      Map<String ,Long> countmf = empList.stream().collect(Collectors.groupingBy(employee::getGender,Collectors.counting()));
//    System.out.println(countmf);

// Print the names of all departments in the organization age >30
//    List<String> Ld = empList.stream().filter(e->e.getAge()>30).map(employee :: getDeptName).distinct().collect(Collectors.toList());
            // empList.stream().collect(Collectors.groupingBy(employee :: getDeptName,Collectors.filtering(e->e.getAge()>30,Collectors.toList())));
//     System.out.println(Ld);
// secondheighest salary by department
   System.out.println(empList.stream().collect(Collectors.groupingBy(employee :: getDeptName,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(employee :: getSalary)),Optional::get))));
// Map<String, Optional<employee>> secondsalary =empList.stream()
// .collect(Collectors.groupingBy(employee::getDeptName)) // Group by department name
// .entrySet().stream()
// .collect(Collectors.toMap(
//     Map.Entry::getKey,
//     entry -> entry.getValue().stream()
//         .sorted(Comparator.comparingLong(employee::getSalary).reversed())
//         .skip(1)
//         .findFirst()
// ));
//System.out.println(secondsalary);


// second heighest employee salary
// empList.stream().sorted(Comparator.comparingLong(employee::getSalary)
//               .reversed()).skip(1).findFirst();

    //    List<employee> G  = empList.stream()
    //     .sorted(Comparator.comparingLong(employee::getSalary).reversed()).skip(1)
    //     .collect(Collectors.toList());

    //     System.out.println(G.get(0));

// // Find employees whose age is greater than 30 and less than 30
//         Map<Boolean, List<employee>> M30 =empList.stream().collect(Collectors.partitioningBy(e->e.getAge()>30));
//              System.out.println(M30);
  
// Map.Entry<String, Long> maxND = empList.stream()
// .collect(Collectors.groupingBy(employee::getDeptName, Collectors.counting()))
// .entrySet().stream().max(Map.Entry.comparingByValue()).get();
//      System.out.println("Max no of employees present in Dept :: " + maxND.getKey()+'\n'+"Value ::"+maxND.getValue());
 

/*Find if there any employees from HR Department
        can use anyMatch also  */ 

// Optional<employee>Hrd =empList.stream().filter(e->e.getDeptName().equalsIgnoreCase("HR")).findAny();
//    System.out.println(Hrd);


// /* //Find the department names that these employees work for, where the number of employees in the department is over 3  */
//   empList.stream().collect(Collectors.groupingBy(employee :: getDeptName, Collectors.counting()))
//                   .entrySet().stream().filter(entry -> entry.getValue()>3).forEach(System.out::println);


}
}
