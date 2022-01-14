package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private final TestCase testCase;

    public ParameterizedTest(TestCase testCase) {
        this.testCase = testCase;
    }

    @Parameters
    public static Collection<Object[]> data() {
        List<Object[]> parameters = new ArrayList<>();

        parameters.add(new Object[] { new TestCase(true) });
    /*    parameters.add(new Object[] { new TestCase(false) });
        parameters.add(new Object[] { new TestCase(false) });
        parameters.add(new Object[] { new TestCase(false) });*/
        parameters.add(new Object[] { new TestCase(true) });
        return parameters;
    }

    protected static class TestCase {

        private final boolean success;

        public TestCase(boolean success) {
            this.success = success;
        }
    }

    @Test
    public void test() {
        assertTrue(testCase.success);
    }

}
