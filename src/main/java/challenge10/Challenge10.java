package challenge10;
//AGV
//6-5-2021
import java.util.Scanner;
import java.text.DecimalFormat;

class Prices {
    double itemOne;
    double itemTwo;
    double itemThree;

    int quantityOne;
    int quantityTwo;
    int quantityThree;

    double subTotalOne;
    double tax;
    double total;


}

public class Challenge10 {

    static final double TAX = .055;

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        Prices Calc = new Prices();

        System.out.println("Enter the price of item 1:");
        String itemOneS = inputs.nextLine();
        Calc.itemOne = Double.parseDouble(itemOneS);

        System.out.println("Enter the quantity of item 1:");
        String quantityOneS = inputs.nextLine();
        Calc.quantityOne = Integer.parseInt(quantityOneS);

        System.out.println("Enter the price of item 2:");
        String itemTwoS = inputs.nextLine();
        Calc.itemTwo = Double.parseDouble(itemTwoS);

        System.out.println("Enter the quantity of item 2:");
        String quantityTwoS = inputs.nextLine();
        Calc.quantityTwo = Integer.parseInt(quantityTwoS);

        System.out.println("Enter the price of item 3:");
        String itemThreeS = inputs.nextLine();
        Calc.itemThree = Double.parseDouble(itemThreeS);

        System.out.println("Enter the quantity of item 3:");
        String quantityThreeS = inputs.nextLine();
        Calc.quantityThree = Integer.parseInt(quantityThreeS);

        Calculations(Calc);
        Output(Calc);



    }

    public static void Calculations(Prices Calc){
        Calc.subTotalOne=(Calc.itemOne*Calc.quantityOne)+(Calc.itemTwo*Calc.quantityTwo)*(Calc.itemThree*Calc.quantityThree);
        Calc.tax=(Calc.subTotalOne*TAX);
        Calc.total=(Calc.subTotalOne+Calc.tax);
    }

    public static void Output(Prices Calc){
//        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.println("Subtotal: $" + df.format(Calc.subTotalOne));
//        System.out.println("Tax: $" + df.format(Calc.tax));
//        System.out.println("Total: $" + df.format(Calc.total));

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", Calc.subTotalOne,Calc.tax, Calc.total);
        //System.out.printf("Tax: $%.2f\n" + Calc.tax);
        //System.out.println("Total: $%.2f\n" + Calc.total);
    }
}
