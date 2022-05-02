import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;
import java.io.IOException;

public class ProgramJUnitTest{
    
    @Test 
    public void test1() throws IOException{
        assertEquals(10, Program.doubleNum(5));
    }
}
