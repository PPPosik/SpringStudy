package com.example.aop.order.aop.member;

import com.example.aop.order.aop.member.annotation.ClassAop;
import com.example.aop.order.aop.member.annotation.MethodAop;
import org.springframework.stereotype.Component;

@ClassAop
@Component
public class MemberServiceImpl implements MemberService {

    @MethodAop("test value")
    @Override
    public String hello(String param) {
        return "ok";
    }

    public String internal(String param) {
        return "ok";
    }
}
