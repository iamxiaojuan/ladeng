package ladeng.work.sb.dao;

import ladeng.work.sb.model.product;
import ladeng.work.sb.model.productWithBLOBs;

public interface productMapper {
    int deleteByPrimaryKey(String id);

    int insert(productWithBLOBs record);

    int insertSelective(productWithBLOBs record);

    productWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(productWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(productWithBLOBs record);

    int updateByPrimaryKey(product record);
}