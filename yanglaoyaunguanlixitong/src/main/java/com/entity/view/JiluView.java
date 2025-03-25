package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 健康信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jilu")
public class JiluView extends JiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

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
	//级联表 护工
		/**
		* 护工编号
		*/

		@ColumnInfo(comment="护工编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 护工姓名
		*/

		@ColumnInfo(comment="护工姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 护工手机号
		*/

		@ColumnInfo(comment="护工手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 护工身份证号
		*/

		@ColumnInfo(comment="护工身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 护工头像
		*/

		@ColumnInfo(comment="护工头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 护工等级
		*/
		@ColumnInfo(comment="护工等级",type="int(11)")
		private Integer yonghuTypes;
			/**
			* 护工等级的值
			*/
			@ColumnInfo(comment="护工等级的字典表值",type="varchar(200)")
			private String yonghuValue;
		/**
		* 价钱
		*/

		@ColumnInfo(comment="价钱",type="varchar(200)")
		private String yonghuJaiwei;
		/**
		* 护工邮箱
		*/

		@ColumnInfo(comment="护工邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public JiluView() {

	}

	public JiluView(JiluEntity jiluEntity) {
		try {
			BeanUtils.copyProperties(this, jiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	//级联表的get和set 护工

		/**
		* 获取： 护工编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 护工编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 护工姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 护工姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 护工手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 护工手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 护工身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 护工身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 护工头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 护工头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}
		/**
		* 获取： 护工等级
		*/
		public Integer getYonghuTypes() {
			return yonghuTypes;
		}
		/**
		* 设置： 护工等级
		*/
		public void setYonghuTypes(Integer yonghuTypes) {
			this.yonghuTypes = yonghuTypes;
		}


			/**
			* 获取： 护工等级的值
			*/
			public String getYonghuValue() {
				return yonghuValue;
			}
			/**
			* 设置： 护工等级的值
			*/
			public void setYonghuValue(String yonghuValue) {
				this.yonghuValue = yonghuValue;
			}

		/**
		* 获取： 价钱
		*/
		public String getYonghuJaiwei() {
			return yonghuJaiwei;
		}
		/**
		* 设置： 价钱
		*/
		public void setYonghuJaiwei(String yonghuJaiwei) {
			this.yonghuJaiwei = yonghuJaiwei;
		}

		/**
		* 获取： 护工邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 护工邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
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
		return "JiluView{" +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuJaiwei=" + yonghuJaiwei +
			", yonghuEmail=" + yonghuEmail +
			", kanhurenName=" + kanhurenName +
			", kanhurenPhone=" + kanhurenPhone +
			", laorenName=" + laorenName +
			", laorenPhone=" + laorenPhone +
			", laorenIdNumber=" + laorenIdNumber +
			", age=" + age +
			", laorenPhoto=" + laorenPhoto +
			", laorenContent=" + laorenContent +
			"} " + super.toString();
	}
}
