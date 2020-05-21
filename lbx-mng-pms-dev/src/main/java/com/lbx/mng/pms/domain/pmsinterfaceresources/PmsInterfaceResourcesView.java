package com.lbx.mng.pms.domain.pmsinterfaceresources;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lbx.framework.common.domain.common.BaseView;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 展示实体类
 * @author code generator
 * @date 2020-05-13 14:02:28
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class PmsInterfaceResourcesView extends BaseView {

    /** ID */
    private String id;

    /** 创建人id */
    @JsonProperty("creation_id")
    private String creationId;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("modification_date")
    private Date modificationDate;

    /** 修改人id */
    @JsonProperty("modification_id")
    private String modificationId;

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


}
