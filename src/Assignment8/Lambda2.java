package Assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {

        Orders orders1 = new Orders(3000, "COMPLETED");
        Orders orders2 = new Orders(30000, "FAILED");
        Orders orders3 = new Orders(15000, "FAILED");
        Orders orders4 = new Orders(20000, "ACCEPTED");
        Orders orders5 = new Orders(9000, "COMPLETED");


        List<Orders> list = Arrays.asList(orders1, orders2, orders3, orders4, orders5);
        list.forEach(order -> {
            if (order.getPrice() > 10000 && (order.getStatus().equalsIgnoreCase("ACCEPTED")||
                    order.getStatus().equalsIgnoreCase("COMPLETED"))) {
                System.out.println(order);
            }
        });
    }

}

class Orders {
    int price;
    String status;

    public Orders(int price, String status) {
        this.price = price;
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Orders{" + "price=" + price + ", status='" + status + '\'' + '}';
    }
}
