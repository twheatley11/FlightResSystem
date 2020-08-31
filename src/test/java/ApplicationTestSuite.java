import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



import com.flightressystem.model.domain.AllDomainTests;
import com.flightressystem.model.services.AllServicesTests;
import com.flightressystem.model.business.AllBusinessTests;

@RunWith(Suite.class)
@SuiteClasses({AllDomainTests.class, AllBusinessTests.class, AllServicesTests.class})

public class ApplicationTestSuite {

}
