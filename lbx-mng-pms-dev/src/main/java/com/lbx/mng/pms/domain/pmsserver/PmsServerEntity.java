package com.lbx.mng.pms.domain.pmsserver;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:32
 */

@Data
@Entity
@Table(name = "pms_server")
public class PmsServerEntity {


    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

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

    /** 项目代码 */
    @Column(name = "project_code")
    private String projectCode;

    /** 环境分类 */
    @Column(name = "environment_type")
    private Integer environmentType;

    /** 服务器角色 */
    @Column(name = "server_role")
    private Integer serverRole;

    /** 服务器位置 */
    @Column(name = "server_location")
    private Integer serverLocation;

    /** 服务器ip */
    @Column(name = "server_ip_one")
    private String serverIpOne;

    /** 服务器ip */
    @Column(name = "server_ip_two")
    private String serverIpTwo;

    /** CPU数量 */
    @Column(name = "cpu_count")
    private String cpuCount;

    /** 内存 */
    @Column(name = "memory_capacity")
    private String memoryCapacity;

    /** 储存 */
    @Column(name = "storage_space")
    private String storageSpace;

    /** 操作系统 */
    @Column(name = "OS")
    private String oS;

    /** 数据库 */
    @Column(name = "database")
    private String database;

    /** 数据库实例名称 */
    @Column(name = "database_name")
    private String databaseName;

    /** 数据库使用空间 */
    @Column(name = "database_use_space")
    private String databaseUseSpace;

    /** 数据库空间年增长预估 */
    @Column(name = "database_space_yearly_growth")
    private String databaseSpaceYearlyGrowth;

    /** 服务器备注 */
    @Column(name = "server_remark")
    private String serverRemark;

    /** 服务器名称 */
    @Column(name = "server_name")
    private String serverName;

    /** 部署时间 */
    @Column(name = "deploy_time")
    private Integer deployTime;

    /** 备份建议 */
    @Column(name = "backup_advice")
    private Integer backupAdvice;

    /** 是否备份 */
    @Column(name = "backup")
    private Integer backup;

    /** 备份保留周期 */
    @Column(name = "backup_retention_cycle")
    private Integer backupRetentionCycle;

    /** 关联的数据库 */
    @Column(name = "associated_database")
    private String associatedDatabase;

    /** 关联的应用 */
    @Column(name = "associated_app")
    private String associatedApp;

    /** 使用频率 */
    @Column(name = "use_frequency")
    private Integer useFrequency;

    /** 服务范围 */
    @Column(name = "scope_of_services")
    private Integer scopeOfServices;

    /** 内网故障是否需要人工恢复 */
    @Column(name = "intranet_fail_artificial_restoration")
    private Integer intranetFailArtificialRestoration;

    /** 外网故障是否需要人工恢复 */
    @Column(name = "outer_net_fail_artificial_restoration")
    private Integer outerNetFailArtificialRestoration;

    /** 网络故障人工恢复备注 */
    @Column(name = "net_fail_artificial_restoration_remark")
    private String netFailArtificialRestorationRemark;

    /** 关联的应用 */
    @Column(name = "binding_domain")
    private String bindingDomain;

    /** 云服务器带宽 */
    @Column(name = "cloud_server_bandwidth")
    private String cloudServerBandwidth;

    /** 云服务器实例ID */
    @Column(name = "cloud_server_instantiation_id")
    private String cloudServerInstantiationId;

    /** 云服务器创建日期 */
    @Column(name = "cloud_server_creation_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cloudServerCreationDate;

    /** 云服务器到期日期 */
    @Column(name = "cloud_server_maturity_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cloudServerMaturityDate;
}
