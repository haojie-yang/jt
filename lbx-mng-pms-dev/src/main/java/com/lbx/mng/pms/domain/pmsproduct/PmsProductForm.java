package com.lbx.mng.pms.domain.pmsproduct;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表单实体类
 * @author code generator
 * @date 2020-05-13 14:02:29
 */

@Data
public class PmsProductForm{

    /** ID */
    private String id;

    /** 产品代码 */
    @JsonProperty("product_code")
    private String productCode;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("creation_date")
    private Date creationDate;

    /** 创建人id */
    @JsonProperty("creation_id")
    private String creationId;

    /** 创建人 */
    @JsonProperty("creation_user")
    private String creationUser;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("modification_date")
    private Date modificationDate;

    /** 修改人id */
    @JsonProperty("modification_id")
    private String modificationId;

    /** 修改人 */
    @JsonProperty("modification_user")
    private String modificationUser;

    /** 删除标记 */
    private Integer status;

    /** 产品状态 */
    @JsonProperty("product_type")
    private Integer productType;

    /** 归属责任部门 */
    @JsonProperty("responsible_department")
    private Integer responsibleDepartment;

    /** 产品名称 */
    @JsonProperty("product_name")
    private String productName;

    /** 业务分类 */
    @JsonProperty("business_type")
    private Integer businessType;

    /** 产品说明 */
    @JsonProperty("product_explain")
    private String productExplain;

    /** 备注说明 */
    private String remark;


}
