import java.util.List;

public class ItemRepositoryTestImpl implements ItemRepository{
    @Override
    public List<Item> findAll() {
        return TestData.ALL_ITEMS;
    }

    @Override
    public Item findOne(String id) {
        List<Item> listItem=findAll();
        for(Item item:listItem) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
