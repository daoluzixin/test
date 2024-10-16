import Dish.Order;

import java.util.List;

public class System0 {
    private int orderId = 0;  // 订单编号从1开始递增

    public void manageOrder(List<Order> dishes) {

        for (Order dish : dishes) {
            if (dish.check()) {
                dish.cook();  // 输出所有菜品的烹饪方法
                orderId++;
                System.out.println("订单编号为: " + orderId);
            }else {
                System.out.println("原料不足,取消订单");
            }
        }
    }
}