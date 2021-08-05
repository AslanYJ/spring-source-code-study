package com.spring.lyj;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"com.spring.lyj","com.spring.lyj.proxy"})
public class LyjConfig {
}
