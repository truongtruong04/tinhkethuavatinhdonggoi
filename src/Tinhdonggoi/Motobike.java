package Tinhdonggoi;

public class Motobike {
    public static void main(String [] args ){
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();
        Car d = new Car();
        Car e = new Car();
        Car g = new Car();
        a.setName("phạm văn trường ");
        b.setYearold("18");
        c.setJob("sinh viên công nghệ đông á . nghành công nghệ thông tin");
        d.setInterst("bóng chuyền ");
        e.setFamily("gia đình gồm 6 người ");
        g.setHometowm("Thanh Hóa");
        System.out.println(a.getName());
        System.out.println(b.getYearold());
        System.out.println(c.getJob());
        System.out.println(d.getInterst());
        System.out.println(e.getFammily());
        System.out.println(g.getHometowm());
    }
}
