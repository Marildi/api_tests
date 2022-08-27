import org.testng.annotations.Test;
import java.io.IOException;

public class StoreTest {
    @Test
    public void placeAnOrderForAPet() throws IOException {
        new StoreEndPoint().placeAnOrderForAPet(5, 1);
    }

    @Test
    public void findPurchaseOrderById() throws IOException {
        new StoreEndPoint().findPurchaseOrderById(7);
    }

    @Test
    public void deletePurchaseOrderById() throws IOException {
        new StoreEndPoint().deletePurchaseOrderById(88230554);
    }

    @Test
    public void returnPetInventoriesByStatus() throws IOException {
        new StoreEndPoint().returnPetInventoriesByStatus();
    }
}
