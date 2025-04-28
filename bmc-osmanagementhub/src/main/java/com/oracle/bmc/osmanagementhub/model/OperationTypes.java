/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/** Type of operation the scheduled job is performing. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public enum OperationTypes implements com.oracle.bmc.http.internal.BmcEnum {
    InstallPackages("INSTALL_PACKAGES"),
    UpdatePackages("UPDATE_PACKAGES"),
    RemovePackages("REMOVE_PACKAGES"),
    UpdateAll("UPDATE_ALL"),
    UpdateSecurity("UPDATE_SECURITY"),
    UpdateBugfix("UPDATE_BUGFIX"),
    UpdateEnhancement("UPDATE_ENHANCEMENT"),
    UpdateOther("UPDATE_OTHER"),
    UpdateKspliceUserspace("UPDATE_KSPLICE_USERSPACE"),
    UpdateKspliceKernel("UPDATE_KSPLICE_KERNEL"),
    ManageModuleStreams("MANAGE_MODULE_STREAMS"),
    SwitchModuleStream("SWITCH_MODULE_STREAM"),
    AttachSoftwareSources("ATTACH_SOFTWARE_SOURCES"),
    DetachSoftwareSources("DETACH_SOFTWARE_SOURCES"),
    SyncManagementStationMirror("SYNC_MANAGEMENT_STATION_MIRROR"),
    PromoteLifecycle("PROMOTE_LIFECYCLE"),
    InstallWindowsUpdates("INSTALL_WINDOWS_UPDATES"),
    InstallAllWindowsUpdates("INSTALL_ALL_WINDOWS_UPDATES"),
    InstallSecurityWindowsUpdates("INSTALL_SECURITY_WINDOWS_UPDATES"),
    InstallBugfixWindowsUpdates("INSTALL_BUGFIX_WINDOWS_UPDATES"),
    InstallEnhancementWindowsUpdates("INSTALL_ENHANCEMENT_WINDOWS_UPDATES"),
    InstallOtherWindowsUpdates("INSTALL_OTHER_WINDOWS_UPDATES"),
    Reboot("REBOOT"),
    RerunWorkRequest("RERUN_WORK_REQUEST"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationTypes.class);

    private final String value;
    private static java.util.Map<String, OperationTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationTypes v : OperationTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
