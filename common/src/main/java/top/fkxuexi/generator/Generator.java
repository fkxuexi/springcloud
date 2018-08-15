package top.fkxuexi.generator;

import freemarker.template.TemplateException;
import top.fkxuexi.smartwork.CodeGener;
import top.fkxuexi.smartwork.config.SmkConfig;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Generator {


    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, TemplateException {
        SmkConfig cfg = new MyConfig();
        CodeGener gen = new CodeGener(cfg);
        List<String> allTables = gen.getAllTables();
        String[] s = new String[]{};
        s = allTables.toArray(s);
        gen.generTables(s);
    }
}
