/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateFleet("CREATE_FLEET"),
    UpdateFleet("UPDATE_FLEET"),
    DeleteFleet("DELETE_FLEET"),
    MoveFleet("MOVE_FLEET"),
    ConfirmTarget("CONFIRM_TARGET"),
    GenerateCompliance("GENERATE_COMPLIANCE"),
    RequestTargetDiscovery("REQUEST_TARGET_DISCOVERY"),
    ValidateResource("VALIDATE_RESOURCE"),
    CreateCredential("CREATE_CREDENTIAL"),
    UpdateCredential("UPDATE_CREDENTIAL"),
    DeleteCredential("DELETE_CREDENTIAL"),
    CreateSchedule("CREATE_SCHEDULE"),
    UpdateSchedule("UPDATE_SCHEDULE"),
    UpdateMaintenanceWindow("UPDATE_MAINTENANCE_WINDOW"),
    DeleteMaintenanceWindow("DELETE_MAINTENANCE_WINDOW"),
    CreateFleetResource("CREATE_FLEET_RESOURCE"),
    UpdateFleetResource("UPDATE_FLEET_RESOURCE"),
    DeleteFleetResource("DELETE_FLEET_RESOURCE"),
    CreateFamsOnboarding("CREATE_FAMS_ONBOARDING"),
    CreateRunbook("CREATE_RUNBOOK"),
    UpdateRunbook("UPDATE_RUNBOOK"),
    DeleteRunbook("DELETE_RUNBOOK"),
    PublishRunbook("PUBLISH_RUNBOOK"),
    MoveRunbook("MOVE_RUNBOOK"),
    CreateRunbookVersion("CREATE_RUNBOOK_VERSION"),
    UpdateRunbookVersion("UPDATE_RUNBOOK_VERSION"),
    DeleteRunbookVersion("DELETE_RUNBOOK_VERSION"),
    PublishRunbookVersion("PUBLISH_RUNBOOK_VERSION"),
    MoveTask("MOVE_TASK"),
    ExportRunbook("EXPORT_RUNBOOK"),
    ImportRunbook("IMPORT_RUNBOOK"),
    ExportRunbookVersion("EXPORT_RUNBOOK_VERSION"),
    ImportRunbookVersion("IMPORT_RUNBOOK_VERSION"),
    UpdateTask("UPDATE_TASK"),
    DeleteTask("DELETE_TASK"),
    UpdateFamsOnboarding("UPDATE_FAMS_ONBOARDING"),
    DeleteFamsOnboarding("DELETE_FAMS_ONBOARDING"),
    CreateCompliancePolicyRule("CREATE_COMPLIANCE_POLICY_RULE"),
    UpdateCompliancePolicyRule("UPDATE_COMPLIANCE_POLICY_RULE"),
    DeleteCompliancePolicyRule("DELETE_COMPLIANCE_POLICY_RULE"),
    UpdatePatch("UPDATE_PATCH"),
    DeletePatch("DELETE_PATCH"),
    MovePatch("MOVE_PATCH"),
    ManageJobExecution("MANAGE_JOB_EXECUTION"),
    DeletePlatformConfiguration("DELETE_PLATFORM_CONFIGURATION"),
    UpdatePlatformConfiguration("UPDATE_PLATFORM_CONFIGURATION"),
    MovePlatformConfiguration("MOVE_PLATFORM_CONFIGURATION"),
    CreatePlatformConfiguration("CREATE_PLATFORM_CONFIGURATION"),
    MoveProperty("MOVE_PROPERTY"),
    CreateCatalogItem("CREATE_CATALOG_ITEM"),
    UpdateCatalogItem("UPDATE_CATALOG_ITEM"),
    DeleteCatalogItem("DELETE_CATALOG_ITEM"),
    MoveCatalogItem("MOVE_CATALOG_ITEM"),
    CloneCatalogItem("CLONE_CATALOG_ITEM"),
    CreateProvision("CREATE_PROVISION"),
    UpdateProvision("UPDATE_PROVISION"),
    DeleteProvision("DELETE_PROVISION"),
    MoveProvision("MOVE_PROVISION"),

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
