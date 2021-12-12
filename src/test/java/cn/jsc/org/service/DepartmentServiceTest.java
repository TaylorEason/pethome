package cn.jsc.org.service;

import cn.jsc.PetHomeApplication;
import cn.jsc.basic.util.PageList;
import cn.jsc.org.domain.Department;
import cn.jsc.org.domain.Employee;
import cn.jsc.org.query.DepartmentQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
/**
 * 测试
 */
@SpringBootTest(classes = PetHomeApplication.class )
@RunWith(SpringRunner.class)
public class DepartmentServiceTest {
    @Autowired
    private IDepartmentService departmentService;

    @Test
    public void add() {
        //根据id查询
        Department department = departmentService.getById(27l);
        System.out.println(department);

        Employee employee = new Employee();
        employee.setId(325l);
        department.setName("程序员");
        departmentService.add(department);


    }

    @Test
    public void update() {
        Department department = departmentService.getById(46L);
        System.out.println(department);

        Employee manager = new Employee();
        manager.setId(325L);
        department.setManager(manager);
        department.setName("aaaa修改啦");

        departmentService.update(department);
    }

    @Test
    public void delete() {
        departmentService.delete(46l);
    }

    @Test
    public void getById() {
    }

    @Test
    public void getAll() {
        List<Department> list = departmentService.getAll();
        list.forEach(System.out::println);
    }

    @Test
    public void queryData() {
        DepartmentQuery query = new DepartmentQuery();
        PageList<Department> pageList = departmentService.queryData(query);
        pageList.getRows().forEach(System.out::println);
        System.out.println(pageList.getTotal());
    }

}