
package karate;

import com.intuit.karate.junit5.Karate;

class AddTest {

    @Karate.Test
    Karate testAddition() {
        return Karate.run("add").relativeTo(getClass());
    }
}