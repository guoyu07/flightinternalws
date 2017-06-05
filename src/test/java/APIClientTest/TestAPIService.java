package APIClientTest;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.orderdetailsearch.v1.GaOrderDetailSearchRequest;
import com.ctrip.soa.global.api.orderdetailsearch.v1.GaOrderDetailSearchResponse;
import com.ctrip.soa.international.ibuflightapi.service.v1.IBUFlightAPIClient;
import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyxie on 2017/6/4.
 */
public class TestAPIService extends TestCase {

    @Test
    public void testAPIClient(){
        IBUFlightAPIClient client = IBUFlightAPIClient.getInstance("http://ws.flight.ibu.fat55.qa.nt.ctripcorp.com/intlflightapi");
        Assert.assertNotNull(client);

        if (client == null){
            System.out.println("Get Client Failed!");
        }

        GaOrderDetailSearchRequest request = new GaOrderDetailSearchRequest();
        Head head = new Head();
        head.setApiKey("flightinternalws");
        head.setUid("E583410266");
        request.setHead(head);

        List<Long> orderIdList = new ArrayList<Long>();
        orderIdList.add(new Long("2160689591"));
        request.setOrderIDList(orderIdList);
        try {
            GaOrderDetailSearchResponse response = client.gaOrderDetailSearch(request);
            Assert.assertNotNull(response);
            Gson gson = new Gson();
            String responseStr = gson.toJson(response);
            System.out.println(responseStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
