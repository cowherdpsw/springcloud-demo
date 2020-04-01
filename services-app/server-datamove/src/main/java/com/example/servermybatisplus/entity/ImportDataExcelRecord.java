package com.example.servermybatisplus.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @Author:peishouwen
 * @Desc:案件导入记录
 * @Date:Create in 14:34 2018/7/28
 */
@Data
@ApiModel(value = "ImportDataExcelRecord", description = "案件导入记录")
public class ImportDataExcelRecord {

    @ApiModelProperty("唯一标识（主键）")
    private String Id;

    @ApiModelProperty(notes = "外键:文件ID")
    private String fileId;

    @ApiModelProperty(notes = "批次号")
    private String batchNumber;

    @ApiModelProperty(notes = "委案日期")
    @Field(type = FieldType.Date)
    private Date delegationDate;

    @ApiModelProperty(notes = "结案日期")
    @Field(type = FieldType.Date)
    private Date endCaseDate;

    @ApiModelProperty(notes = "委托方id标识")
    private String principalId;

    @ApiModelProperty(notes = "委托方名称")
    private String principalName;

    @ApiModelProperty("Excel 模板ID")
    private String templateId;

    @ApiModelProperty("备注文件URL")
    private String resultUrl;

    @ApiModelProperty("数据导入状态")
    private String importDataExcelStatus;

    @ApiModelProperty("案件数量")
    private Long caseTotal;

    @ApiModelProperty("创建时间")
    @Field(type = FieldType.Date)
    private Date operatorTime;

    @ApiModelProperty("操作人姓名")
    private String operatorName;

    @ApiModelProperty("操作人")
    private String operatorUserName;

    @ApiModelProperty("操作批次号")
    private String seqNo;

}
