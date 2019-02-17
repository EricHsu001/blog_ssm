package ssm.blog.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ResponseUtil {
    public static void write(HttpServletResponse response, JSONObject jsonObject) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(jsonObject.toString());
        out.flush();
        out.close();
    }
}
