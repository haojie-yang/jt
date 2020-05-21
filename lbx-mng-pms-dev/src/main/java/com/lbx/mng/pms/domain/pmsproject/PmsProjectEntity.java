package com.lbx.mng.pms.domain.pmsproject;

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
@Table(name = "pms_project")
public class PmsProjectEntity {


    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    /** 项目代码 */
    @Column(name = "project_code")
    private String projectCode;

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

    /** 所属产品代码 */
    @Column(name = "product_code")
    private String productCode;

    /** 项目名称 */
    @Column(name = "project_name")
    private String projectName;

    /** 项目性质 */
    @Column(name = "project_nature")
    private Integer projectNature;

    /** 项目经理CODE */
    @Column(name = "project_manager_code")
    private String projectManagerCode;

    /** 项目经理 */
    @Column(name = "project_manager")
    private String projectManager;

    /** OA事件/需求单使用 */
    @Column(name = "OA")
    private Integer oA;

    /** 主要使用业务线 */
    @Column(name = "main_use_business_line")
    private String mainUseBusinessLine;

    /** 项目开始日期 */
    @Column(name = "project_start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date projectStartDate;

    /** 优先级 */
    @Column(name = "priority")
    private Integer priority;

    /** 项目状态 */
    @Column(name = "project_type")
    private Integer projectType;

    /** 项目阶段 */
    @Column(name = "project_stage")
    private Integer projectStage;

    /** 预警状态 */
    @Column(name = "early_warning_type")
    private Integer earlyWarningType;

    /** 项目发布人CODE */
    @Column(name = "project_issuer_code")
    private String projectIssuerCode;

    /** 项目发布人 */
    @Column(name = "project_issuer")
    private String projectIssuer;

    /** 重点投入 */
    @Column(name = "emphasis_put_into")
    private Integer emphasisPutInto;

    /** 系统架构 */
    @Column(name = "system_framework")
    private String systemFramework;

    /** 项目禅道ID */
    @Column(name = "project_zentao_id")
    private String projectZentaoId;

    /** 项目禅道名称 */
    @Column(name = "project_zentao_name")
    private String projectZentaoName;

    /** 项目SVN地址 */
    @Column(name = "project_svn_address")
    private String projectSvnAddress;

    /** 项目简介 */
    @Column(name = "project_brief")
    private String projectBrief;

    /** 项目描述 */
    @Column(name = "project_description")
    private String projectDescription;

    /** 项目GIT地址 */
    @Column(name = "project_git_address")
    private String projectGitAddress;

    /** OA周报 */
    @Column(name = "OA_week_work")
    private Integer oaWeekWork;

    /** 业务分类 */
    @Column(name = "business_type")
    private String businessType;

    /** 是否为数字化项目 */
    @Column(name = "project_digitization")
    private Integer projectDigitization;


}
