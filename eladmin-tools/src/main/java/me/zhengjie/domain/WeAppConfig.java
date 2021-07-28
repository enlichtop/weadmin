/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.zhengjie.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 小程序配置类
 * @author
 * @date 2018-12-31
 */
@Data
@Entity
@Table(name = "tool_weapp_config")
public class WeAppConfig implements Serializable {

    @Id
    @Column(name = "ID")
    @ApiModelProperty(value = "ID", hidden = true)
    private String id;

    @Column(name = "CONFIGID")
    @ApiModelProperty(value = "CONFIGID", hidden = true)
    private String configId;

    @Column(name = "CONFIGNAME")
    @ApiModelProperty(value = "CONFIGNAME", hidden = true)
    private String configName;

    @Column(name = "CONFIGDESC")
    @ApiModelProperty(value = "配置描述")
    private String configDesc;

    @Column(name = "UPDATETIME")
    @ApiModelProperty(value = "时间戳")
    private Timestamp updateTime;

}
