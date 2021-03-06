/*
 * Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may
 * not use this file except in compliance with the License. A copy of the
 * License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "LICENSE" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.blox.dataservicemodel.v1.old.model.wrappers;

import com.amazonaws.blox.dataservicemodel.v1.old.model.DeploymentConfiguration;
import com.amazonaws.blox.dataservicemodel.v1.old.model.EnvironmentType;
import com.amazonaws.blox.dataservicemodel.v1.old.model.InstanceGroup;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
// required for builder
@AllArgsConstructor
// required for mapstruct
@NoArgsConstructor
public class DescribeEnvironmentResponse {

  @NonNull private String environmentId;
  @NonNull private String environmentName;
  @NonNull private String taskDefinition;
  @NonNull private String role;
  @NonNull private InstanceGroup instanceGroup;
  @NonNull private EnvironmentType type;
  @NonNull private String environmentVersion;
  @NonNull private String status;
  @NonNull private String health;
  @NonNull private Instant createdTime;
  private DeploymentConfiguration deploymentConfiguration;
  private Instant lastUpdatedTime;
}
