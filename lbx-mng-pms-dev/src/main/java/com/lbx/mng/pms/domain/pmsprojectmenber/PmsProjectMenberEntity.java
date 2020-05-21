package com.lbx.mng.pms.domain.pmsprojectmenber;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:30
 */

@Data
@Entity
@Table(name = "pms_project_menber")
public class PmsProjectMenberEntity {


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

    /** 用户ID */
    @Column(name = "user_id")
    private String userId;

    /** 用户姓名 */
    @Column(name = "user_name")
    private String userName;

    /** 进入项目日期 */
    @Column(name = "start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startDate;

    /** 离开项目日期 */
    @Column(name = "end_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endDate;

    /** 参与项目评价 */
    @Column(name = "rated")
    private String rated;


}
