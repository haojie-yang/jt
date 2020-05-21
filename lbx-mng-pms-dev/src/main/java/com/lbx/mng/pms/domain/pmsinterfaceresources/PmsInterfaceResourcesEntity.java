package com.lbx.mng.pms.domain.pmsinterfaceresources;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:28
 */

@Data
@Entity
@Table(name = "pms_interface_resources")
public class PmsInterfaceResourcesEntity {


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

    /** 连接方式 */
    @Column(name = "attended_mode")
    private Integer attendedMode;

    /** 接口名称 */
    @Column(name = "interface_name")
    private String interfaceName;

    /** 源系统 */
    @Column(name = "origin_system")
    private String originSystem;

    /** 目标系统 */
    @Column(name = "target_system")
    private String targetSystem;

    /** 生产环境调用地址 */
    @Column(name = "production_environment_address")
    private String productionEnvironmentAddress;

    /** 测试环境调用地址 */
    @Column(name = "test_environment_address")
    private String testEnvironmentAddress;

    /** 接口类型 */
    @Column(name = "interface_type")
    private String interfaceType;

    /** 使用频率 */
    @Column(name = "use_frequency")
    private String useFrequency;

    /** 分类 */
    @Column(name = "type")
    private String type;

    /** 数据规模 */
    @Column(name = "data_scale")
    private String dataScale;

    /** 业务简述 */
    @Column(name = "business_brief")
    private String businessBrief;

    /** 设计简述 */
    @Column(name = "design_brief")
    private String designBrief;

    /** 运行状态 */
    @Column(name = "running_status")
    private String runningStatus;

    /** SVN相关需求设计文档地址 */
    @Column(name = "svn_design_document_address")
    private String svnDesignDocumentAddress;


}
