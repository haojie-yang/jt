package com.lbx.mng.pms.domain.pmsweekworkschedule;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:37
 */

@Data
@Entity
@Table(name = "pms_week_work_schedule")
public class PmsWeekWorkScheduleEntity {


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

    /** 周报id */
    @Column(name = "week_work_id")
    private String weekWorkId;

    /** 任务说明 */
    @Column(name = "task")
    private String task;

    /** 工作类型 */
    @Column(name = "work_type")
    private Integer workType;

    /** 责任人 */
    @Column(name = "duty_people")
    private String dutyPeople;

    /** 计划完成时间 */
    @Column(name = "plan_finish_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date planFinishDate;

    /** 计划说明 */
    @Column(name = "plan")
    private String plan;


}
