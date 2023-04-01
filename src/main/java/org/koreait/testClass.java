package org.koreait;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class testClass {
    @Autowired
    private ResourceLoader loader;
//    Resource resource = loader.getResource("classpath:/static/css/style.css");
//    resource.getFile();


}
