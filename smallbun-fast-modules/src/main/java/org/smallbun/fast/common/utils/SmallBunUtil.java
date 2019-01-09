package org.smallbun.fast.common.utils;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Data;
import org.smallbun.fast.manage.dict.entity.SysDictValueEntity;
import org.smallbun.fast.manage.dict.service.SysDictValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 *字典工具
 * @author SanLi
 * Created by 2689170096@qq.com on 2018/12/13 20:58
 */
@Component(value = "smallbun")
public class SmallBunUtil {

	@Autowired
	public SmallBunUtil(SysDictValueService valueService) {
		this.valueService = valueService;
	}

	/**
	 * 根据类型编码获取字典
	 * @param typeCode typeCode
	 * @return
	 */
	public List<Dict> dict(String typeCode) {
		List<Dict> dictList = Lists.newArrayList();
		//根据类型获取编码获取字典值
		List<SysDictValueEntity> dictValue = valueService.findByTypeCode(typeCode);
		//类型不为空
		if (!CollectionUtils.isEmpty(dictValue)) {
			//循环set值
			for (SysDictValueEntity value : dictValue) {
				dictList.add(Dict.builder().dictLabel(value.getDictLabel()).dictValue(value.getDictValue())
						.typeCode(value.getSysDictType().getTypeCode()).typeName(value.getSysDictType().getTypeName())
						.build());
			}
		}
		return dictList;
	}

	/**
	 * 注入字典类型service接口
	 */
	private final SysDictValueService valueService;

}

/**
 * dict
 */
@Builder
@Data
class Dict {
	/**
	 * 类型编码
	 */
	private String typeCode;
	/**
	 * 类型名称
	 */
	private String typeName;
	/**
	 * 字典标签
	 */
	private String dictLabel;
	/**
	 * 字典值
	 */
	private String dictValue;
}