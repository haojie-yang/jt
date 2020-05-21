package com.lbx.mng.pms.domain.pmsstaffdetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表单实体类
 * @author code generator
 * @date 2020-05-13 14:02:34
 */

@Data
public class PmsStaffDetailsForm{

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

    /** 角色 */
    private Integer role;

    /** 类型 */
    private Integer type;

    /** 职位 */
    private String position;

    /** 禅道账号 */
    @JsonProperty("zentao_account")
    private String zentaoAccount;

    /** 联系电话 */
    private String iphone;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("entry_time")
    private Date entryTime;

    /** 离职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("resignation_time")
    private Date resignationTime;

    /** 其他联系方式 */
    @JsonProperty("other_contactway")
    private String otherContactWay;

    /** 公司名称 */
    @JsonProperty("company_name")
    private String companyName;

    /** 备注说明 */
    private String remark;

    /** 挂靠部门 */
    @JsonProperty("affiliated_department")
    private Integer affiliatedDepartment;


}
