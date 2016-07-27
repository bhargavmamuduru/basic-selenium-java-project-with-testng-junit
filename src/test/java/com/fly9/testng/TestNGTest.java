package com.fly9.testng;

import com.fly9.testdata.EmployeeDetails;
import com.fly9.testdata.EmployeeLogic;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Balu on 7/11/2016.
 */
public class TestNGTest {

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

        @Test
        public void testRestApi(){
//
//            given().
//                contentType("application/json").
//            when().
//                get("http://haproxy.fly9-testing.82209756.svc.dockerapp.io/rest/api/v1/resellers/bySiteDomain/haproxy.fly9-testing.82209756.svc.dockerapp.io/info").
//            then().
//                statusCode(200);
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
