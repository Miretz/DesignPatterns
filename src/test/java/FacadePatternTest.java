import org.junit.Test;

import com.miretz.designpatterns.facade.OrderController;

public class FacadePatternTest {

    @Test
    public void testFacadePattern() {
        final OrderController controller = new OrderController();

        controller.orderItem(12);

    }

}
