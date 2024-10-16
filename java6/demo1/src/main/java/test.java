import Custom.custom;
import Dish.Dish0;
import Dish.Dish1;
import Dish.Dish2;
import Dish.Order;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Dish0.profile();
        Dish1.profile();
        Dish2.profile();

        System0 system = new System0();
        List<Order> orders = Arrays.asList( new Dish2(), new Dish0(), new Dish1());

        system.manageOrder(orders); // 管理订单

        // 创建堂食顾客
        custom.TableCustomer tableCustomer = new custom.TableCustomer(5);


        // 创建外卖顾客
        custom.WechatCustomer takeoutCustomer = new custom.WechatCustomer("123 Main St", true);

    }
}
