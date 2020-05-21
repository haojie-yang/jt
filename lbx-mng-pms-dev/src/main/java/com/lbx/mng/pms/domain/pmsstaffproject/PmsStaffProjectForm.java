package com.lbx.mng.pms.domain.pmsstaffproject;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表单实体类
 * @author code generator
 * @date 2020-05-13 14:02:34
 */

@Data
public class PmsStaffProjectForm{

    /** ID */
    private String id;

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

    /** 人员id */
    @JsonProperty("staff_id")
    private String staffId;

    /** 项目CODE */
    @JsonProperty("project_code")
    private String projectCode;

    /** 项目评价 */
    @JsonProperty("project_estimate")
    private String projectEstimate;


}
