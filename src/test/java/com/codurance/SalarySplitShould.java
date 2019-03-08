package com.codurance;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SalarySplitShould {

    @Test
    void checkEmployeeID()
    {
        var employeeName = "John";
        var returnName = new SalaryGeneratorSlip().generateFor(employeeName);

        assertThat(returnName).isEqualTo("Aurelija");
    }

    //test comments
}
