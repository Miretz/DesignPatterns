import org.junit.Test;

import com.miretz.designpatterns.proxy.ReportGenerator;
import com.miretz.designpatterns.proxy.ReportGeneratorImplProxy;
import com.miretz.designpatterns.proxy.Role;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public class ProxyPatternTest {

    @Test
    public void proxyPatternTest() {

        Role accessRole = new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf", 150);
        proxy.generateComplexReports("Pdf", 150);
        proxy.generateSensitiveReport();

    }

}