import com.stringconcatenationperformance.StringConcatenation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringConcatenationTest {

    @Test
    public void testString() {
        String result = StringConcatenation.concatenateWithString(10);
        assertEquals("aaaaaaaaaa", result, "String concatenation failed");
    }

    @Test
    public void testStringBuilder() {
        String result = StringConcatenation.concatenateWithStringBuilder(10).toString();
        assertEquals("aaaaaaaaaa", result, "StringBuilder concatenation failed");
    }

    @Test
    public void testStringBuffer() {
        String result = StringConcatenation.concatenateWithStringBuffer(10).toString();
        assertEquals("aaaaaaaaaa", result, "StringBuffer concatenation failed");
    }
}
