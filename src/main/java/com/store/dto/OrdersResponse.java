package com.store.dto;

import java.util.List;

public class OrdersResponse {

    private List<OrderDTO> content;
    private int pageNo;
    private int pageSize;
    private long totalProducts;
    private int totalPage;
    private boolean lastPage;

    public List<OrderDTO> getContent() {
        return content;
    }

    public void setContent(List<OrderDTO> content) {
        this.content = content;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(long totalProducts) {
        this.totalProducts = totalProducts;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }

    public OrdersResponse(List<OrderDTO> content, int pageNo, int pageSize, long totalProducts, int totalPage,
            boolean lastPage) {
        this.content = content;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalProducts = totalProducts;
        this.totalPage = totalPage;
        this.lastPage = lastPage;
    }

    public OrdersResponse() {
    }

}
