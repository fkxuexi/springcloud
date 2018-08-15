package top.fkxuexi.entity.order;

import lombok.*;
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
* @Descri: 历史成交单
*/
@Builder
@ToString
public class OrderHisDeal{

    /**
    * 历史成交单id，这个必须和成交的id一致
    */
    @Setter@Getter private Integer orderDealId;
    /**
    * 委托单id
    */
    @Setter@Getter private Integer orderEntrustId;
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
    * 品种
    */
    @Setter@Getter private Integer orderVariety;
    /**
    * 方向
    */
    @Setter@Getter private Integer direction;
    /**
    * 数量
    */
    @Setter@Getter private Integer quantity;
    /**
    * 有效数量
    */
    @Setter@Getter private Integer effQuantity;
    /**
    * 手续费
    */
    @Setter@Getter private BigDecimal fee;
    /**
    * 成交价格
    */
    @Setter@Getter private BigDecimal dealPrice;
    /**
    * 成交金额
    */
    @Setter@Getter private BigDecimal dealMoney;
    /**
    * 结算价
    */
    @Setter@Getter private BigDecimal calculPrice;
    /**
    * 成交保证金
    */
    @Setter@Getter private BigDecimal dealBail;
    /**
    * 保证金比例
    */
    @Setter@Getter private BigDecimal dealRation;
    /**
    * 是否被清算过，1：清算过，2：没有清算过
    */
    @Setter@Getter private Integer isCalcul;
    /**
    * 平仓对应的盈利
    */
    @Setter@Getter private BigDecimal profit;
    /**
    * 成交时间
    */
    @Setter@Getter private Date dealDate;
    /**
    * 单的类型；1：正常单，2：强平单
    */
    @Setter@Getter private Integer orderType;


}
