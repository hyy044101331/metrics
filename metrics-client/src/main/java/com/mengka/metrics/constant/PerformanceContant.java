package com.mengka.metrics.constant;

/**
 *
 * 》》性能：
 * 单词查询返回数据条数限制在5000条内，查询qps在50左右，所有查询平均响应时间200ms；
 *
 * @author mengka
 * @description
 * @data 2016/08/06.
 */
public class PerformanceContant {

    /**
     *  单个cube性能：
     *      共有8个维度，最大数据条数4亿，最大存储空间800G
     */
    private static final String P_CUBE = "p_cube";

    /**
     *  每秒请求个数： qps = 50个
     */
    private static final String P_QPS = "p_qps";

    /**
     *  每次查询平均响应时间： rt = 200ms（当QPS在200左右，平均响应时间在1s内）
     */
    private static final String P_RT = "p_rt";

}
