/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/** Possible status for a Delegated Resource Access Request. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public enum DelegatedResourceAccessRequestStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Created("CREATED"),
    ApprovalWaiting("APPROVAL_WAITING"),
    OperatorAssignmentWaiting("OPERATOR_ASSIGNMENT_WAITING"),
    Preapproved("PREAPPROVED"),
    Approved("APPROVED"),
    ApprovedForFuture("APPROVED_FOR_FUTURE"),
    Rejected("REJECTED"),
    Deployed("DEPLOYED"),
    DeployFailed("DEPLOY_FAILED"),
    Undeployed("UNDEPLOYED"),
    UndeployFailed("UNDEPLOY_FAILED"),
    CloseFailed("CLOSE_FAILED"),
    RevokeFailed("REVOKE_FAILED"),
    ExpiryFailed("EXPIRY_FAILED"),
    Revoking("REVOKING"),
    Revoked("REVOKED"),
    Extending("EXTENDING"),
    Extended("EXTENDED"),
    ExtensionRejected("EXTENSION_REJECTED"),
    ExtensionFailed("EXTENSION_FAILED"),
    Completing("COMPLETING"),
    Completed("COMPLETED"),
    Expired("EXPIRED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DelegatedResourceAccessRequestStatus.class);

    private final String value;
    private static java.util.Map<String, DelegatedResourceAccessRequestStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (DelegatedResourceAccessRequestStatus v :
                DelegatedResourceAccessRequestStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DelegatedResourceAccessRequestStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DelegatedResourceAccessRequestStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DelegatedResourceAccessRequestStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
