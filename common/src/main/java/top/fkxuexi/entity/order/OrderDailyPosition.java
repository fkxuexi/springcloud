package top.fkxuexi.entity.order;

import lombok.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 用户每日持仓表
*/
@Builder
@ToString
public class OrderDailyPosition{

    /**
    * 用户每日持仓id
    */
    @Setter@Getter private Integer orderDailyPositionId;
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
    * 用户手机号码
    */
    @Setter@Getter private String phone;
    /**
    * 用户可用资金
    */
    @Setter@Getter private BigDecimal capacityAvailable;
    /**
    * 用户现在的可用资金+用户的仓位价值（以清算价格计算）
   +清算递延费+清算盈亏+清算保证金变动
    */
    @Setter@Getter private BigDecimal totalValue;
    /**
    * ag多单
    */
    @Setter@Getter private Integer agMulti;
    /**
    * ag多单开仓均价
    */
    @Setter@Getter private BigDecimal agMultiAvg;
    /**
    * ag空单
    */
    @Setter@Getter private Integer agEmpty;
    /**
    * ag空单开仓均价
    */
    @Setter@Getter private BigDecimal agEmptyAvg;
    /**
    * mau多单
    */
    @Setter@Getter private Integer mauMulti;
    /**
    * mau多单均价
    */
    @Setter@Getter private BigDecimal mauMultiAvg;
    /**
    * mau空单
    */
    @Setter@Getter private Integer mauEmpty;
    /**
    * mau空单均价
    */
    @Setter@Getter private BigDecimal mauEmptyAvg;
    /**
    * au多单
    */
    @Setter@Getter private Integer auMulti;
    /**
    * au多单均价
    */
    @Setter@Getter private BigDecimal auMultiAvg;
    /**
    * au空单
    */
    @Setter@Getter private Integer auEmpty;
    /**
    * au空单均价
    */
    @Setter@Getter private BigDecimal auEmptyAvg;
    /**
    * 持仓日期
    */
    @Setter@Getter private Date createDate;


}
