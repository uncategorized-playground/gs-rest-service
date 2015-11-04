package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by wk on 11/4/2015 AD.
 */
@JsonIgnoreProperties(ignoreUnknown= true)
public class JwInfoTest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
