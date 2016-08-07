package com.mengka.metrics.model.enums;

/**
 *  OLAP支持的数据源类型
 *
 * @author mengka
 * @description
 * @data 2016/08/06.
 */
public enum DataSourceEnum {

    S_JDBC(1,"",""),
    S_HBASE(2,"","HBase"),
    S_HIVE(3,"","hive"),
    S_IMPALA(4,"","impala"),
    S_HADOOP(5,"","hadoop"),
    S_KAFKA(6,"","kafka"),
    S_SPARK(7,"","spark"),
    S_CASSANDRA(8,"","cassandra");

    private Integer type;

    private String driver;

    private String desc;

    DataSourceEnum(Integer type,String driver,String desc){
        this.type = type;
        this.driver = driver;
        this.desc = desc;
    }

    private static DataSourceEnum valueOfType(int type){
        for(DataSourceEnum dataSourceEnum:values()){
            if(dataSourceEnum.getType()==type){
                return dataSourceEnum;
            }
        }
        throw null;
    }

    public Integer getType() {
        return type;
    }

    public String getDriver() {
        return driver;
    }

    public String getDesc() {
        return desc;
    }
}
