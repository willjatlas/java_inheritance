import TechSatff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dBAdmin;

    @Before
    public void before(){
        dBAdmin = new DatabaseAdmin("Ralph", "00R00100T", 24000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Ralph", dBAdmin.getName());
    }

    @Test
    public void canSetName(){
        dBAdmin.setName("Bart");
        assertEquals("Bart", dBAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("00R00100T", dBAdmin.getnINumber());
    }

    @Test
    public void canChangeNIBumber(){
        dBAdmin.setnINumber("NEWNUMB1");
        assertEquals("NEWNUMB1", dBAdmin.getnINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000.00, dBAdmin.getSalary(), 0.01);
    }

    @Test
    public void canChangeSalary(){
        dBAdmin.setSalary(30000.00);
        assertEquals(30000.00, dBAdmin.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        dBAdmin.raiseSalary(1000.00);
        assertEquals(25000.00, dBAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(240.00, dBAdmin.payBonus(), 0.01);
    }
}
