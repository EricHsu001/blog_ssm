package ssm.blog.dao;

import org.springframework.stereotype.Repository;
import ssm.blog.entity.Blogger;

/** 数据访问对象接口
 * @author  xutong
 * @version 1.0
 *
 */

@Repository //注册为持久层的bean
public interface BloggerDao {
    /**
     * 查询博主信息
     * @return
     */
    Blogger getBloggerData();
}