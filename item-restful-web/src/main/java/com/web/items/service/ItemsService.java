package com.web.items.service;

import com.web.items.pojo.Items;

import java.util.List;

public interface ItemsService {

    public List<Items> findAll();

    public Items findOne(int id);

    public void addItems(Items items);

    public void updateItems(Items items);

    public void deleteItems(int id);
}
