package top.fkxuexi.entity.account;

import lombok.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 用户每日数据
*/
@Builder
@ToString
public class AccDailyData{

    /**
    * 用户每日数据记录id
    */
    @Setter@Getter private Integer accDailyDataId;
    /**
    * 用户id
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
    * 用户初始资金
    */
    @Setter@Getter private BigDecimal initCapitial;
    /**
    * 用户每日登陆次数
    */
    @Setter@Getter private Integer loginTimes;
    /**
    * 用户每日操作次数
    */
    @Setter@Getter private Integer operateTimes;
    /**
    * 用户每日可用资金
    */
    @Setter@Getter private BigDecimal capitalAvailable;
    /**
    * 今日交易量
    */
    @Setter@Getter private BigDecimal tradeMoney;
    /**
    * 创建时间
    */
    @Setter@Getter private Date createTime;


}
