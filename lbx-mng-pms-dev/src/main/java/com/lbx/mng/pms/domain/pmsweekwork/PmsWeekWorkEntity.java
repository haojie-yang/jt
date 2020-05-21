package com.lbx.mng.pms.domain.pmsweekwork;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:36
 */

@Data
@Entity
@Table(name = "pms_week_work")
public class PmsWeekWorkEntity {


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

    /** 周报说明 */
    @Column(name = "week_work_explain")
    private String weekWorkExplain;

    /** 后续计划 */
    @Column(name = "after_plan")
    private String afterPlan;

    /** 周报年度周次 */
    @Column(name = "week_num")
    private Integer weekNum;

    /** 周报开始时间 */
    @Column(name = "week_work_start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date weekWorkStartDate;

    /** 周报结束时间 */
    @Column(name = "week_work_stop_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date weekWorkStopDate;


}
