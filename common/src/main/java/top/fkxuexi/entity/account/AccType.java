package top.fkxuexi.entity.account;

import lombok.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 用户类型表
*/
@Builder
@ToString
public class AccType{

    /**
    * 用户类型主键
    */
    @Setter@Getter private Integer accTypeId;
    /**
    * 用户类型
    */
    @Setter@Getter private String accType;
    /**
    * 本金
    */
    @Setter@Getter private BigDecimal capital;
    /**
    * 手续费比例
    */
    @Setter@Getter private BigDecimal feeRation;
    /**
    * ag的保证金比例
    */
    @Setter@Getter private BigDecimal agBailRation;
    /**
    * au的保证金比例
    */
    @Setter@Getter private BigDecimal auBailRation;
    /**
    * mau的保证金比例
    */
    @Setter@Getter private BigDecimal mauBailRation;
    /**
    * ag的强平比例
    */
    @Setter@Getter private BigDecimal agForceClose;
    /**
    * au的强平比例
    */
    @Setter@Getter private BigDecimal auForceClose;
    /**
    * mau的强平比例
    */
    @Setter@Getter private BigDecimal mauForceClose;
    /**
    * au的递延费比例
    */
    @Setter@Getter private BigDecimal auDelayRation;
    /**
    * mau的递延费比例
    */
    @Setter@Getter private BigDecimal mauDelayRation;
    /**
    * ag的递延费比例
    */
    @Setter@Getter private BigDecimal agDelayRation;
    /**
    * 今日剩余资金比例
    */
    @Setter@Getter private BigDecimal todayRemainderRation;
    /**
    * 是否可以交易 0 为否，1 为真
    */
    @Setter@Getter private Integer canMarket;


}
