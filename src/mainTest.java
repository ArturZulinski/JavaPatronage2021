import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    public void first_test(){

        //given
        Integer choice1 = 1;
        Double val1 = 3.0;
        Integer choice2 = 1;
        Double val2 = 2.0;
        Integer choice3 = 1;
        //when

        //then
        Assertions.assertEquals(5.0, 5);
    }
}