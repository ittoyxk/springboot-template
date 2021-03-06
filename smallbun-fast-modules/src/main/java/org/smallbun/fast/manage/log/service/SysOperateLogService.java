/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 ‭‭‭‭‭‭‭‭‭‭‭‭[smallbun] www.smallbun.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.smallbun.fast.manage.log.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.smallbun.fast.manage.log.entity.SysOperateLogEntity;
import org.smallbun.fast.manage.log.vo.SysOperateLogVO;
import org.smallbun.framework.base.BaseService;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 操作日志记录 服务类
 * </p>
 *
 * @author SanLi
 * @since 2019-02-15
 */
public interface SysOperateLogService extends BaseService<SysOperateLogEntity> {
	/**
	 * model
	 * @param request
	 * @return
	 */
	SysOperateLogVO model(HttpServletRequest request);

	/**
	 * 分页查询 
	 * @param page
	 * @param vo
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class)
	IPage<SysOperateLogEntity> page(IPage<SysOperateLogEntity> page, SysOperateLogVO vo);
}
