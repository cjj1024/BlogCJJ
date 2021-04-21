package cn.cjj.blogcjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author CuiJunJie
 * @create 2021/4/20-20:07
 */

@Controller
public class BlogController {

    @RequestMapping("blog")
    public String showBlog() {
        return "blog";
    }


    @RequestMapping(value = "markdown/{name}", method = RequestMethod.GET)
    public void sendMarkdown(@PathVariable String name, HttpServletResponse response) throws IOException {
        String text = "# Hello";

        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition",
                "attachment;fileName="+name);

        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(text.getBytes(StandardCharsets.UTF_8));
        outputStream.close();
    }
}
