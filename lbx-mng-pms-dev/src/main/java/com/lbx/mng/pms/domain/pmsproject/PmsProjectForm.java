package com.lbx.mng.pms.domain.pmsproject;

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
public class PmsProjectForm{

    /** ID */
    private String id;

    /** 项目代码 */
    @JsonProperty("project_code")
    private String projectCode;

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

    /** 所属产品代码 */
    @JsonProperty("product_code")
    private String productCode;

    /** 项目名称 */
    @JsonProperty("project_name")
    private String projectName;

    /** 项目性质 */
    @JsonProperty("project_nature")
    private Integer projectNature;

    /** 项目经理CODE */
    @JsonProperty("project_managercode")
    private String projectManagerCode;

    /** 项目经理 */
    @JsonProperty("project_manager")
    private String projectManager;

    /** OA事件/需求单使用 */
    @JsonProperty("o_a")
    private Integer oA;

    /** 主要使用业务线 */
    @JsonProperty("main_usebusinessline")
    private String mainUseBusinessLine;

    /** 项目开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("project_startdate")
    private Date projectStartDate;

    /** 优先级 */
    private Integer priority;

    /** 项目状态 */
    @JsonProperty("project_type")
    private Integer projectType;

    /** 项目阶段 */
    @JsonProperty("project_stage")
    private Integer projectStage;

    /** 预警状态 */
    @JsonProperty("early_warningtype")
    private Integer earlyWarningType;

    /** 项目发布人CODE */
    @JsonProperty("project_issuercode")
    private String projectIssuerCode;

    /** 项目发布人 */
    @JsonProperty("project_issuer")
    private String projectIssuer;

    /** 重点投入 */
    @JsonProperty("emphasis_putinto")
    private Integer emphasisPutInto;

    /** 系统架构 */
    @JsonProperty("system_framework")
    private String systemFramework;

    /** 项目禅道ID */
    @JsonProperty("project_zentaoid")
    private String projectZentaoId;

    /** 项目禅道名称 */
    @JsonProperty("project_zentaoname")
    private String projectZentaoName;

    /** 项目SVN地址 */
    @JsonProperty("project_svnaddress")
    private String projectSvnAddress;

    /** 项目简介 */
    @JsonProperty("project_brief")
    private String projectBrief;

    /** 项目描述 */
    @JsonProperty("project_description")
    private String projectDescription;

    /** 项目GIT地址 */
    @JsonProperty("project_gitaddress")
    private String projectGitAddress;

    /** OA周报 */
    @JsonProperty("oa_weekwork")
    private Integer oaWeekWork;

    /** 业务分类 */
    @JsonProperty("business_type")
    private String businessType;

    /** 是否为数字化项目 */
    @JsonProperty("project_digitization")
    private Integer projectDigitization;


}
