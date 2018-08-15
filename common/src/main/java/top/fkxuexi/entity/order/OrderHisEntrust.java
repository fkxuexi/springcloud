package top.fkxuexi.entity.order;

import lombok.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Date;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 历史委托单
*/
@Builder
@ToString
public class OrderHisEntrust{

    /**
    * 历史委托单id，这个必须和委托单id一致
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
    * 委托数量
    */
    @Setter@Getter private Integer quantity;
    /**
    * 委托价格
    */
    @Setter@Getter private BigDecimal entrustPrice;
    /**
    * 保证金比例
    */
    @Setter@Getter private BigDecimal entrustRation;
    /**
    * 如果未成交则是冻结的保证金
    */
    @Setter@Getter private BigDecimal entrustBail;
    /**
    * 委托时间
    */
    @Setter@Getter private Date entustDate;
    /**
    * 成交时间
    */
    @Setter@Getter private Date dealDate;
    /**
    * 委托单状态；1：未成交，2：成交，3：撤销，4：过期
    */
    @Setter@Getter private Integer status;


}
