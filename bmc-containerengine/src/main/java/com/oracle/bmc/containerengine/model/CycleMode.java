/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * BOOT_VOLUME_REPLACE cycling swaps the boot volume on the same node, while INSTANCE_REPLACE
 * cycling deletes and recreates a new node with the changes applied. Only a subset of fields
 * (kubernetesVersion, imageId, bootVolumeSizeInGBs, nodeMetadata, sshPublicKey) can be changed with
 * BOOT_VOLUME_REPLACE cycling. The cycling operation will attempt to bring all nodes in the
 * NodePool in sync with the NodePool specification. If BOOT_VOLUME_REPLACE cycling mode is chosen,
 * and the node needs changes to fields that can not be updated via a BOOT_VOLUME_REPLACE cycle, the
 * cycle attempt for that node will fail. The operation has to be retried with cycle mode changed to
 * INSTANCE_REPLACE in this case.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public enum CycleMode implements com.oracle.bmc.http.internal.BmcEnum {
    BootVolumeReplace("BOOT_VOLUME_REPLACE"),
    InstanceReplace("INSTANCE_REPLACE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CycleMode.class);

    private final String value;
    private static java.util.Map<String, CycleMode> map;

    static {
        map = new java.util.HashMap<>();
        for (CycleMode v : CycleMode.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CycleMode(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CycleMode create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CycleMode', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
