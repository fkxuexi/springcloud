package top.fkxuexi.generator;

import top.fkxuexi.smartwork.config.GenerConfig;
import top.fkxuexi.smartwork.config.SmkConfig;

public class MyConfig extends SmkConfig{
    @Override
    public String getUrl() {
        return "jdbc:mysql://47.106.109.20:3306/trade?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
    }
    @Override
    public String getUser() {
        return "root";
    }

    @Override
    public String getPwd() {
        return "Iftk@414228";
    }

    @Override
    public String getCodeBasePath() {
        return "top.fkxuexi.entity.order";
    }

    @Override
    public String getXmlCodeLocation() {
        return "mappers";
    }

    @Override
    public GenerConfig[] getGenerConfig() {
        return new GenerConfig[]{
               /* controller,service,serviceImpl,dao,mapper,*/entity
        };
    }

    public MyConfig() {

    }
}
