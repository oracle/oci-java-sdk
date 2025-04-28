/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public enum WorkRequestOperationType implements com.oracle.bmc.http.internal.BmcEnum {
    InstallPackages("INSTALL_PACKAGES"),
    RemovePackages("REMOVE_PACKAGES"),
    UpdatePackages("UPDATE_PACKAGES"),
    UpdateAllPackages("UPDATE_ALL_PACKAGES"),
    UpdateSecurity("UPDATE_SECURITY"),
    UpdateBugfix("UPDATE_BUGFIX"),
    UpdateEnhancement("UPDATE_ENHANCEMENT"),
    UpdateOther("UPDATE_OTHER"),
    UpdateKspliceKernel("UPDATE_KSPLICE_KERNEL"),
    UpdateKspliceUserspace("UPDATE_KSPLICE_USERSPACE"),
    EnableModuleStreams("ENABLE_MODULE_STREAMS"),
    DisableModuleStreams("DISABLE_MODULE_STREAMS"),
    SwitchModuleStream("SWITCH_MODULE_STREAM"),
    InstallModuleProfiles("INSTALL_MODULE_PROFILES"),
    RemoveModuleProfiles("REMOVE_MODULE_PROFILES"),
    SetSoftwareSources("SET_SOFTWARE_SOURCES"),
    ListPackages("LIST_PACKAGES"),
    SetManagementStationConfig("SET_MANAGEMENT_STATION_CONFIG"),
    SyncManagementStationMirror("SYNC_MANAGEMENT_STATION_MIRROR"),
    UpdateManagementStationSoftware("UPDATE_MANAGEMENT_STATION_SOFTWARE"),
    Update("UPDATE"),
    ModuleActions("MODULE_ACTIONS"),
    LifecyclePromotion("LIFECYCLE_PROMOTION"),
    CreateSoftwareSource("CREATE_SOFTWARE_SOURCE"),
    UpdateSoftwareSource("UPDATE_SOFTWARE_SOURCE"),
    ImportContent("IMPORT_CONTENT"),
    SyncAgentConfig("SYNC_AGENT_CONFIG"),
    InstallWindowsUpdates("INSTALL_WINDOWS_UPDATES"),
    ListWindowsUpdate("LIST_WINDOWS_UPDATE"),
    GetWindowsUpdateDetails("GET_WINDOWS_UPDATE_DETAILS"),
    InstallAllWindowsUpdates("INSTALL_ALL_WINDOWS_UPDATES"),
    InstallSecurityWindowsUpdates("INSTALL_SECURITY_WINDOWS_UPDATES"),
    InstallBugfixWindowsUpdates("INSTALL_BUGFIX_WINDOWS_UPDATES"),
    InstallEnhancementWindowsUpdates("INSTALL_ENHANCEMENT_WINDOWS_UPDATES"),
    InstallOtherWindowsUpdates("INSTALL_OTHER_WINDOWS_UPDATES"),
    RemoveContent("REMOVE_CONTENT"),
    UnregisterManagedInstance("UNREGISTER_MANAGED_INSTANCE"),
    Reboot("REBOOT"),

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
