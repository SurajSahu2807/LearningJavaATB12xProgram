package ex_19_OOPs_Part2.inheritance.Hierarical;

import ex_19_OOPs_Part2.inheritance.multilevel.Son;

public class Lab171_Hierarchical {
    public static void main(String[] args) {
        Mother m1 = new Mother();
        m1.scotty();
        m1.Companion();

        Sonu s1 = new Sonu();
        s1.scotty();
        s1.ElderSon();

        Renuka r1 = new Renuka();
        r1.scotty();
        r1.YongerDaughter();
    }
}
