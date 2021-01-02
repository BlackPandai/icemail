package com.blackpanda.icemall.member.feign;

import com.blackpanda.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BlackPanda
 * @date 2020/12/25
 */
@FeignClient("icemall-coupon")
@Service
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
