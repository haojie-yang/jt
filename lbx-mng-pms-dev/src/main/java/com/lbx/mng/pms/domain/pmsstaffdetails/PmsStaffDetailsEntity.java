package com.lbx.mng.pms.domain.pmsstaffdetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:34
 */

@Data
@Entity
@Table(name = "pms_staff_details")
public class PmsStaffDetailsEntity {


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

    /** 人员id */
    @Column(name = "staff_id")
    private String staffId;

    /** 角色 */
    @Column(name = "role")
    private Integer role;

    /** 类型 */
    @Column(name = "type")
    private Integer type;

    /** 职位 */
    @Column(name = "position")
    private String position;

    /** 禅道账号 */
    @Column(name = "zentao_account")
    private String zentaoAccount;

    /** 联系电话 */
    @Column(name = "iphone")
    private String iphone;

    /** 入职时间 */
    @Column(name = "entry_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date entryTime;

    /** 离职时间 */
    @Column(name = "resignation_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date resignationTime;

    /** 其他联系方式 */
    @Column(name = "other_contact_way")
    private String otherContactWay;

    /** 公司名称 */
    @Column(name = "company_name")
    private String companyName;

    /** 备注说明 */
    @Column(name = "remark")
    private String remark;

    /** 挂靠部门 */
    @Column(name = "affiliated_department")
    private Integer affiliatedDepartment;


}
