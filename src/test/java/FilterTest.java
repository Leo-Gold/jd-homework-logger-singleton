import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FilterTest {
    @Test
    void filterReturn() {
        int[] array = new int[]{3, 5, 5, 1, 0, 3, 6};
        List<Integer> list = Arrays.stream(array).boxed().toList();
        List actual = new Filter(4).filterOut(list);
        List expected = Arrays.stream(new int[]{5, 5, 6}).boxed().toList();
        Assertions.assertEquals(expected, actual);
    }
}
