package cn.jsc.basic.util;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;
/**
 * 封装分页的结果
 */
@Data
public class PageList<T> {
    private Long total=0L;//条数
    private List<T> rows=new ArrayList<>();//数据

    public PageList() {
    }

    public PageList(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}
