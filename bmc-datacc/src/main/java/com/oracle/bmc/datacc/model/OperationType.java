/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateInstance("CREATE_INSTANCE"),
    DeleteInstance("DELETE_INSTANCE"),
    UpdateInstance("UPDATE_INSTANCE"),
    ChangeInstanceCompartment("CHANGE_INSTANCE_COMPARTMENT"),
    CreateBaseVmClusterNetwork("CREATE_BASE_VM_CLUSTER_NETWORK"),
    DeleteBaseVmClusterNetwork("DELETE_BASE_VM_CLUSTER_NETWORK"),
    ValidateBaseVmClusterNetwork("VALIDATE_BASE_VM_CLUSTER_NETWORK"),
    UpdateBaseVmClusterNetwork("UPDATE_BASE_VM_CLUSTER_NETWORK"),
    ChangeBaseVmClusterNetworkCompartment("CHANGE_BASE_VM_CLUSTER_NETWORK_COMPARTMENT"),
    StartBaseVm("START_BASE_VM"),
    StopBaseVm("STOP_BASE_VM"),
    StartInstance("START_INSTANCE"),
    StopInstance("STOP_INSTANCE"),
    ScaleInstance("SCALE_INSTANCE"),
    RestartInstance("RESTART_INSTANCE"),
    RestartBaseVm("RESTART_BASE_VM"),
    MigrateInstance("MIGRATE_INSTANCE"),
    ScaleBaseVm("SCALE_BASE_VM"),
    UpdateSoftwareImage("UPDATE_SOFTWARE_IMAGE"),
    ChangeSoftwareImageCompartment("CHANGE_SOFTWARE_IMAGE_COMPARTMENT"),
    ValidateProxy("VALIDATE_PROXY"),
    CreateBaseInfraCapacity("CREATE_BASE_INFRA_CAPACITY"),
    UpdateBaseInfraCapacity("UPDATE_BASE_INFRA_CAPACITY"),
    DeleteBaseInfraCapacity("DELETE_BASE_INFRA_CAPACITY"),
    ActivateBaseInfrastructure("ACTIVATE_BASE_INFRASTRUCTURE"),
    CreateBaseInfrastructure("CREATE_BASE_INFRASTRUCTURE"),
    DeleteBaseInfrastructure("DELETE_BASE_INFRASTRUCTURE"),
    UpdateBaseInfrastructure("UPDATE_BASE_INFRASTRUCTURE"),
    UpdateBaseInfrastructureSoftware("UPDATE_BASE_INFRASTRUCTURE_SOFTWARE"),
    ValidateBaseInfrastructure("VALIDATE_BASE_INFRASTRUCTURE"),
    ChangeBaseInfrastructureCompartment("CHANGE_BASE_INFRASTRUCTURE_COMPARTMENT"),
    AnalyzeInfrastructure("ANALYZE_INFRASTRUCTURE"),
    AnalyzeBaseInfraNetwork("ANALYZE_BASE_INFRA_NETWORK"),
    InfrastructureSreValidation("INFRASTRUCTURE_SRE_VALIDATION"),
    CreateMaintenanceRun("CREATE_MAINTENANCE_RUN"),
    UpdateMaintenanceRun("UPDATE_MAINTENANCE_RUN"),
    RescheduleMaintenanceRun("RESCHEDULE_MAINTENANCE_RUN"),
    InfrastructureScaleStorage("INFRASTRUCTURE_SCALE_STORAGE"),

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
