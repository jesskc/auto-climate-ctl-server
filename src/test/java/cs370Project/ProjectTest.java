package cs370Project;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectTest {

    @Test
    public void greeterSaysHello() {
        assertThat("HelloWorld", containsString("Hello"));
    }

}