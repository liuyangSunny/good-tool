package com.github.liuyangSunny.good.tool.core.gps;

import cn.hutool.core.lang.Console;
import org.junit.Ignore;
import org.junit.Test;

/***
 * GpsUtil 单元测试
 *
 * @author liuyang
 * @date 2019/4/9 20:51
 */
public class GpsUtilTest {

    @Test
    public void test() {
        Gps gps = new Gps(38.46945, 106.30585);
        Console.log("gps: {}", gps);

        Gps gcj = GpsUtil.gps84_To_Gcj02(gps.getLatitude(), gps.getLongitude());
        Console.log("gps84_To_Gcj02: {}", gcj);

        Gps gps84 = GpsUtil.gcj_To_Gps84(gcj.getLatitude(), gcj.getLongitude());
        Console.log("gcj_To_Gps84: {}", gps84);

        Gps bd = GpsUtil.gcj02_To_Bd09(gcj.getLatitude(), gcj.getLongitude());
        Console.log("gcj02_To_Bd09: {}", bd);

        Gps bd2 = GpsUtil.gps84_To_bd09(gps.getLatitude(), gps.getLongitude());
        Console.log("gps84_To_bd09: {}", bd2);

        Gps gcj2 = GpsUtil.bd09_To_Gcj02(bd.getLatitude(), bd.getLongitude());
        Console.log("bd09_To_Gcj02: {}", gcj2);

        gps = GpsUtil.bd09_To_Gps84(bd.getLatitude(), bd.getLongitude());
        Console.log("bd09_To_Gps84: {}", gps);
    }
}
