package org.koreait.exams;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.TestPropertySource;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
public class FilePathTest {

    @DisplayName("파일 추출 테스트")
    @Test
    public void test01() throws IOException {
        Resource resource = new ClassPathResource("/static/css");
        File dir = resource.getFile();
        String[] names= dir.list();
        Object[] result = (String[])Arrays.stream(names).map(n->n.substring(0,n.lastIndexOf("."))).toArray();
        System.out.println(Arrays.toString(result));

//        for(File file : files){
//            String fileName = file.getName();
//            System.out.println(fileName);
//        }
    }
}
