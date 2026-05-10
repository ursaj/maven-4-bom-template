package ursaj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NamedGreeterTest {
    private final String name = "professor Dumbledore";
    private final Greeter subject = new NamedGreeter(name);

    @Test
    void it_must_implement_greeter_iface() {
        assertThat(subject).isInstanceOf(Greeter.class);
    }

    @Test
    void it_must_greet_the_world() {
        assertThat(subject.greet()).isEqualTo("Hello, " + name + "!");
    }
}
