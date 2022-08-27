import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class StoreEndPoint {
    //POST
    public void placeAnOrderForAPet(int id, int quantity) throws IOException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("petId", id);
        jsonObject.put("quantity", quantity);

        RequestBody requestBody = RequestBody.create(jsonObject.toString().getBytes());

        Request request = new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/store/order")
                .header("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println("Place an order for a pet method info: " + response.body().string());
    }

    //GET
    public void findPurchaseOrderById(int id) throws IOException {

        Request request = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/order/" + id)
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println("Find purchase order by id method info: " + response.body().string());
    }

    //DELETE
    public void deletePurchaseOrderById(int id) throws IOException {
        Request request = new Request.Builder()
                .delete()
                .url("https://petstore.swagger.io/v2/store/order/" + id)
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println("Delete purchase order by id method info: " + response.body().string());
    }

    //GET
    public void returnPetInventoriesByStatus() throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/inventory")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println("Return pet inventories by status method info: " + response.body().string());
    }
}
