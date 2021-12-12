package cn.jsc.org.domain;

import lombok.Data;

/**
 * 部门的实体类
 */
@Data //相当于配置get set hashcode equals tostring
public class Department {
    private Long id;//主键
    private String sn;//部门编号
    private String name;//部门名称
    private String dirPath;//暂时不用
    private Integer state; //部门状态 0 正常 ，-1 停用
    /**
     * 配置部门经理
     */
    private Employee manager;
    //用不到
    private Long manager_id;
    //用不到
    private Long parent_id;
    /**
     * 配置父部门
     */
    private Department parent;

}
