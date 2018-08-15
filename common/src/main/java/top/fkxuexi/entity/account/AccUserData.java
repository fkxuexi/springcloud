package top.fkxuexi.entity.account;

import lombok.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Date;

/**
* @Author blog.fkxuexi.top
* @Gitee: https://gitee.com/smartwork/
* @Descri: 用户数据表
*/
@Builder
@ToString
public class AccUserData{

    /**
    * 用户数据表id
    */
    @Setter@Getter private Integer accUserDataId;
    /**
    * 用户id
    */
    @Setter@Getter private Integer accUserId;
    /**
    * 用户盈利率
    */
    @Setter@Getter private BigDecimal profitAbility;
    /**
    * 上月可以资金
    */
    @Setter@Getter private BigDecimal lastMonthCapital;
    /**
    * 上月盈利率
    */
    @Setter@Getter private BigDecimal lastMontyAbility;
    /**
    * 用户总积分
    */
    @Setter@Getter private Integer totalScore;
    /**
    * 用户有效积分
    */
    @Setter@Getter private Integer effScore;
    /**
    * 用户的省份
    */
    @Setter@Getter private String province;
    /**
    * 用户的城市
    */
    @Setter@Getter private String city;
    /**
    * 用户注册时间
    */
    @Setter@Getter private Date regDate;
    /**
    * 用户最后操作时间
    */
    @Setter@Getter private Date lastOperate;
    /**
    * 是否认证，针对需要认证的分析师、银行客户
    */
    @Setter@Getter private Integer isAuth;
    /**
    * 用户简介
    */
    @Setter@Getter private String brief;
    /**
    * 用户职位，这个具体的内容将会在字典中显示
    */
    @Setter@Getter private String position;
    /**
    * 用户的风格，这个具体的内容将会在字典中展示
    */
    @Setter@Getter private String style;
    /**
    * 银行名称
    */
    @Setter@Getter private String bankName;
    /**
    * 一级银行
    */
    @Setter@Getter private String firstBank;
    /**
    * 二级银行
    */
    @Setter@Getter private String secondBank;


}
