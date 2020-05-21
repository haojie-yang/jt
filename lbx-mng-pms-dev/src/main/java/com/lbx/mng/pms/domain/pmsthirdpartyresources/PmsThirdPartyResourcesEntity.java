package com.lbx.mng.pms.domain.pmsthirdpartyresources;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:35
 */

@Data
@Entity
@Table(name = "pms_third_party_resources")
public class PmsThirdPartyResourcesEntity {


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

    /** 人员id */
    @Column(name = "people_code")
    private String peopleCode;

    /** 人员姓名 */
    @Column(name = "people_name")
    private String peopleName;

    /** 联系电话 */
    @Column(name = "phone")
    private String phone;

    /** 人员职位 */
    @Column(name = "people_post")
    private String peoplePost;

    /** 合作开始时间 */
    @Column(name = "cooperation_start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cooperationStartDate;

    /** 合作结束时间 */
    @Column(name = "cooperation_over_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cooperationOverDate;

    /** 其他联系方式 */
    @Column(name = "other_contact_way")
    private String otherContactWay;

    /** 第三方厂家名称 */
    @Column(name = "third_party_manufacturer_name")
    private String thirdPartyManufacturerName;

    /** 备注说明 */
    @Column(name = "remark")
    private String remark;


}
