package serviceProducer;

import com.alibaba.dubbo.config.annotation.Service;

import serviceDao.DemoService;

/**
 * Created by Auser on 2017/1/22.
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "HelloWorld!";
    }
}
