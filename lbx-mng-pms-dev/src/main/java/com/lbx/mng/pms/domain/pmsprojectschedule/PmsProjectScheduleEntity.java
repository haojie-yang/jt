package com.lbx.mng.pms.domain.pmsprojectschedule;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:31
 */

@Data
@Entity
@Table(name = "pms_project_schedule")
public class PmsProjectScheduleEntity {


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

    /** 项目CODE */
    @Column(name = "project_code")
    private String projectCode;

    /** 项目名称 */
    @Column(name = "project_name")
    private String projectName;

    /** 工作项 */
    @Column(name = "work")
    private Integer work;

    /** 计划开始时间 */
    @Column(name = "scheduled_start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date scheduledStartDate;

    /** 计划完成时间 */
    @Column(name = "scheduled_finish_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date scheduledFinishDate;

    /** 实际开始时间 */
    @Column(name = "actual_start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date actualStartDate;

    /** 实际完成时间 */
    @Column(name = "actual_finish_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date actualFinishDate;

    /** 进度 */
    @Column(name = "schedule")
    private Integer schedule;

    /** 备注 */
    @Column(name = "remark")
    private String remark;


}
