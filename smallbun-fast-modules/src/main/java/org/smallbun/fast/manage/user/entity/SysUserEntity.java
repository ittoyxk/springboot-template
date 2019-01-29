/*
 *
 *  * Copyright(c)[2018] [smallbun] www.smallbun.org
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.smallbun.fast.manage.user.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.smallbun.fast.common.entity.DataEntity;
import org.smallbun.fast.manage.org.entity.SysOrgEntity;
import org.smallbun.fast.manage.role.entity.SysRoleEntity;
import org.smallbun.fast.manage.role.vo.SysRoleVO;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static com.baomidou.mybatisplus.annotation.FieldStrategy.NOT_EMPTY;

/**
 * 用户实体类
 *
 * @author SanLi
 * Created by 2689170096@qq.com on 2018/4/30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName(value = "sys_user")
public class SysUserEntity extends DataEntity<Long> {
	/**
	 * 姓名
	 */
	private String fullName;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	@JSONField(serialize = false)
	private String password;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 头像地址
	 */
	private String headPortraitUrl;
	/**
	 * 手机号
	 */
	@TableField(strategy = NOT_EMPTY)
	private String phone;
	/**
	 * 电话
	 */
	@TableField(strategy = NOT_EMPTY)
	private String telephone;
	/**
	 * 邮箱
	 */
	@TableField(strategy = NOT_EMPTY)
	private String email;
	/**
	 * 生日
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 二维码
	 */
	private String qrCode;
	/**
	 * 最后登陆时间
	 */
	private Timestamp lastLoginTime;
	/**
	 * 上次登录ip
	 */
	private String lastLoginIp;
	/**
	 * 上次登录地址
	 */
	private String lastLoginAddress;
	/**
	 * 用户状态
	 */
	private String userStatus;
	/**
	 * 用户类型
	 */
	private String userType;
	/**
	 * 工号
	 */
	private String jobNumber;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 用户角色集合
	 */
	@TableField(exist = false)
	private List<SysRoleEntity> roleList = Lists.newArrayList();
	/**
	 * 角色vo集合
	 */
	@TableField(exist = false)
	private List<SysRoleVO> roleVOS = Lists.newArrayList();
	/**
	 * 所属部门
	 */
	private String orgId;
	/**
	 * 所属部门
	 */
	@TableField(exist = false)
	private SysOrgEntity org;
	/**
	 * 归属公司
	 */
	@TableField(exist = false)
	private SysOrgEntity company;
}
