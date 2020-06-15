package com.example.accessingdatamysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class MyApplication {
    private static final Logger log = LoggerFactory.getLogger(MyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    /*@Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            String quote = restTemplate.getForObject(
                    "http://localhost:8000/question", String.class);
            log.info(quote);
        };
    }*/
    /*String url = "http://localhost/mirana-ee/app/login";
    RestTemplate client = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
//  请勿轻易改变此提交方式，大部分的情况下，提交方式都是表单提交
    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    //  封装参数，千万不要替换为Map与HashMap，否则参数无法传递
    MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
//  也支持中文
    params.add("username", "用户名");
    params.add("password", "123456");
    HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(params, headers);
    //  执行HTTP请求
    ResponseEntity<String> response = client.exchange(url, HttpMethod.POST, requestEntity, String.class);
//  输出结果
    System.out.println(response.getBody());*/

}
