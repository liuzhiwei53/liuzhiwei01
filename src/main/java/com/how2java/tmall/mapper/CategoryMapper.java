package com.how2java.tmall.mapper;

import java.util.List;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

public interface CategoryMapper {
    public List<Category> list(Page page);

    public int total();
}