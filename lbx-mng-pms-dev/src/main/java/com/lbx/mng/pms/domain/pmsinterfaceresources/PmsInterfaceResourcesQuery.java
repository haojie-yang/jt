package com.lbx.mng.pms.domain.pmsinterfaceresources;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 条件封装实体类
 * @author code generator
 * @date 2020-05-13 14:02:28
 */

@Data
public class PmsInterfaceResourcesQuery {

    /** ID */
    private String id;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("creation_date")
    private Date creationDate;

    /** 创建人id */
    @JsonProperty("creation_id")
    private String creationId;

    /** 创建人 */
    @JsonProperty("creation_user")
    private String creationUser;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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

    /** 项目代码 */
    @JsonProperty("project_code")
    private String projectCode;

    /** 连接方式 */
    @JsonProperty("attended_mode")
    private Integer attendedMode;

    /** 接口名称 */
    @JsonProperty("interface_name")
    private String interfaceName;

    /** 源系统 */
    @JsonProperty("origin_system")
    private String originSystem;

    /** 目标系统 */
    @JsonProperty("target_system")
    private String targetSystem;

    /** 生产环境调用地址 */
    @JsonProperty("production_environmentaddress")
    private String productionEnvironmentAddress;

    /** 测试环境调用地址 */
    @JsonProperty("test_environmentaddress")
    private String testEnvironmentAddress;

    /** 接口类型 */
    @JsonProperty("interface_type")
    private String interfaceType;

    /** 使用频率 */
    @JsonProperty("use_frequency")
    private String useFrequency;

    /** 分类 */
    private String type;

    /** 数据规模 */
    @JsonProperty("data_scale")
    private String dataScale;

    /** 业务简述 */
    @JsonProperty("business_brief")
    private String businessBrief;

    /** 设计简述 */
    @JsonProperty("design_brief")
    private String designBrief;

    /** 运行状态 */
    @JsonProperty("running_status")
    private String runningStatus;

    /** SVN相关需求设计文档地址 */
    @JsonProperty("svn_designdocumentaddress")
    private String svnDesignDocumentAddress;

    /** 开始时间*/
    @JsonProperty("start_modification_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startModificationDate;

    /** 结束时间*/
    @JsonProperty("end_modification_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endModificationDate;

    /** 当前页*/
    private Integer page;

    /** 页大小*/
    private Integer size;

}
