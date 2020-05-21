package com.lbx.mng.pms.domain.pmsprojectrisk;

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
public class PmsProjectRiskView extends BaseView {

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

    /** 描述 */
    private String describe;

    /** 影响 */
    private String effect;

    /** 责任人CODE */
    @JsonProperty("duty_peoplecode")
    private String dutyPeopleCode;

    /** 责任人 */
    @JsonProperty("duty_people")
    private String dutyPeople;

    /** 计划解决时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("plan_solvingdate")
    private Date planSolvingDate;

    /** 建议解决方案 */
    @JsonProperty("advise_solution")
    private String adviseSolution;


}
