package hello;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wk on 11/4/2015 AD.
 */
public class JwControllerTest {

    @Test
    public void helloJwTest() {
       String url = "http://localhost:8080/hellojw";
        RestTemplate template = new RestTemplate();
        JwInfo test = template.getForObject(url, JwInfo.class);
        Assert.assertEquals("Jannine", test.getName());
    }

    @Test
    public void updateJwTest() {
        String url = "http://localhost:8080/updatejw";
        RestTemplate template = new RestTemplate();
        JwInfo initial = new JwInfo() {{
            setName("Jannine Weigel");
        }};

        JwInfo newInfo = template.postForObject(url, initial, JwInfo.class);
        Assert.assertEquals("Jannine Weigel", newInfo.getName());
    }
}
