//Q9.Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
public class ninth {
    enum house{
        house1(500000),
        house2(800000),
        house3(1000000);
        private int price;
        house(int price)
        {
            this.price=price;
        }
        int getPrice(){
            return price;
        }
    }

    public static void main(String[] args) {
        for(house h:house.values())
        {
            System.out.println("Price of "+h+" is "+h.getPrice());
        }
    }
}
