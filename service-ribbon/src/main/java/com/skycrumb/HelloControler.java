package com.skycrumb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/19 0019.
 */
//  一个服务注册中心，eureka server,端口为8761 service-hi工程跑了两个实例，端口分别为8762,8763，
//  分别向服务注册中心注册 sercvice-ribbon端口为8764,向服务注册中心注册 当sercvice-ribbon通过restTemplate
//  调用service-hi的hi接口时，因为用ribbon进行了负载均衡，会轮流的调用service-hi：8762和8763 两个端口的hi接口；
@RestController
public class HelloControler {

        @Autowired
        HelloService helloService;
//    @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写
        @GetMapping(value = "/hi")
        public String hi(@RequestParam String name) {
            return helloService.hiService( name );
        }

}
