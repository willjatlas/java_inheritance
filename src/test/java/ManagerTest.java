import Management.Manager;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steve Jobs", "JT26172APL",
                               60000.00, "Development");
    }

    @Test
    public void hasName(){
        assertEquals("Steve Jobs", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Bill Gates");
        assertEquals("Bill Gates", manager.getName());
    }

    @Test
    public void cantSetNameIfEmptyString() {
        manager.setName("");
        assertEquals("Steve Jobs", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JT26172APL", manager.getnINumber());
    }

    @Test
    public void canChangeNIBumber(){
        manager.setnINumber("NEWNUMB1");
        assertEquals("NEWNUMB1", manager.getnINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canChangeSalary(){
        manager.setSalary(70000.00);
        assertEquals(70000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Development", manager.getDeptName());
    }

    @Test
    public void canChangeDeptName(){
        manager.setDeptName("Business");
        assertEquals("Business", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(61000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(600.00, manager.payBonus(), 0.01);
    }

}
