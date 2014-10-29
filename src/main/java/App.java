import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.dao.PromotionDaoImpl;
import com.thoughtworks.iamcoach.pos.service.ItemService;
import com.thoughtworks.iamcoach.pos.service.ItemServiceImpl;

public class App {
    public static void main(String[] args) {
        //TODO: Need to implement.
//
//        Scanner scanner = new Scanner();
//        System.out.print(scanner.getCartItems());
//        ItemDaoImpl itemDao = new ItemDaoImpl();
//        System.out.print(itemDao.getItem("ITEM000005").getId());
//        itemDao = new ItemDaoImpl();
//        System.out.print(itemDao.getItemPromotions("ITEM000001"));
//        PromotionDao promotionDao = new PromotionDaoImpl();
//        System.out.print(promotionDao.getPromotionBarcode());
        ItemService itemServiceImpl = new ItemServiceImpl();
        System.out.print(itemServiceImpl.getItem("ITEM000002").getPromotions());

    }
}
