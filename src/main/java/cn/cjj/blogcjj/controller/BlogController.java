package cn.cjj.blogcjj.controller;

import cn.cjj.blogcjj.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
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

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "markdown/{name}", method = RequestMethod.GET)
    public void sendMarkdown(@PathVariable String name, HttpServletResponse response) throws IOException {
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition",
                "attachment;fileName="+name);

        try (InputStream inputStream = blogService.getBlogText("ssm");
                ServletOutputStream outputStream = response.getOutputStream();){
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(buf)) > 0) {
                outputStream.write(buf, 0, len);
            }
            outputStream.flush();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
