package cn.jsc.org.query;

import lombok.Data;

@Data
public class DepartmentQuery {
    private Integer currentPage=1;//当前页
    private Integer pageSize=5;//每页查询条数
    /**
     * 怎么获取当页数据开始的索引
     */
    public Integer getStart(){
        //计算公式
        return (this.currentPage-1)*this.pageSize;
    }
}
