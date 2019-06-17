package com.dao;

import com.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface itemsDao {

    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
