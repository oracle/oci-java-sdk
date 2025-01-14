/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Summary for the Security Rule used in the firewall policy rules. Security Rules determine whether
 * to block or allow a session based on traffic attributes, such as the source and destination IP
 * address, protocol/port, and the HTTP(S) target URL. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SecurityRuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityRuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "action",
        "inspection",
        "priorityOrder",
        "parentResourceId"
    })
    public SecurityRuleSummary(
            String name,
            TrafficActionType action,
            TrafficInspectionType inspection,
            Long priorityOrder,
            String parentResourceId) {
        super();
        this.name = name;
        this.action = action;
        this.inspection = inspection;
        this.priorityOrder = priorityOrder;
        this.parentResourceId = parentResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name for the Security rule, must be unique within the policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name for the Security rule, must be unique within the policy.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Types of Action on the Traffic flow.
         *
         * <p>ALLOW - Allows the traffic. * DROP - Silently drops the traffic, e.g. without sending
         * a TCP reset. * REJECT - Rejects the traffic, sending a TCP reset to client and/or server
         * as applicable. * INSPECT - Inspects traffic for vulnerability as specified in {@code
         * inspection}, which may result in rejection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private TrafficActionType action;

        /**
         * Types of Action on the Traffic flow.
         *
         * <p>ALLOW - Allows the traffic. * DROP - Silently drops the traffic, e.g. without sending
         * a TCP reset. * REJECT - Rejects the traffic, sending a TCP reset to client and/or server
         * as applicable. * INSPECT - Inspects traffic for vulnerability as specified in {@code
         * inspection}, which may result in rejection.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(TrafficActionType action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * Type of inspection to affect the Traffic flow. This is only applicable if action is
         * INSPECT.
         *
         * <p>INTRUSION_DETECTION - Intrusion Detection. * INTRUSION_PREVENTION - Intrusion
         * Detection and Prevention. Traffic classified as potentially malicious will be rejected as
         * described in {@code type}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inspection")
        private TrafficInspectionType inspection;

        /**
         * Type of inspection to affect the Traffic flow. This is only applicable if action is
         * INSPECT.
         *
         * <p>INTRUSION_DETECTION - Intrusion Detection. * INTRUSION_PREVENTION - Intrusion
         * Detection and Prevention. Traffic classified as potentially malicious will be rejected as
         * described in {@code type}.
         *
         * @param inspection the value to set
         * @return this builder
         */
        public Builder inspection(TrafficInspectionType inspection) {
            this.inspection = inspection;
            this.__explicitlySet__.add("inspection");
            return this;
        }
        /** The priority order in which this rule should be evaluated. */
        @com.fasterxml.jackson.annotation.JsonProperty("priorityOrder")
        private Long priorityOrder;

        /**
         * The priority order in which this rule should be evaluated.
         *
         * @param priorityOrder the value to set
         * @return this builder
         */
        public Builder priorityOrder(Long priorityOrder) {
            this.priorityOrder = priorityOrder;
            this.__explicitlySet__.add("priorityOrder");
            return this;
        }
        /** OCID of the network firewall policy this security rule belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        /**
         * OCID of the network firewall policy this security rule belongs to.
         *
         * @param parentResourceId the value to set
         * @return this builder
         */
        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            this.__explicitlySet__.add("parentResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityRuleSummary build() {
            SecurityRuleSummary model =
                    new SecurityRuleSummary(
                            this.name,
                            this.action,
                            this.inspection,
                            this.priorityOrder,
                            this.parentResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityRuleSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("inspection")) {
                this.inspection(model.getInspection());
            }
            if (model.wasPropertyExplicitlySet("priorityOrder")) {
                this.priorityOrder(model.getPriorityOrder());
            }
            if (model.wasPropertyExplicitlySet("parentResourceId")) {
                this.parentResourceId(model.getParentResourceId());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Name for the Security rule, must be unique within the policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name for the Security rule, must be unique within the policy.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Types of Action on the Traffic flow.
     *
     * <p>ALLOW - Allows the traffic. * DROP - Silently drops the traffic, e.g. without sending a
     * TCP reset. * REJECT - Rejects the traffic, sending a TCP reset to client and/or server as
     * applicable. * INSPECT - Inspects traffic for vulnerability as specified in {@code
     * inspection}, which may result in rejection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final TrafficActionType action;

    /**
     * Types of Action on the Traffic flow.
     *
     * <p>ALLOW - Allows the traffic. * DROP - Silently drops the traffic, e.g. without sending a
     * TCP reset. * REJECT - Rejects the traffic, sending a TCP reset to client and/or server as
     * applicable. * INSPECT - Inspects traffic for vulnerability as specified in {@code
     * inspection}, which may result in rejection.
     *
     * @return the value
     */
    public TrafficActionType getAction() {
        return action;
    }

    /**
     * Type of inspection to affect the Traffic flow. This is only applicable if action is INSPECT.
     *
     * <p>INTRUSION_DETECTION - Intrusion Detection. * INTRUSION_PREVENTION - Intrusion Detection
     * and Prevention. Traffic classified as potentially malicious will be rejected as described in
     * {@code type}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inspection")
    private final TrafficInspectionType inspection;

    /**
     * Type of inspection to affect the Traffic flow. This is only applicable if action is INSPECT.
     *
     * <p>INTRUSION_DETECTION - Intrusion Detection. * INTRUSION_PREVENTION - Intrusion Detection
     * and Prevention. Traffic classified as potentially malicious will be rejected as described in
     * {@code type}.
     *
     * @return the value
     */
    public TrafficInspectionType getInspection() {
        return inspection;
    }

    /** The priority order in which this rule should be evaluated. */
    @com.fasterxml.jackson.annotation.JsonProperty("priorityOrder")
    private final Long priorityOrder;

    /**
     * The priority order in which this rule should be evaluated.
     *
     * @return the value
     */
    public Long getPriorityOrder() {
        return priorityOrder;
    }

    /** OCID of the network firewall policy this security rule belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the network firewall policy this security rule belongs to.
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
        sb.append("SecurityRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", inspection=").append(String.valueOf(this.inspection));
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
        if (!(o instanceof SecurityRuleSummary)) {
            return false;
        }

        SecurityRuleSummary other = (SecurityRuleSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.inspection, other.inspection)
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
        result = (result * PRIME) + (this.inspection == null ? 43 : this.inspection.hashCode());
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
