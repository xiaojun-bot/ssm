package com.service.impl;

import com.dao.itemsDao;
import com.domain.Items;
import com.service.items_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class serviceimpl implements items_service {

    @Autowired
    private itemsDao dao;

    public Items findById(Integer id) {
        return dao.findById(id);
    }
}
