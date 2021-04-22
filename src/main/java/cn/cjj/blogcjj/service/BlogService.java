package cn.cjj.blogcjj.service;

import org.springframework.stereotype.Service;

import java.io.*;

/**
 * @author CuiJunJie
 * @create 2021/4/21-10:24
 */

@Service
public class BlogService {
    public InputStream getBlogText(String name) throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("C:\\Users\\CJJ\\Desktop\\笔记\\ssm.md"));

        return bufferedInputStream;
    }
}
