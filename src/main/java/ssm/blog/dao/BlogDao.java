package ssm.blog.dao;

import ssm.blog.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 *  博客Dao接口
 * @author xt
 *
 */
public interface BlogDao {


	// 分页查询博客
	 List<Blog> listBlog(Map<String, Object> map);

	// 获取总记录数
	 Long getTotal(Map<String, Object> map);

	// 根据博客类型的id查询该类型下的博客数量
	 Integer getBlogByTypeId(Integer typeId);

	//添加博客
	 Integer saveBlog(Blog blog);

	//更新博客
	 Integer updateBlog(Blog blog);

	 Integer deleteBlog(Integer id);

	//通过id获取博客
	 Blog getById(Integer id);

	/**
	 * 获取上一篇博客
	 * @param id
	 * @return
	 */
	Blog getPrevBlog(Integer id);
	/**
	 * 获取下一篇博客
	 * @param id
	 * @return
	 */
	Blog getNextBlog(Integer id);
}
