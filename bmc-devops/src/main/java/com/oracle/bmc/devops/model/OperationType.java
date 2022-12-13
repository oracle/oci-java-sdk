/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/** Possible operation types. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateProject("CREATE_PROJECT"),
    UpdateProject("UPDATE_PROJECT"),
    DeleteProject("DELETE_PROJECT"),
    MoveProject("MOVE_PROJECT"),
    CreateDeployPipeline("CREATE_DEPLOY_PIPELINE"),
    UpdateDeployPipeline("UPDATE_DEPLOY_PIPELINE"),
    DeleteDeployPipeline("DELETE_DEPLOY_PIPELINE"),
    CreateDeployStage("CREATE_DEPLOY_STAGE"),
    UpdateDeployStage("UPDATE_DEPLOY_STAGE"),
    DeleteDeployStage("DELETE_DEPLOY_STAGE"),
    CreateDeployArtifact("CREATE_DEPLOY_ARTIFACT"),
    UpdateDeployArtifact("UPDATE_DEPLOY_ARTIFACT"),
    DeleteDeployArtifact("DELETE_DEPLOY_ARTIFACT"),
    CreateDeployEnvironment("CREATE_DEPLOY_ENVIRONMENT"),
    UpdateDeployEnvironment("UPDATE_DEPLOY_ENVIRONMENT"),
    DeleteDeployEnvironment("DELETE_DEPLOY_ENVIRONMENT"),
    CreateDeployment("CREATE_DEPLOYMENT"),
    UpdateDeployment("UPDATE_DEPLOYMENT"),
    DeleteDeployment("DELETE_DEPLOYMENT"),
    CreateBuildPipeline("CREATE_BUILD_PIPELINE"),
    UpdateBuildPipeline("UPDATE_BUILD_PIPELINE"),
    DeleteBuildPipeline("DELETE_BUILD_PIPELINE"),
    CreateBuildPipelineStage("CREATE_BUILD_PIPELINE_STAGE"),
    UpdateBuildPipelineStage("UPDATE_BUILD_PIPELINE_STAGE"),
    DeleteBuildPipelineStage("DELETE_BUILD_PIPELINE_STAGE"),
    CreateConnection("CREATE_CONNECTION"),
    UpdateConnection("UPDATE_CONNECTION"),
    DeleteConnection("DELETE_CONNECTION"),
    CreateTrigger("CREATE_TRIGGER"),
    UpdateTrigger("UPDATE_TRIGGER"),
    DeleteTrigger("DELETE_TRIGGER"),
    ExecuteTrigger("EXECUTE_TRIGGER"),
    CreateRepository("CREATE_REPOSITORY"),
    UpdateRepository("UPDATE_REPOSITORY"),
    DeleteRepository("DELETE_REPOSITORY"),
    MirrorRepository("MIRROR_REPOSITORY"),
    ScheduleCascadingProjectDeletion("SCHEDULE_CASCADING_PROJECT_DELETION"),
    CancelScheduledCascadingProjectDeletion("CANCEL_SCHEDULED_CASCADING_PROJECT_DELETION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationType.class);

    private final String value;
    private static java.util.Map<String, OperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationType v : OperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
