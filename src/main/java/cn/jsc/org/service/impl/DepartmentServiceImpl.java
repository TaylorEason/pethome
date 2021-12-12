package cn.jsc.org.service.impl;

import cn.jsc.basic.util.PageList;
import cn.jsc.org.domain.Department;
import cn.jsc.org.mapper.DepartmentMapper;
import cn.jsc.org.query.DepartmentQuery;
import cn.jsc.org.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 部门服务层
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public void add(Department department) {
        departmentMapper.save(department);
    }

    @Override
    public void update(Department department) {
        departmentMapper.update(department);
    }

    @Override
    public void delete(Long id) {
        departmentMapper.remove(id);
    }

    @Override
    public Department getById(Long id) {
        return departmentMapper.loadById(id);
    }

    @Override
    public List<Department> getAll() {
        return departmentMapper.loadAll();
    }
    /**
     * 返回分页的数据
     * @param departmentQuery
     * @return
     */
    @Override
    public PageList<Department> queryData(DepartmentQuery departmentQuery) {
        //1.获取总条数
        Long count = departmentMapper.queryCount(departmentQuery);
        //2.判断总条数如果为0，直接返回默认对象
        if(count==0){
            return new PageList<>();
        }
        //3.查询当前页的数据
        List<Department> rows = departmentMapper.queryData(departmentQuery);
        //4.返回分页数据
        PageList<Department> pageList = new PageList<>(count, rows);
        return pageList;
    }
}
