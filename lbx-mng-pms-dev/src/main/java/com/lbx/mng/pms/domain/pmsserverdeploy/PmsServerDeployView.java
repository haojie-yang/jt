package com.lbx.mng.pms.domain.pmsserverdeploy;

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
 * @date 2020-05-13 14:02:33
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class PmsServerDeployView extends BaseView {

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
