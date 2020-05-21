package com.lbx.mng.pms.domain.pmsthirdpartyresources;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表单实体类
 * @author code generator
 * @date 2020-05-13 14:02:35
 */

@Data
public class PmsThirdPartyResourcesForm{

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

    /** 项目CODE */
    @JsonProperty("project_code")
    private String projectCode;

    /** 项目名称 */
    @JsonProperty("project_name")
    private String projectName;

    /** 人员id */
    @JsonProperty("people_code")
    private String peopleCode;

    /** 人员姓名 */
    @JsonProperty("people_name")
    private String peopleName;

    /** 联系电话 */
    private String phone;

    /** 人员职位 */
    @JsonProperty("people_post")
    private String peoplePost;

    /** 合作开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("cooperation_startdate")
    private Date cooperationStartDate;

    /** 合作结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("cooperation_overdate")
    private Date cooperationOverDate;

    /** 其他联系方式 */
    @JsonProperty("other_contactway")
    private String otherContactWay;

    /** 第三方厂家名称 */
    @JsonProperty("third_partymanufacturername")
    private String thirdPartyManufacturerName;

    /** 备注说明 */
    private String remark;


}
