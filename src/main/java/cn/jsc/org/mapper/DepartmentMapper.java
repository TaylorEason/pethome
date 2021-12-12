package cn.jsc.org.mapper;

import cn.jsc.org.domain.Department;
import cn.jsc.org.query.DepartmentQuery;

import java.util.List;

public interface DepartmentMapper {
    //基础方法
    void save(Department department);//新增
    void update(Department department);//修改
    void remove(Long id);//删除
    Department loadById(Long id);//通过id查询
    List<Department> loadAll();//查询所有

    //分页查询
    //1.查询总条数
    Long queryCount(DepartmentQuery query);
    //2.查询当前的页数
    List<Department> queryData(DepartmentQuery query);
}
