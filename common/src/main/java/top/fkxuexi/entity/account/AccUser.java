package top.fkxuexi.entity.account;

import lombok.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 用户表
*/
@Builder
@ToString
public class AccUser{

    /**
    * 用户主键
    */
    @Setter@Getter private Integer accUserId;
    /**
    * 用户昵称
    */
    @Setter@Getter private String nikeName;
    /**
    * 这个字段暂时可以为空，如果用户是以游客身份来访的话
    */
    @Setter@Getter private String phone;
    /**
    * 这个字段和pwd可以作为选用字段，pc、web、wx都可以作为登录选项
    */
    @Setter@Getter private String openId;
    /**
    * 密码，open_id和pwd必须有一个不为空
    */
    @Setter@Getter private String pwd;
    /**
    * 状态；1：正常客户，2：禁用客户，3：访客
    */
    @Setter@Getter private Integer status;
    /**
    * 是否可交易；1：可交易，2不可交易
    */
    @Setter@Getter private Integer canMarket;
    /**
    * 用户类型
    */
    @Setter@Getter private Integer accTypeId;
    /**
    * 邀请人id
    */
    @Setter@Getter private Integer invitedId;
    /**
    * 用户初始资金
    */
    @Setter@Getter private BigDecimal initCapital;
    /**
    * 用户可用资金
    */
    @Setter@Getter private BigDecimal effCapital;
    /**
    * 今日可用
    */
    @Setter@Getter private BigDecimal todayAvailable;


}
