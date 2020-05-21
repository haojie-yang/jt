package com.lbx.mng.pms.domain.pmsweekworkschedule;

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
 * @date 2020-05-13 14:02:37
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class PmsWeekWorkScheduleView extends BaseView {

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

    /** 周报id */
    @JsonProperty("week_workid")
    private String weekWorkId;

    /** 任务说明 */
    private String task;

    /** 工作类型 */
    @JsonProperty("work_type")
    private Integer workType;

    /** 责任人 */
    @JsonProperty("duty_people")
    private String dutyPeople;

    /** 计划完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("plan_finishdate")
    private Date planFinishDate;

    /** 计划说明 */
    private String plan;


}
