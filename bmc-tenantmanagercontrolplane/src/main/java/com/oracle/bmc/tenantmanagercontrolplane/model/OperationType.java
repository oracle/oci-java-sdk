/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public enum OperationType {
    CreateSenderInvitation("CREATE_SENDER_INVITATION"),
    AcceptRecipientInvitation("ACCEPT_RECIPIENT_INVITATION"),
    CancelSenderInvitation("CANCEL_SENDER_INVITATION"),
    CompleteOrderActivation("COMPLETE_ORDER_ACTIVATION"),
    ActivateOrderExistingTenancy("ACTIVATE_ORDER_EXISTING_TENANCY"),
    RegisterDomain("REGISTER_DOMAIN"),
    ReleaseDomain("RELEASE_DOMAIN"),
    CreateChildTenancy("CREATE_CHILD_TENANCY"),
    AssignDefaultSubscription("ASSIGN_DEFAULT_SUBSCRIPTION"),
    ManualLinkCreation("MANUAL_LINK_CREATION"),
    TerminateOrganizationTenancy("TERMINATE_ORGANIZATION_TENANCY"),
    UpdateSaasCapability("UPDATE_SAAS_CAPABILITY"),
    SoftTerminateTenancy("SOFT_TERMINATE_TENANCY"),
    HardTerminateTenancy("HARD_TERMINATE_TENANCY"),
    RestoreTenancy("RESTORE_TENANCY"),
    LogTenancyTerminationRequest("LOG_TENANCY_TERMINATION_REQUEST"),
    SelfOptIn("SELF_OPT_IN"),
    SelfOptOut("SELF_OPT_OUT"),

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
