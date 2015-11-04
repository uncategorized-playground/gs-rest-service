### Test Spring REST API

#### Run

``` cmd
cd complete
gradle run
```

#### Test GET (Browser)

```cmd
http://localhost:8080/greeting
```

#### Result

```json
{
    "id": 5,
    "content": "Hello, World!"
}
```

#### Test POST

```java
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
```