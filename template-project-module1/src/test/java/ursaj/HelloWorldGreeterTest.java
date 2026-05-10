package ursaj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldGreeterTest {
    private final Greeter subject = new HelloWorldGreeter();

    @Test
    void it_must_greet_the_world() {
        assertThat(subject.greet()).isEqualTo("Hello, World!");
    }
}
