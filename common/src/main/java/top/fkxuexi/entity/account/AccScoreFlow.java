package top.fkxuexi.entity.account;

import lombok.*;
import java.util.Date;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 用户积分流水表
*/
@Builder
@ToString
public class AccScoreFlow{

    /**
    * 用户积分流水表
    */
    @Setter@Getter private Integer accScoreFlowId;
    /**
    * 积分变动用户id
    */
    @Setter@Getter private Integer accUserId;
    /**
    * 用户昵称
    */
    @Setter@Getter private String nikeName;
    /**
    * 用户类型
    */
    @Setter@Getter private Integer accTypeId;
    /**
    * 这个字段暂时可以为空，如果用户是以游客身份来访的话
    */
    @Setter@Getter private String phone;
    /**
    * 积分变动类型，具体见字典表
    */
    @Setter@Getter private String scoreType;
    /**
    * 变动的积分
    */
    @Setter@Getter private Integer changeScore;
    /**
    * 变动后的积分
    */
    @Setter@Getter private Integer afterScore;
    /**
    * 变动前的积分
    */
    @Setter@Getter private Integer beforeScore;
    /**
    * 积分变动时间
    */
    @Setter@Getter private Date createTime;


}
