package com.org.hul.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "dss_ua_qgp_user_level")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserQgpRssmLevel {
	@Id
	@Generated
	private String id;
	@Field(name="role_level")
	private String roleLevel;
	@Field(name="role_user")
	private String roleUser;
	@Field(name="role_plg")
	private String rolePlg;
	@Field(name="mtd_target")
	private BigDecimal mtdTarget;
	@Field(name="mtdAchv")
	private BigDecimal mtd_achv;
	@Field(name="ystd_target")
	private BigDecimal ystdTarget;
	@Field(name="ystd_achv")
	private BigDecimal ystdAchv;
	@Field(name="tdy_achv")
	private BigDecimal tdyAchv;
	@Field(name="l3m_target")
	private BigDecimal l3mTarget;
	@Field(name="l3m_achv")
	private BigDecimal l3mAchv;
	@Field(name="last_1_month_target")
	private BigDecimal last1MonthTarget;
	@Field(name="last_1_month_achievement")
	private BigDecimal last1MonthAchievement;
	@Field(name="last_2_month_target")
	private BigDecimal last2MonthTarget;
	@Field(name="last_2_month_achievement")
	private BigDecimal last2MonthAchievement;
	@Field(name="last_3_month_target")
	private BigDecimal last3MonthTarget;
	@Field(name="last_3_month_achievement")
	private BigDecimal last3MonthAchievement;
	@Field(name="eom_absvalue")
	private BigDecimal eomAbsvalue;
	 
}
