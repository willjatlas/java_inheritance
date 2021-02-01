import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Tony Soprano", "NUNOFYABUSINESS",
                            120000.00, "Logistics", 1000000000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Tony Soprano", director.getName());
    }

    @Test
    public void canChangeName(){
        director.setName("Sony Toprano");
        assertEquals("Sony Toprano", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NUNOFYABUSINESS", director.getnINumber());
    }

    @Test
    public void canChangeNIBumber(){
        director.setnINumber("NEWNUMB1");
        assertEquals("NEWNUMB1", director.getnINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(120000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeSalary(){
        director.setSalary(70000.00);
        assertEquals(70000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Logistics", director.getDeptName());
    }

    @Test
    public void canChangeDeptName(){
        director.setDeptName("Private");
        assertEquals("Private", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000.00);
        assertEquals(121000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1200.00, director.payBonus(), 0.01);
    }
}
