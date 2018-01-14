package JunitAnnotationsPractice;

import org.junit.*;

/**
 * Created by User on 13/01/2018.
 */
public class JUnitAnnotations {
    @BeforeClass
    public static void startBrowser() {
        System.out.println("Starting browser");

    }

    @AfterClass
    public static void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Before
    public void before() {
        System.out.println("I am in Before method");
    }
    @After
    public void after() {
        System.out.println("I am in After method");
    }

    @Test
    public void testCaseOne() {
        System.out.println("Testcase One");
    }

}
