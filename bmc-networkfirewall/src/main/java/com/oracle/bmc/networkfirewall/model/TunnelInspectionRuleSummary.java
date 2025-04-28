/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Summary for the Tunnel Inspection Rule used in the firewall policy rules. Tunnel Inspection Rule
 * determines whether tunnel inspection is applied on the traffic based on attributes such as Tunnel
 * Inspect protocol, the source and destination IP address. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "protocol",
        defaultImpl = TunnelInspectionRuleSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VxlanInspectionRuleSummary.class,
            name = "VXLAN")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class TunnelInspectionRuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "action", "priorityOrder", "parentResourceId"})
    protected TunnelInspectionRuleSummary(
            String name, InspectActionType action, Long priorityOrder, String parentResourceId) {
        super();
        this.name = name;
        this.action = action;
        this.priorityOrder = priorityOrder;
        this.parentResourceId = parentResourceId;
    }

    /** Name for the Tunnel Inspection Rule, must be unique within the policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name for the Tunnel Inspection Rule, must be unique within the policy.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Types of Inspect Action on the Traffic flow.
     *
     * <p>INSPECT - Inspect the traffic. * INSPECT_AND_CAPTURE_LOG - Inspect and capture logs for
     * the traffic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final InspectActionType action;

    /**
     * Types of Inspect Action on the Traffic flow.
     *
     * <p>INSPECT - Inspect the traffic. * INSPECT_AND_CAPTURE_LOG - Inspect and capture logs for
     * the traffic.
     *
     * @return the value
     */
    public InspectActionType getAction() {
        return action;
    }

    /** The priority order in which this rule should be evaluated */
    @com.fasterxml.jackson.annotation.JsonProperty("priorityOrder")
    private final Long priorityOrder;

    /**
     * The priority order in which this rule should be evaluated
     *
     * @return the value
     */
    public Long getPriorityOrder() {
        return priorityOrder;
    }

    /** OCID of the Network Firewall Policy this Tunnel Inspection Rule belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the Network Firewall Policy this Tunnel Inspection Rule belongs to.
     *
     * @return the value
     */
    public String getParentResourceId() {
        return parentResourceId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TunnelInspectionRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", priorityOrder=").append(String.valueOf(this.priorityOrder));
        sb.append(", parentResourceId=").append(String.valueOf(this.parentResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TunnelInspectionRuleSummary)) {
            return false;
        }

        TunnelInspectionRuleSummary other = (TunnelInspectionRuleSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.priorityOrder, other.priorityOrder)
                && java.util.Objects.equals(this.parentResourceId, other.parentResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.priorityOrder == null ? 43 : this.priorityOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourceId == null ? 43 : this.parentResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
