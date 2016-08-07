package com.mengka.metrics.model.enums;

/**
 *  ����OLAP
 *  online Analytical Processing Server����������������������һ�����ݿ����棩
 *
 *  ����olap�����ݲֿ����ҪӦ�ã�
 *  <ol>
 *      <li>֧�ָ��ӵķ���������</li>
 *      <li>���ؾ���֧�֣�</li>
 *      <li>�ṩֱ���׶��Ĳ�ѯ�����</li>
 *  </ol>
 *
 * @author mengka
 * @description
 * @data 2016/08/06.
 */
public enum OLAPEnum {

    ROLAP(1,"ROLAP","ʵʱ����"),
    MOLAP(2,"MOLAP","Ԥ����"),
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
