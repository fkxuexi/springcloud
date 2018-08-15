package top.fkxuexi.entity.order;

import lombok.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 清算单
*/
@Builder
@ToString
public class OrderConsume{

    /**
    * 清算记录id
    */
    @Setter@Getter private Integer orderConsumeId;
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
    * 保证金变动
    */
    @Setter@Getter private BigDecimal bailChange;
    /**
    * 递延费
    */
    @Setter@Getter private BigDecimal delayFee;
    /**
    * 盈亏
    */
    @Setter@Getter private BigDecimal profit;
    /**
    * 总价值
    */
    @Setter@Getter private BigDecimal totalAvailable;
    /**
    * 总计（递延费+盈亏+保证金变动）
    */
    @Setter@Getter private BigDecimal total;
    /**
    * 清算日期
    */
    @Setter@Getter private Date consumeDate;


}
