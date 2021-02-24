package io.daocloud.cicd.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peng chen
 * @description
 * @date 2021-02-24
 */
@RestController
@RequestMapping("/cicd")
public class K8sController {


    @GetMapping("/test")
    public String test(){
        return "jacky test cicd";
    }

}
