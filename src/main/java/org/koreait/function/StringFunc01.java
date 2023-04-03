package org.koreait.function;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class StringFunc01 {
    /**
     * resources/static/css & js 내 파일명 가져오는 함수.
     */
    public static Object[] subStringFileName(String dirName) throws IOException {
        Resource resource = new ClassPathResource("/static/"+dirName);
        File dir = resource.getFile();
        String[] names = dir.list();
        return Arrays.stream(names).map(n -> n.substring(0, n.lastIndexOf("."))).toArray();
    }
}
