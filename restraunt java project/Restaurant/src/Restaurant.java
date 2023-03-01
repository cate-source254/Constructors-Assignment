import java.util.Scanner;
public class Restaurant {
    static int beef,chapati,rice,Mokimo,pilau,beans,kukufry,
    Ugali,chips,Matumbo,coke,sprite,blackcurrent,fantapassion;
    public static void restaurantMenu() {
        beef=250;
        chapati=25;
        rice=180;
        Mokimo=450;
        pilau=330;
        beans=140;
        kukufry=780;
        Ugali=80;
        chips=100;
        Matumbo=60;
        coke=120;
        sprite=180;
        blackcurrent=130;
        fantapassion=160;
        System.out.println("beef @"+beef);
        System.out.println("chapati @"+chapati);
        System.out.println("rice @"+rice);
        System.out.println("mokimo @"+Mokimo);
        System.out.println("pilau @"+pilau);
        System.out.println("beans @"+beans);
        System.out.println("chips @"+chips);
        System.out.println("kukufry @"+kukufry);
        System.out.println("blackcurrent @"+blackcurrent);
        System.out.println("fantapassion @"+fantapassion);
        System.out.println("sprite @"+sprite);


        Scanner input=new Scanner(System.in);
        String burger,Biriani,Delmonte,cocacola,food,drink;
        double burgerPrice,BirianiPrice,DelmontePrice,CocacolaPrice,cost,tillNo,enteramount;
        cost=2500;
        System.out.println("add food to the menu:");
        burger=input.next();
        System.out.println("add price of added food:");
        burgerPrice=input.nextDouble();
        System.out.println("add food to the menu:");
        Biriani=input.next();
        System.out.println("add price of added food:");
        BirianiPrice=input.nextDouble();
        System.out.println("add a drink to the menu:");
        Delmonte=input.next();
        System.out.println("add price of added drink:");
        DelmontePrice=input.nextDouble();
        System.out.println("add a drink to the menu:");
        cocacola=input.next();
        System.out.print("add price of added drink:");
        CocacolaPrice=input.nextDouble();
        System.out.println("order food of choice:");
        food=input.next();
        System.out.println("order a drink of choice:");
        drink=input.next();
        System.out.println("total cost:sh "+cost);
        System.out.println("enter till no:");
        tillNo=input.nextDouble();
            System.out.println("enter amount:");
            enteramount=input.nextDouble();
        System.out.println("Your payment is successfully made thank for for exploring with us.");

    }
public static void main(String[]args){
   restaurantMenu();
}

}
