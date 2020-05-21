package com.lbx.mng.pms.domain.pmsserver;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 条件封装实体类
 * @author code generator
 * @date 2020-05-13 14:02:32
 */

@Data
public class PmsServerQuery {

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

    /** 环境分类 */
    @JsonProperty("environment_type")
    private Integer environmentType;

    /** 服务器角色 */
    @JsonProperty("server_role")
    private Integer serverRole;

    /** 服务器位置 */
    @JsonProperty("server_location")
    private Integer serverLocation;

    /** 服务器ip */
    @JsonProperty("server_ip_one")
    private String serverIpOne;

    /** 服务器ip */
    @JsonProperty("server_ip_two")
    private String serverIpTwo;

    /** CPU数量 */
    @JsonProperty("cpu_count")
    private String cpuCount;

    /** 内存 */
    @JsonProperty("memory_capacity")
    private String memoryCapacity;

    /** 储存 */
    @JsonProperty("storage_space")
    private String storageSpace;

    /** 操作系统 */
    @JsonProperty("o_s")
    private String oS;

    /** 数据库 */
    private String database;

    /** 数据库实例名称 */
    @JsonProperty("database_name")
    private String databaseName;

    /** 数据库使用空间 */
    @JsonProperty("database_usespace")
    private String databaseUseSpace;

    /** 数据库空间年增长预估 */
    @JsonProperty("database_spaceyearlygrowth")
    private String databaseSpaceYearlyGrowth;

    /** 服务器备注 */
    @JsonProperty("server_remark")
    private String serverRemark;

    /** 服务器名称 */
    @JsonProperty("server_name")
    private String serverName;

    /** 部署时间 */
    @JsonProperty("deploy_time")
    private Integer deployTime;

    /** 备份建议 */
    @JsonProperty("backup_advice")
    private Integer backupAdvice;

    /** 是否备份 */
    private Integer backup;

    /** 备份保留周期 */
    @JsonProperty("backup_retentioncycle")
    private Integer backupRetentionCycle;

    /** 关联的数据库 */
    @JsonProperty("associated_database")
    private String associatedDatabase;

    /** 关联的应用 */
    @JsonProperty("associated_app")
    private String associatedApp;

    /** 使用频率 */
    @JsonProperty("use_frequency")
    private Integer useFrequency;

    /** 服务范围 */
    @JsonProperty("scope_ofservices")
    private Integer scopeOfServices;

    /** 内网故障是否需要人工恢复 */
    @JsonProperty("intranet_failartificialrestoration")
    private Integer intranetFailArtificialRestoration;

    /** 外网故障是否需要人工恢复 */
    @JsonProperty("outer_netfailartificialrestoration")
    private Integer outerNetFailArtificialRestoration;

    /** 网络故障人工恢复备注 */
    @JsonProperty("net_failartificialrestorationremark")
    private String netFailArtificialRestorationRemark;

    /** 关联的应用 */
    @JsonProperty("binding_domain")
    private String bindingDomain;

    /** 云服务器带宽 */
    @JsonProperty("cloud_server_bandwidth")
    private String cloudServerBandwidth;

    /** 云服务器实例ID */
    @JsonProperty("cloud_server_instantiation_id")
    private String cloudServerInstantiationId;

    /** 云服务器创建日期 */
    @JsonProperty("cloud_server_creation_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cloudServerCreationDate;

    /** 云服务器到期日期 */
    @JsonProperty("cloud_server_maturity_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cloudServerMaturityDate;


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
