/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/** The types of work request operations. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public enum WorkRequestOperationType implements com.oracle.bmc.http.internal.BmcEnum {
    NotebookSessionCreate("NOTEBOOK_SESSION_CREATE"),
    NotebookSessionDelete("NOTEBOOK_SESSION_DELETE"),
    NotebookSessionActivate("NOTEBOOK_SESSION_ACTIVATE"),
    NotebookSessionDeactivate("NOTEBOOK_SESSION_DEACTIVATE"),
    ModelversionsetDelete("MODELVERSIONSET_DELETE"),
    ExportModelArtifact("EXPORT_MODEL_ARTIFACT"),
    ImportModelArtifact("IMPORT_MODEL_ARTIFACT"),
    ModelDeploymentCreate("MODEL_DEPLOYMENT_CREATE"),
    ModelDeploymentDelete("MODEL_DEPLOYMENT_DELETE"),
    ModelDeploymentActivate("MODEL_DEPLOYMENT_ACTIVATE"),
    ModelDeploymentDeactivate("MODEL_DEPLOYMENT_DEACTIVATE"),
    ModelDeploymentUpdate("MODEL_DEPLOYMENT_UPDATE"),
    ProjectDelete("PROJECT_DELETE"),
    WorkrequestCancel("WORKREQUEST_CANCEL"),
    JobDelete("JOB_DELETE"),
    PipelineCreate("PIPELINE_CREATE"),
    PipelineDelete("PIPELINE_DELETE"),
    PipelineRunCreate("PIPELINE_RUN_CREATE"),
    PipelineRunCancel("PIPELINE_RUN_CANCEL"),
    PipelineRunDelete("PIPELINE_RUN_DELETE"),
    MlApplicationPackageUpload("ML_APPLICATION_PACKAGE_UPLOAD"),
    MlApplicationTriggerStart("ML_APPLICATION_TRIGGER_START"),
    MlApplicationImplementationDelete("ML_APPLICATION_IMPLEMENTATION_DELETE"),
    MlApplicationImplementationUpdate("ML_APPLICATION_IMPLEMENTATION_UPDATE"),
    MlApplicationImplementationMove("ML_APPLICATION_IMPLEMENTATION_MOVE"),
    MlApplicationInstanceCreate("ML_APPLICATION_INSTANCE_CREATE"),
    MlApplicationInstanceUpdate("ML_APPLICATION_INSTANCE_UPDATE"),
    MlApplicationInstanceDelete("ML_APPLICATION_INSTANCE_DELETE"),
    MlApplicationInstanceMove("ML_APPLICATION_INSTANCE_MOVE"),
    MlApplicationInstanceViewCreate("ML_APPLICATION_INSTANCE_VIEW_CREATE"),
    MlApplicationInstanceViewUpdate("ML_APPLICATION_INSTANCE_VIEW_UPDATE"),
    MlApplicationInstanceViewDelete("ML_APPLICATION_INSTANCE_VIEW_DELETE"),
    MlApplicationInstanceViewUpgrade("ML_APPLICATION_INSTANCE_VIEW_UPGRADE"),
    MlApplicationInstanceViewMove("ML_APPLICATION_INSTANCE_VIEW_MOVE"),
    PrivateEndpointCreate("PRIVATE_ENDPOINT_CREATE"),
    PrivateEndpointDelete("PRIVATE_ENDPOINT_DELETE"),
    PrivateEndpointMove("PRIVATE_ENDPOINT_MOVE"),
    PrivateEndpointUpdate("PRIVATE_ENDPOINT_UPDATE"),
    ScheduleCreate("SCHEDULE_CREATE"),
    ScheduleUpdate("SCHEDULE_UPDATE"),
    ScheduleDelete("SCHEDULE_DELETE"),
    ScheduleMove("SCHEDULE_MOVE"),
    ScheduleActivate("SCHEDULE_ACTIVATE"),
    ScheduleDeactivate("SCHEDULE_DEACTIVATE"),
    RegisterModelArtifact("REGISTER_MODEL_ARTIFACT"),
    RestoreArchivedModel("RESTORE_ARCHIVED_MODEL"),
    ModelGroupCreate("MODEL_GROUP_CREATE"),
    ModelGroupUpdate("MODEL_GROUP_UPDATE"),
    ModelGroupDelete("MODEL_GROUP_DELETE"),
    ModelGroupVersionHistoryDelete("MODEL_GROUP_VERSION_HISTORY_DELETE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkRequestOperationType.class);

    private final String value;
    private static java.util.Map<String, WorkRequestOperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestOperationType v : WorkRequestOperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestOperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestOperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestOperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
