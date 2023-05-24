package com.ipb.mapper;

import com.ipb.domain.EventProduct;
import com.ipb.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EventProductMapper extends MyMapper<Long, EventProduct> {
  public List<EventProduct> searchEventProduct(String name) throws Exception;
  public List<EventProduct> searcheventproductbystartdate(String start_date) throws Exception;

}

