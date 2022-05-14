package com.web.items.service.impl;

import com.web.items.mapper.ItemsMapper;
import com.web.items.pojo.Items;
import com.web.items.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAll() {
        return itemsMapper.selectByExample(null);
    }

    @Override
    public Items findOne(int id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addItems(Items items) {
        itemsMapper.insert(items);
    }

    @Override
    public void updateItems(Items items) {
        itemsMapper.updateByPrimaryKey(items);
    }

    @Override
    public void deleteItems(int id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
