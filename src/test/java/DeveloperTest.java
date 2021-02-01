import TechSatff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Brian Blessed", "01LEGEND10", 26000.00 );
    }

    @Test
    public void canGetName() {
        assertEquals("Brian Blessed", developer.getName());
    }

    @Test
    public void canSetName(){
        developer.setName("Flash Gordon");
        assertEquals("Flash Gordon", developer.getName());
    }

    @Test
    public void cantSetNameIfEmptyString(){
        developer.setName("");
        assertEquals("Brian Blessed", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("01LEGEND10", developer.getnINumber());
    }

    @Test
    public void canChangeNIBumber(){
        developer.setnINumber("NEWNUMB1");
        assertEquals("NEWNUMB1", developer.getnINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(26000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canChangeSalary(){
        developer.setSalary(30000.00);
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(27000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(260.00, developer.payBonus(), 0.01);
    }
}
