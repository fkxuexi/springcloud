package top.fkxuexi.entity.account;

import lombok.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 用户每日资金变动
*/
@Builder
@ToString
public class AccDailyAccount{

    /**
    * 资金流水记录id
    */
    @Setter@Getter private Integer accAccountFlowId;
    /**
    * 资金变动用户id
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
    * 变动之前的资金
    */
    @Setter@Getter private BigDecimal beforeAccount;
    /**
    * 变动之后的资金
    */
    @Setter@Getter private BigDecimal afterAccount;
    /**
    * 变动的资金
    */
    @Setter@Getter private BigDecimal consumeMoney;
    /**
    * 消费的类型，具体的内容见字典表
    */
    @Setter@Getter private String consumeType;
    /**
    * 资金变动的时间
    */
    @Setter@Getter private Date createDate;


}
