import java.util.*;

public class RetailPriceCalc {

    public static void main(String[] args) {

        double wholesale,
                markup;


        Scanner obj = new Scanner(System.in);


        System.out.println("Enter the wholesale cost: ");
        wholesale = obj.nextDouble();

        System.out.println("Enter the markup percentage: ");
        markup = obj.nextDouble();

        calculateRetail(wholesale,markup);

    }


        public static void calculateRetail(double num1, double num2) {
            double price,
                    percent,
                    retail_total;
            percent = (num2/100);
            price = num1 * percent;

            retail_total = price + num1 ;
            System.out.println("The retail price is :$" + retail_total);

        }

    }

