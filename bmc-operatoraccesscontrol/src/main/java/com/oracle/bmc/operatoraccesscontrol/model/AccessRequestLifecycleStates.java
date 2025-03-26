/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Possible lifecycle states for an access request.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum AccessRequestLifecycleStates {
    Created("CREATED"),
    Approvalwaiting("APPROVALWAITING"),
    Preapproved("PREAPPROVED"),
    Approved("APPROVED"),
    Moreinfo("MOREINFO"),
    Rejected("REJECTED"),
    Deployed("DEPLOYED"),
    Deployfailed("DEPLOYFAILED"),
    Undeployed("UNDEPLOYED"),
    Undeployfailed("UNDEPLOYFAILED"),
    Closefailed("CLOSEFAILED"),
    Revokefailed("REVOKEFAILED"),
    Expiryfailed("EXPIRYFAILED"),
    Revoking("REVOKING"),
    Revoked("REVOKED"),
    Extending("EXTENDING"),
    Extended("EXTENDED"),
    Extensionrejected("EXTENSIONREJECTED"),
    Completing("COMPLETING"),
    Completed("COMPLETED"),
    Expired("EXPIRED"),
    Approvedforfuture("APPROVEDFORFUTURE"),
    Inreview("INREVIEW"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AccessRequestLifecycleStates.class);

    private final String value;
    private static java.util.Map<String, AccessRequestLifecycleStates> map;

    static {
        map = new java.util.HashMap<>();
        for (AccessRequestLifecycleStates v : AccessRequestLifecycleStates.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AccessRequestLifecycleStates(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AccessRequestLifecycleStates create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AccessRequestLifecycleStates', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
