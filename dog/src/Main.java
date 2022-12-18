import java.util.List;
public class Main{
    public static void main(String[] args){
        //List<クラス名> 変数名
        List<Dogracemembers> dogracemembersList = List.of(new Dogracemembers("pochi", "4", "6"),
                new Dogracemembers("pachi", "5", "6.2"),
                new Dogracemembers("pichi", "6", "6.3"),
                new Dogracemembers("puchi", "7", "6.4"),
                new Dogracemembers("pechi", "8", "6.1"));

        for (Dogracemembers dogracemembers : dogracemembersList) {
            System.out.println("name:"+dogracemembers.getName()+",age:"+dogracemembers.getAge()+",spped:"+dogracemembers.getSpeed());
//            System.out.println("name:" + dogracemembers.getName());
//            System.out.println("age:" + dogracemembers.getAge());
//            System.out.println("speed:" + dogracemembers.getspeed());

            if (dogracemembers.getName().equals("puchi")) {
                System.out.println("勝ち");
            } else {
                System.out.println("負け");
            }
        }
//            if (dogracingmembers.getPosition().equals("GK")) {
//                System.out.println("選手の名前は" + japanNationalTeam.getNickname());
//                System.out.println("背番号は" + japanNationalTeam.getUniNumber());
//            }
//        }
//        dog.bow();

}
}
