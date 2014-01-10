import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class DemoTest {

    @Test
    public void shouldGiveSumOfInputValues(){
        Demo demo = new Demo();
        assertThat(4, IsEqual.equalTo(demo.sum(2,2)));
        assertThat(6, IsEqual.equalTo(demo.sum(2,2,2)));
        assertThat(8, IsEqual.equalTo(demo.sum(2,2,2,2)));
        assertThat(9, IsEqual.equalTo(demo.sum(2,2,2,1,1,1)));
        assertThat(10, IsEqual.equalTo(demo.sum(2,2,1,1,1,1,1,1)));
    }


}
