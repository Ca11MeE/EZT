package cn.ezt.service.impl;

import org.springframework.stereotype.Service;

import cn.ezt.service.AgreementService;

@Service
public class AgreementServiceImpl implements AgreementService {

	@Override
	public String getAgreement(String string) {
		/*
		 * 产生分歧：
		 * 1.用数据库形式存储协议
		 * 	优点：
		 * 		修改方便，通过管理员页面拥有一定权限可以修改
		 * 		安全性较高
		 * 		无需设置路径
		 * 	缺点：
		 * 		占用一个数据库连接
		 * 		读取数据略大
		 * 		下载协议需要用到系统流写成文件，再传输
		 * 2.用本地文件形式存储协议
		 * 	优点：
		 * 		不占用数据库链接，改用IO方式读取
		 * 		支持下载协议，过程简单
		 * 		设定路径用配置文件设置
		 * 	缺点：
		 * 		修改协议麻烦，需最终定型协议才能上线项目
		 * 		读取过多会造成服务器负担过重
		 * 		
		 * 
		 * 暂行解决方案：页面读取利用数据库，文件下载利用本地文件形式，管理员页面修改先修改数据库数据（快速，可回滚），再修改本地文件（不占用数据库连接，不影响用户页面的读取）
		 */
		return null;
	}

}
