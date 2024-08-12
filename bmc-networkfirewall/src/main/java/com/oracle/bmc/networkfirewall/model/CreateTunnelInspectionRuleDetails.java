/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Request for creating Tunnel Inspection Rule used in the firewall policy rules.
 * Tunnel Inspection Rule determines whether tunnel inspection is applied on the traffic based on attributes
 * such as Tunnel Inspection protocol, the source and destination IP address.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "protocol",
    defaultImpl = CreateTunnelInspectionRuleDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateVxlanInspectionRuleDetails.class,
        name = "VXLAN"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateTunnelInspectionRuleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "action", "position"})
    protected CreateTunnelInspectionRuleDetails(
            String name, InspectActionType action, RulePosition position) {
        super();
        this.name = name;
        this.action = action;
        this.position = position;
    }

    /**
     * Name for the Tunnel Inspection Rule, must be unique within the policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name for the Tunnel Inspection Rule, must be unique within the policy.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Types of Inspect Action on the traffic flow.
     * <p>
     * INSPECT - Inspect the traffic.
     *   * INSPECT_AND_CAPTURE_LOG - Inspect and capture logs for the traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final InspectActionType action;

    /**
     * Types of Inspect Action on the traffic flow.
     * <p>
     * INSPECT - Inspect the traffic.
     *   * INSPECT_AND_CAPTURE_LOG - Inspect and capture logs for the traffic.
     *
     * @return the value
     **/
    public InspectActionType getAction() {
        return action;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final RulePosition position;

    public RulePosition getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateTunnelInspectionRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTunnelInspectionRuleDetails)) {
            return false;
        }

        CreateTunnelInspectionRuleDetails other = (CreateTunnelInspectionRuleDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.position, other.position)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
