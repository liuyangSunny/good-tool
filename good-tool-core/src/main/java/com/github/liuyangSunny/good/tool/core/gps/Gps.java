package com.github.liuyangSunny.good.tool.core.gps;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * GPS 经纬度信息封装
 *
 * @author liuyang
 * @date 2019/4/9 20:33
 */
@Data
@AllArgsConstructor
public class Gps {

    private double latitude;
    private double longitude;
}


