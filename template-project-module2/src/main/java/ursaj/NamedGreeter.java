package ursaj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NamedGreeter implements Greeter {
    private static final Logger log = LoggerFactory.getLogger(NamedGreeter.class);
    private final String name;

    public NamedGreeter(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        log.info("Greeting invoked [name={}]", name);
        return "Hello, " + name + "!";
    }
}
