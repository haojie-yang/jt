package com.lbx.mng.pms.domain.pmsprojectmenber;

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
 * @date 2020-05-13 14:02:30
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class PmsProjectMenberView extends BaseView {

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

    /** 用户ID */
    @JsonProperty("user_id")
    private String userId;

    /** 用户姓名 */
    @JsonProperty("user_name")
    private String userName;

    /** 进入项目日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("start_date")
    private Date startDate;

    /** 离开项目日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("end_date")
    private Date endDate;

    /** 参与项目评价 */
    private String rated;


}
