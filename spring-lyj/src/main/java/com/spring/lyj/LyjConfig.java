package com.spring.lyj;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


// @Configuration 是最先解析的
@Configuration
@ComponentScan({"com.spring.lyj","com.spring.lyj.proxy","com.spring.lyj.service"})
public class LyjConfig {
}
