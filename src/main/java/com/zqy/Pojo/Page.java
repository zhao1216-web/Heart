package com.zqy.Pojo;

import java.util.List;

public class Page<T> {

    public static final Integer PAGE_SIZE = 4;

    //当前页码
    private Integer pageNo;

    //总页码
    private Integer pageTotal;

    //当前显示页数量
    private Integer pageSize = PAGE_SIZE;

    private Integer pageTotalCount;

    private List<T> items;


    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getPageTotalCount() {
        return pageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageTotal=" + pageTotal +
                ", pageTotalCount=" + pageTotalCount +
                ", items=" + items +
                '}';
    }

    public static Integer getPageSize() {
        return PAGE_SIZE;
    }
}
