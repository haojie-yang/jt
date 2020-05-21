package com.lbx.mng.pms.domain.pmsserverdeploy;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表单实体类
 * @author code generator
 * @date 2020-05-13 14:02:33
 */

@Data
public class PmsServerDeployForm{

    /** ID */
    private String id;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("creation_date")
    private Date creationDate;

    /** 创建人id */
    @JsonProperty("creation_id")
    private String creationId;

    /** 创建人 */
    @JsonProperty("creation_user")
    private String creationUser;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty("modification_date")
    private Date modificationDate;

    /** 修改人id */
    @JsonProperty("modification_id")
    private String modificationId;

    /** 修改人 */
    @JsonProperty("modification_user")
    private String modificationUser;

    /** 删除标记 */
    private Integer status;

    /** 服务器id */
    @JsonProperty("server_id")
    private String serverId;

    /** 业务或服务标题 */
    private String title;

    /** 部署路径及说明 */
    @JsonProperty("deploy_pathexplain")
    private String deployPathExplain;

    /** 启动脚本及说明 */
    @JsonProperty("start_scriptexplain")
    private String startScriptExplain;

    /** 停止脚本及说明 */
    @JsonProperty("stop_scriptexplain")
    private String stopScriptExplain;

    /** 其他说明 */
    @JsonProperty("other_explain")
    private String otherExplain;


}
