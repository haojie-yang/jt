package com.lbx.mng.pms.domain.pmsserverdeploy;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 映射实体类
 * @author code generator
 * @date 2020-05-13 14:02:33
 */

@Data
@Entity
@Table(name = "pms_server_deploy")
public class PmsServerDeployEntity {


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

    /** 服务器id */
    @Column(name = "server_id")
    private String serverId;

    /** 业务或服务标题 */
    @Column(name = "title")
    private String title;

    /** 部署路径及说明 */
    @Column(name = "deploy_path_explain")
    private String deployPathExplain;

    /** 启动脚本及说明 */
    @Column(name = "start_script_explain")
    private String startScriptExplain;

    /** 停止脚本及说明 */
    @Column(name = "stop_script_explain")
    private String stopScriptExplain;

    /** 其他说明 */
    @Column(name = "other_explain")
    private String otherExplain;


}
