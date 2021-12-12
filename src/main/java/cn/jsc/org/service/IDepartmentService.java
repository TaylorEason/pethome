package cn.jsc.org.service;

import cn.jsc.basic.util.PageList;
import cn.jsc.org.domain.Department;
import cn.jsc.org.query.DepartmentQuery;

import java.util.List;

public interface IDepartmentService {
    //基础方法
    void add(Department department);//新增
    void update(Department department);//修改
    void delete(Long id);//删除
    Department getById(Long id);//通过id查询
    List<Department> getAll();//查询所有

    //返回分页数据
    PageList<Department> queryData(DepartmentQuery departmentQuery);
}
