package com.lbx.mng.pms.repository;

import com.lbx.framework.common.extend.jpa.LbxRepository;
import com.lbx.mng.pms.domain.pmsproduct.PmsProductEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 数据访问接口
 * @author code generator
 * @date 2020-05-13 14:02:29
 */

@Repository
public interface PmsProductRepository extends LbxRepository<PmsProductEntity, String> {

    /**
     * @param id 主键Id
     * @return 更新结果
     */
    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query("update PmsProductEntity d set d.status=0 where d.id=:id")
    int remove(@Param("id") String id);

    /**
     * @param ids 主键Id集合
     * @return 更新结果
     */
    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query("update PmsProductEntity d set d.status = 0 where d.id in :ids")
    int removes(@Param("ids") List<String> ids);

}
