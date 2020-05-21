package com.lbx.mng.pms.domain.pmsproduct;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:29
 */

@Data
@Entity
@Table(name = "pms_product")
public class PmsProductEntity {


    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    /** 产品代码 */
    @Column(name = "product_code")
    private String productCode;

    /** 创建时间 */
    @Column(name = "creation_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creationDate;

    /** 创建人id */
    @Column(name = "creation_id")
    private String creationId;

    /** 创建人 */
    @Column(name = "creation_user")
    private String creationUser;

    /** 修改时间 */
    @Column(name = "modification_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modificationDate;

    /** 修改人id */
    @Column(name = "modification_id")
    private String modificationId;

    /** 修改人 */
    @Column(name = "modification_user")
    private String modificationUser;

    /** 删除标记 */
    @Column(name = "status")
    private Integer status;

    /** 产品状态 */
    @Column(name = "product_type")
    private Integer productType;

    /** 归属责任部门 */
    @Column(name = "responsible_department")
    private Integer responsibleDepartment;

    /** 产品名称 */
    @Column(name = "product_name")
    private String productName;

    /** 业务分类 */
    @Column(name = "business_type")
    private Integer businessType;

    /** 产品说明 */
    @Column(name = "product_explain")
    private String productExplain;

    /** 备注说明 */
    @Column(name = "remark")
    private String remark;


}
