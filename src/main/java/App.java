import com.thoughtworks.iamcoach.pos.entity.Calculator;
import com.thoughtworks.iamcoach.pos.entity.CartItem;
import com.thoughtworks.iamcoach.pos.entity.Scanner;
import com.thoughtworks.iamcoach.pos.util.DataTransfer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("**************************LET US GO**************************");
        System.out.println("打印时间 " + dateFormat.format(new Date()));

        Scanner scanner = new Scanner();
        List<CartItem> cartItems =  scanner.getCartItems();
        Set<String> cartCategories = scanner.getCartCategories();

        for(String cartCategory: cartCategories) {
            for (CartItem cartItem : cartItems){

                if (cartCategory.equals(cartItem.getItem().getCategory())){
                    System.out.println( cartItem.getItem().getCategory()+": 名称：" + cartItem.getItem().getName() +
                            "  数量：" + cartItem.getCount() + "  单价：" + cartItem.getItem().getPrice() + "元"+
                            "  单位：" + cartItem.getItem().getUnit() + "  小计:" + DataTransfer.transfer(Calculator.getSubtotal(cartItem)) +"元");
                }
            }
        }

        System.out.println("总计金额 优惠前：" + Calculator.getTotalMoney() + "元   优惠后：" + Calculator.getTotalMoneyAfterPromoting() +
                "元   优惠差价:" + Calculator.getTotalSavedMoney() + "元");
    }
}
