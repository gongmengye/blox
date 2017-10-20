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
package com.amazonaws.blox.scheduling.scheduler;

import com.amazonaws.blox.scheduling.SchedulingApplication;
import com.amazonaws.blox.scheduling.scheduler.engine.SchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.services.ecs.ECSAsyncClient;

@Configuration
@ComponentScan("com.amazonaws.blox.scheduling.scheduler")
public class SchedulerApplication extends SchedulingApplication {
  @Bean
  public ECSAsyncClient ecs() {
    return ECSAsyncClient.builder().build();
  }

  @Bean
  public SchedulerFactory schedulerFactory() {
    return new SchedulerFactory();
  }
}
