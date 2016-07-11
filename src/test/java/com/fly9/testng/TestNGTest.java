package com.fly9.testng;

import com.fly9.testdata.EmployeeDetails;
import com.fly9.testdata.EmployeeLogic;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Balu on 7/11/2016.
 */
public class TestNGTest {
    public class TestEmployeeDetails {

        EmployeeLogic empBusinessLogic = new EmployeeLogic();
        EmployeeDetails employee = new EmployeeDetails();

        @Test
        public void testCalculateAppriasal() {

            employee.setName("Rajeev");
            employee.setAge(25);
            employee.setMonthlySalary(8000);

            double appraisal = empBusinessLogic.calculateAppraisal(employee);
            Assert.assertEquals(500, appraisal, 0.0, "500");
        }

        // Test to check yearly salary
        @Test
        public void testCalculateYearlySalary() {

            employee.setName("Rajeev");
            employee.setAge(25);
            employee.setMonthlySalary(8000);

            double salary = empBusinessLogic.calculateYearlySalary(employee);
            Assert.assertEquals(96000, salary, 0.0, "8000");
        }
    }

}
