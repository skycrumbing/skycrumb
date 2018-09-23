package com.skycrumb;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/19 0019.
 */
//SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}