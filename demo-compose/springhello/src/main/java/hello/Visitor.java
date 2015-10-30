package hello;

import redis.clients.jedis.Jedis;

public class Visitor {

    private final int id;
    private final String name;
    private int visits;

    private int redisVisits;
    Jedis jedis = new Jedis("democompose_db_1");

    public Visitor (int id, String name) {
        this.id = id;
        this.name = name;
        this.visits = 0;
    }

    public void visit() {
        this.jedis.incr(this.getName());
        this.visits += 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getVisits() {
        return visits;
    }

    public int getRedisVisits() {
        return Integer.parseInt(this.jedis.get(this.name));
    }
}
