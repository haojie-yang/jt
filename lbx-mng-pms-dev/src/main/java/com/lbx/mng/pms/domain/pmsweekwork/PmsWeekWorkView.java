package com.lbx.mng.pms.domain.pmsweekwork;

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
 * @date 2020-05-13 14:02:36
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class PmsWeekWorkView extends BaseView {

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

    /** 周报说明 */
    @JsonProperty("week_workexplain")
    private String weekWorkExplain;

    /** 后续计划 */
    @JsonProperty("after_plan")
    private String afterPlan;

    /** 周报年度周次 */
    @JsonProperty("week_num")
    private Integer weekNum;

    /** 周报开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("week_workstartdate")
    private Date weekWorkStartDate;

    /** 周报结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("week_workstopdate")
    private Date weekWorkStopDate;


}
