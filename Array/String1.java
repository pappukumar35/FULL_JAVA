package Array;

class Student {
    public int roll_no;
    public String name;

    Student(int roll_n0, String anme) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1, "pappu");
        arr[1] = new Student(2, "aditya");
        arr[3] = new Student(3, "vicky");
        arr[4] = new Student(4, "aman");
        arr[5] = new Student(5, "mohan");

        for (int i = 0; i < arr.length; i++) {

            System.out.println("\"Element at \" + i + \" : \"" + //
                    "                               + arr[i].roll_no + \" \"\r\n" +
                    "                              + arr[i].name");
        }

    }

}
