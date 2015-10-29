package hello;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
public class VisitorController {

    HashMap<String, Visitor> visitorTracking = new HashMap<>();

    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping("/visit")
    public Visitor visit(@RequestParam(value="name", defaultValue="Tuvieja") String name) {
        Visitor v = visitorTracking.get(name);
        if(v == null){
            v = new Visitor(counter.getAndIncrement(), name);
            visitorTracking.put(name, v);
        }
        v.visit();
        return v;
    }
}
