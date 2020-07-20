package cn.james.webapp_init.common;

/**
 * @ClassName: BaseService
 * @Desciption:
 * @author: James
 * @date: 2020-07-04 下午3:19
 * @version: 1.0
 */
public interface BaseService<T,Serializable> {
    /**
     *
     * @Title: save
     * @Description: 新增对象
     * @param: @param obj 参数说明
     * @return: Boolean 返回类型
     * @throws
     */
    void save(T obj);
    /**
     *
     * @Title: update
     * @Description: 修改对象
     * @param: @param obj 参数说明
     * @return: Boolean 返回类型
     * @throws
     */
    void update(T obj);
    /**
     *
     * @Title: delete
     * @Description: 删除对象
     * @param: @param id 参数说明
     * @return: Boolean 返回类型
     * @throws
     */
    void delete(Serializable id);
    /**
     *
     * @Title: get
     * @Description: 根据ID查询对象
     * @param: @param id
     * @param: @return 参数说明
     * @return: T 返回类型
     * @throws
     */
    T getOne(Serializable id);
}
