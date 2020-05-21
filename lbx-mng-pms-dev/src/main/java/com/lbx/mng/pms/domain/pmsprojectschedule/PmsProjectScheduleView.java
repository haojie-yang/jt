package com.lbx.mng.pms.domain.pmsprojectschedule;

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
 * @date 2020-05-13 14:02:31
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class PmsProjectScheduleView extends BaseView {

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

    /** 项目CODE */
    @JsonProperty("project_code")
    private String projectCode;

    /** 项目名称 */
    @JsonProperty("project_name")
    private String projectName;

    /** 工作项 */
    private Integer work;

    /** 计划开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("scheduled_startdate")
    private Date scheduledStartDate;

    /** 计划完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("scheduled_finishdate")
    private Date scheduledFinishDate;

    /** 实际开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("actual_startdate")
    private Date actualStartDate;

    /** 实际完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("actual_finishdate")
    private Date actualFinishDate;

    /** 进度 */
    private Integer schedule;

    /** 备注 */
    private String remark;


}
