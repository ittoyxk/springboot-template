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

package org.smallbun.framework.constant;

/**
 * 操作日志常量
 * @author SanLi
 * Created by 2689170096@qq.com on 2019/2/15 22:33
 */
public interface OperateLogActionConstant {
	/**
	 * 新增
	 */
	String ADD = "0";
	/**
	 * 修改
	 */
	String UPDATE = "1";
	/**
	 * 添加或修改
	 */
	String ADD_UPDATE = "2";
	/**
	 * 删除
	 */
	String DEL = "3";
	/**
	 * 添加form
	 */
	String ADD_FORM = "4";
	/**
	 * 修改form
	 */
	String UPDATE_FORM = "5";
	/**
	 * form 添加修改
	 */
	String ADD_UPDATE_FORM = "6";
	/**
	 * 查询list
	 */
	String SELECT_LIST = "7";

	/**
	 * 查询PAGE
	 */
	String SELECT_PAGE = "8";
}
