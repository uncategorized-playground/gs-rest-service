package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwController {

    @RequestMapping("/hellojw")
    public JwInfo HelloJw() {
        return new JwInfo()  {{
            setName("Jannine");
        }};
    }

    @RequestMapping("/updatejw")
    public  JwInfo Update(@RequestBody JwInfo info) {
        return new JwInfo() {{
            setName(info.getName());
        }};
    }
}