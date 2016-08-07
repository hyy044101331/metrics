package com.mengka.metrics.model.enums;

/**
 *  》》OLAP
 *  online Analytical Processing Server，联机分析处理（可以理解成一个数据库引擎）
 *
 *  》》olap是数据仓库的主要应用：
 *  <ol>
 *      <li>支持复杂的分析操作；</li>
 *      <li>侧重决策支持；</li>
 *      <li>提供直观易懂的查询结果；</li>
 *  </ol>
 *
 * @author mengka
 * @description
 * @data 2016/08/06.
 */
public enum OLAPEnum {

    ROLAP(1,"ROLAP","实时计算"),
    MOLAP(2,"MOLAP","预计算"),
    HOLAP(3,"HOLAP","Streaming OLAP");

    private Integer type;

    private String code;

    private String desc;

    OLAPEnum(Integer type,String code,String desc){
        this.type = type;
        this.code = code;
        this.desc = desc;
    }

    private static OLAPEnum valueOfType(int type){
        for(OLAPEnum olapEnum:values()){
            if(olapEnum.getType()==type){
                return olapEnum;
            }
        }
        throw null;
    }

    public Integer getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
