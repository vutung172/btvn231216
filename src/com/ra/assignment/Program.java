package com.ra.assignment;

public class Program {
    public static void main(String[] args) {
        Manager students = new Manager();
        Manager employees = new Manager();

        Student st = new Student();
        st.setId("SV01");
        st.setName("Nam");
        st.setClassName("RA/FUKUOKA-JV230929");

        Student st1 = new Student();
        st1.setId("SV02");
        st1.setName("Thành");
        st1.setClassName("RA/FUKUOKA-JV230929");

        Employee emp2 = new Employee();
        emp2.setId("SV02");
        emp2.setName("Nam");
        emp2.setSalary(2500);

        students.add(st);
        employees.add(emp2);
        students.add(st1);

        Student st2 = new Student();
        st2.setId("SV03");
        st2.setName("Tung");
        st2.setClassName("RA/FUKUOKA-JV230929");

        Employee emp = new Employee();
        emp.setId("SV01");
        emp.setName("Tung");
        emp.setSalary(3000);



        employees.add(emp);


        students.show();
        employees.show();
        // Anonymous clas
//        Predicate predicate = new Predicate() {
//            @Override
//            public boolean test(Object obj) {
//                return false;
//            }
//        };
        /*// Anonymous method
        Predicate predicateA = (obj) -> {
            return obj.equals("A");
        };
        // Lambda expression
        Predicate predicateB = obj -> obj.equals("B");


        System.out.println(predicateA.test("C"));
        System.out.println(predicateB.test("B"));*/

        BaseEntity firstSt = employees.findFirst( employee -> employee.checkId("SV02"));
        if(firstSt == null){
            System.out.println("không có");
        } else {
            firstSt.output();
        }



    }
}
