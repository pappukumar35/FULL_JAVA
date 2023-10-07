package variable;

import java.io.*;

public class InstanceVarible {
    public String pappu;
    public int i;
    public Integer I;

    public InstanceVarible() {
        this.pappu = "Amit kumar";
    }

    public static void main(String args[]) {
        InstanceVarible name = new InstanceVarible();
        System.out.println("pappu name is: " + name.pappu);
        System.out.println("Default varible for int is " + name.i);
        System.out.println("Default  value for Integer is " + name.I);

    }
}
