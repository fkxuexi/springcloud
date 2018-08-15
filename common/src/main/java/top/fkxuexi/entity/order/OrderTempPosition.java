package top.fkxuexi.entity.order;

import lombok.*;
import java.math.BigDecimal;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 临时仓位表
*/
@Builder
@ToString
public class OrderTempPosition{

    /**
    * 用户id，因为临时持仓表一个人只有一条记，所以使用用户id作为主键
    */
    @Setter@Getter private Integer accUserId;
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
    * 开仓均价（开仓时的原始的价格）
    */
    @Setter@Getter private BigDecimal avgPrice;
    /**
    * 冻结仓位数量
    */
    @Setter@Getter private Integer frozenQuantity;


}
