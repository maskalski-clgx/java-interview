import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertThat(solution.foo()).isEqualTo("Hello world");
    }
}
