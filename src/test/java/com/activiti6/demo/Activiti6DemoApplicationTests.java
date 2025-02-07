package com.activiti6.demo;

import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Activiti6DemoApplication.class)
public class Activiti6DemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    RepositoryService repositoryService;


    @Test
    public void deploy() {
        repositoryService.createDeployment().name("test")
                .addClasspathResource("processes/simpleTest.bpmn")
                .deploy();
    }
}
