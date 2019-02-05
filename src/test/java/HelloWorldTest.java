import org.testng.Assert;
import org.testng.annotations.*;

// https://stackoverflow.com/questions/155436/unit-test-naming-best-practices
// http://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html

public class HelloWorldTest {

    @Test()
    public void Foo_ReturnsHelloWorld() {

        HelloWorld hello = new HelloWorld();
        String result = hello.foo();


        Assert.assertNotNull(result);
        Assert.assertEquals(result, "Hello World!");

    }

    @Test()
    public void Foo_ThisShouldFail() {

        HelloWorld hello = new HelloWorld();
        String result = hello.foo();


        Assert.assertNotNull(result);
        Assert.assertEquals(result, "Goodbye");

    }

}
