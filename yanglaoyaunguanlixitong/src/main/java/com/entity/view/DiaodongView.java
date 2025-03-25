package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DiaodongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 调动申请
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("diaodong")
public class DiaodongView extends DiaodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 报名状态的值
	*/
	@ColumnInfo(comment="报名状态的字典表值",type="varchar(200)")
	private String diaodongYesnoValue;

	//级联表 床位
							/**
		* 床位名称
		*/

		@ColumnInfo(comment="床位名称",type="varchar(200)")
		private String chuangweiName;
		/**
		* 床位编号
		*/

		@ColumnInfo(comment="床位编号",type="varchar(200)")
		private String chuangweiUuidNumber;
		/**
		* 床位照片
		*/

		@ColumnInfo(comment="床位照片",type="varchar(200)")
		private String chuangweiPhoto;
		/**
		* 床位地点
		*/

		@ColumnInfo(comment="床位地点",type="varchar(200)")
		private String chuangweiAddress;
		/**
		* 床位类型
		*/
		@ColumnInfo(comment="床位类型",type="int(11)")
		private Integer chuangweiTypes;
			/**
			* 床位类型的值
			*/
			@ColumnInfo(comment="床位类型的字典表值",type="varchar(200)")
			private String chuangweiValue;
		/**
		* 床位介绍
		*/

		@ColumnInfo(comment="床位介绍",type="longtext")
		private String chuangweiContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer chuangweiDelete;
	//级联表 家属
		/**
		* 家属编号
		*/

		@ColumnInfo(comment="家属编号",type="varchar(200)")
		private String jiashuUuidNumber;
		/**
		* 家属姓名
		*/

		@ColumnInfo(comment="家属姓名",type="varchar(200)")
		private String jiashuName;
		/**
		* 家属手机号
		*/

		@ColumnInfo(comment="家属手机号",type="varchar(200)")
		private String jiashuPhone;
		/**
		* 家属身份证号
		*/

		@ColumnInfo(comment="家属身份证号",type="varchar(200)")
		private String jiashuIdNumber;
		/**
		* 家属头像
		*/

		@ColumnInfo(comment="家属头像",type="varchar(200)")
		private String jiashuPhoto;
		/**
		* 家属邮箱
		*/

		@ColumnInfo(comment="家属邮箱",type="varchar(200)")
		private String jiashuEmail;
	//级联表 老人
					 
		/**
		* 老人 的 护工
		*/
		@ColumnInfo(comment="护工",type="int(11)")
		private Integer laorenYonghuId;
										 
		/**
		* 老人 的 家属
		*/
		@ColumnInfo(comment="家属",type="int(11)")
		private Integer laorenJiashuId;
		/**
		* 看护人姓名
		*/

		@ColumnInfo(comment="看护人姓名",type="varchar(200)")
		private String kanhurenName;
		/**
		* 看护人联系方式
		*/

		@ColumnInfo(comment="看护人联系方式",type="varchar(200)")
		private String kanhurenPhone;
		/**
		* 老人姓名
		*/

		@ColumnInfo(comment="老人姓名",type="varchar(200)")
		private String laorenName;
		/**
		* 老人手机号
		*/

		@ColumnInfo(comment="老人手机号",type="varchar(200)")
		private String laorenPhone;
		/**
		* 老人身份证号
		*/

		@ColumnInfo(comment="老人身份证号",type="varchar(200)")
		private String laorenIdNumber;
		/**
		* 年龄
		*/

		@ColumnInfo(comment="年龄",type="int(11)")
		private Integer age;
		/**
		* 老人照片
		*/

		@ColumnInfo(comment="老人照片",type="varchar(200)")
		private String laorenPhoto;
		/**
		* 老人描述
		*/

		@ColumnInfo(comment="老人描述",type="text")
		private String laorenContent;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public DiaodongView() {

	}

	public DiaodongView(DiaodongEntity diaodongEntity) {
		try {
			BeanUtils.copyProperties(this, diaodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 报名状态的值
	*/
	public String getDiaodongYesnoValue() {
		return diaodongYesnoValue;
	}
	/**
	* 设置： 报名状态的值
	*/
	public void setDiaodongYesnoValue(String diaodongYesnoValue) {
		this.diaodongYesnoValue = diaodongYesnoValue;
	}


	//级联表的get和set 床位

		/**
		* 获取： 床位名称
		*/
		public String getChuangweiName() {
			return chuangweiName;
		}
		/**
		* 设置： 床位名称
		*/
		public void setChuangweiName(String chuangweiName) {
			this.chuangweiName = chuangweiName;
		}

		/**
		* 获取： 床位编号
		*/
		public String getChuangweiUuidNumber() {
			return chuangweiUuidNumber;
		}
		/**
		* 设置： 床位编号
		*/
		public void setChuangweiUuidNumber(String chuangweiUuidNumber) {
			this.chuangweiUuidNumber = chuangweiUuidNumber;
		}

		/**
		* 获取： 床位照片
		*/
		public String getChuangweiPhoto() {
			return chuangweiPhoto;
		}
		/**
		* 设置： 床位照片
		*/
		public void setChuangweiPhoto(String chuangweiPhoto) {
			this.chuangweiPhoto = chuangweiPhoto;
		}

		/**
		* 获取： 床位地点
		*/
		public String getChuangweiAddress() {
			return chuangweiAddress;
		}
		/**
		* 设置： 床位地点
		*/
		public void setChuangweiAddress(String chuangweiAddress) {
			this.chuangweiAddress = chuangweiAddress;
		}
		/**
		* 获取： 床位类型
		*/
		public Integer getChuangweiTypes() {
			return chuangweiTypes;
		}
		/**
		* 设置： 床位类型
		*/
		public void setChuangweiTypes(Integer chuangweiTypes) {
			this.chuangweiTypes = chuangweiTypes;
		}


			/**
			* 获取： 床位类型的值
			*/
			public String getChuangweiValue() {
				return chuangweiValue;
			}
			/**
			* 设置： 床位类型的值
			*/
			public void setChuangweiValue(String chuangweiValue) {
				this.chuangweiValue = chuangweiValue;
			}

		/**
		* 获取： 床位介绍
		*/
		public String getChuangweiContent() {
			return chuangweiContent;
		}
		/**
		* 设置： 床位介绍
		*/
		public void setChuangweiContent(String chuangweiContent) {
			this.chuangweiContent = chuangweiContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getChuangweiDelete() {
			return chuangweiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setChuangweiDelete(Integer chuangweiDelete) {
			this.chuangweiDelete = chuangweiDelete;
		}
	//级联表的get和set 家属

		/**
		* 获取： 家属编号
		*/
		public String getJiashuUuidNumber() {
			return jiashuUuidNumber;
		}
		/**
		* 设置： 家属编号
		*/
		public void setJiashuUuidNumber(String jiashuUuidNumber) {
			this.jiashuUuidNumber = jiashuUuidNumber;
		}

		/**
		* 获取： 家属姓名
		*/
		public String getJiashuName() {
			return jiashuName;
		}
		/**
		* 设置： 家属姓名
		*/
		public void setJiashuName(String jiashuName) {
			this.jiashuName = jiashuName;
		}

		/**
		* 获取： 家属手机号
		*/
		public String getJiashuPhone() {
			return jiashuPhone;
		}
		/**
		* 设置： 家属手机号
		*/
		public void setJiashuPhone(String jiashuPhone) {
			this.jiashuPhone = jiashuPhone;
		}

		/**
		* 获取： 家属身份证号
		*/
		public String getJiashuIdNumber() {
			return jiashuIdNumber;
		}
		/**
		* 设置： 家属身份证号
		*/
		public void setJiashuIdNumber(String jiashuIdNumber) {
			this.jiashuIdNumber = jiashuIdNumber;
		}

		/**
		* 获取： 家属头像
		*/
		public String getJiashuPhoto() {
			return jiashuPhoto;
		}
		/**
		* 设置： 家属头像
		*/
		public void setJiashuPhoto(String jiashuPhoto) {
			this.jiashuPhoto = jiashuPhoto;
		}

		/**
		* 获取： 家属邮箱
		*/
		public String getJiashuEmail() {
			return jiashuEmail;
		}
		/**
		* 设置： 家属邮箱
		*/
		public void setJiashuEmail(String jiashuEmail) {
			this.jiashuEmail = jiashuEmail;
		}
	//级联表的get和set 老人
		/**
		* 获取：老人 的 护工
		*/
		public Integer getLaorenYonghuId() {
			return laorenYonghuId;
		}
		/**
		* 设置：老人 的 护工
		*/
		public void setLaorenYonghuId(Integer laorenYonghuId) {
			this.laorenYonghuId = laorenYonghuId;
		}
		/**
		* 获取：老人 的 家属
		*/
		public Integer getLaorenJiashuId() {
			return laorenJiashuId;
		}
		/**
		* 设置：老人 的 家属
		*/
		public void setLaorenJiashuId(Integer laorenJiashuId) {
			this.laorenJiashuId = laorenJiashuId;
		}

		/**
		* 获取： 看护人姓名
		*/
		public String getKanhurenName() {
			return kanhurenName;
		}
		/**
		* 设置： 看护人姓名
		*/
		public void setKanhurenName(String kanhurenName) {
			this.kanhurenName = kanhurenName;
		}

		/**
		* 获取： 看护人联系方式
		*/
		public String getKanhurenPhone() {
			return kanhurenPhone;
		}
		/**
		* 设置： 看护人联系方式
		*/
		public void setKanhurenPhone(String kanhurenPhone) {
			this.kanhurenPhone = kanhurenPhone;
		}

		/**
		* 获取： 老人姓名
		*/
		public String getLaorenName() {
			return laorenName;
		}
		/**
		* 设置： 老人姓名
		*/
		public void setLaorenName(String laorenName) {
			this.laorenName = laorenName;
		}

		/**
		* 获取： 老人手机号
		*/
		public String getLaorenPhone() {
			return laorenPhone;
		}
		/**
		* 设置： 老人手机号
		*/
		public void setLaorenPhone(String laorenPhone) {
			this.laorenPhone = laorenPhone;
		}

		/**
		* 获取： 老人身份证号
		*/
		public String getLaorenIdNumber() {
			return laorenIdNumber;
		}
		/**
		* 设置： 老人身份证号
		*/
		public void setLaorenIdNumber(String laorenIdNumber) {
			this.laorenIdNumber = laorenIdNumber;
		}

		/**
		* 获取： 年龄
		*/
		public Integer getAge() {
			return age;
		}
		/**
		* 设置： 年龄
		*/
		public void setAge(Integer age) {
			this.age = age;
		}

		/**
		* 获取： 老人照片
		*/
		public String getLaorenPhoto() {
			return laorenPhoto;
		}
		/**
		* 设置： 老人照片
		*/
		public void setLaorenPhoto(String laorenPhoto) {
			this.laorenPhoto = laorenPhoto;
		}

		/**
		* 获取： 老人描述
		*/
		public String getLaorenContent() {
			return laorenContent;
		}
		/**
		* 设置： 老人描述
		*/
		public void setLaorenContent(String laorenContent) {
			this.laorenContent = laorenContent;
		}

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getSexTypes() {
			return sexTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
			}
				public String getSexValue() {
				return sexValue;
				}
				public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
				}

	@Override
	public String toString() {
		return "DiaodongView{" +
			", diaodongYesnoValue=" + diaodongYesnoValue +
			", jiashuUuidNumber=" + jiashuUuidNumber +
			", jiashuName=" + jiashuName +
			", jiashuPhone=" + jiashuPhone +
			", jiashuIdNumber=" + jiashuIdNumber +
			", jiashuPhoto=" + jiashuPhoto +
			", jiashuEmail=" + jiashuEmail +
			", kanhurenName=" + kanhurenName +
			", kanhurenPhone=" + kanhurenPhone +
			", laorenName=" + laorenName +
			", laorenPhone=" + laorenPhone +
			", laorenIdNumber=" + laorenIdNumber +
			", age=" + age +
			", laorenPhoto=" + laorenPhoto +
			", laorenContent=" + laorenContent +
			", chuangweiName=" + chuangweiName +
			", chuangweiUuidNumber=" + chuangweiUuidNumber +
			", chuangweiPhoto=" + chuangweiPhoto +
			", chuangweiAddress=" + chuangweiAddress +
			", chuangweiContent=" + chuangweiContent +
			", chuangweiDelete=" + chuangweiDelete +
			"} " + super.toString();
	}
}
