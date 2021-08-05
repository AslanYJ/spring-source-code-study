package com.spring.lyj.proxy;

import com.spring.lyj.annotaion.Select;

public interface TestDao {

	@Select("select * from test")
	void query();
}
