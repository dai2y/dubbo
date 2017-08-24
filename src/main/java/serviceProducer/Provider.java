package serviceProducer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Auser on 2017/1/22.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"http://10.20.160.198/wiki/display/dubbo/provider.xml"});
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/produce.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }

}
