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
        JwInfoTest test = template.getForObject(url, JwInfoTest.class);
        Assert.assertEquals("Jannine", test.getName());
    }
}
