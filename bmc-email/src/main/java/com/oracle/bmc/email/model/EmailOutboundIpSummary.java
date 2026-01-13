/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.model;

/**
 * Summary of the Outbound IP address assigned to the tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EmailOutboundIpSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EmailOutboundIpSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "outboundIp",
        "lifecycleState",
        "lifecycleDetails",
        "assignmentState"
    })
    public EmailOutboundIpSummary(
            String outboundIp,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            AssignmentState assignmentState) {
        super();
        this.outboundIp = outboundIp;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.assignmentState = assignmentState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The public IP address assigned to the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundIp")
        private String outboundIp;

        /**
         * The public IP address assigned to the tenancy.
         *
         * @param outboundIp the value to set
         * @return this builder
         */
        public Builder outboundIp(String outboundIp) {
            this.outboundIp = outboundIp;
            this.__explicitlySet__.add("outboundIp");
            return this;
        }
        /** The current state of the Email Outbound Public IP. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Email Outbound Public IP.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in 'DRAINING' state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in 'DRAINING' state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The assignment state of the public IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("assignmentState")
        private AssignmentState assignmentState;

        /**
         * The assignment state of the public IP address.
         *
         * @param assignmentState the value to set
         * @return this builder
         */
        public Builder assignmentState(AssignmentState assignmentState) {
            this.assignmentState = assignmentState;
            this.__explicitlySet__.add("assignmentState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmailOutboundIpSummary build() {
            EmailOutboundIpSummary model =
                    new EmailOutboundIpSummary(
                            this.outboundIp,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.assignmentState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmailOutboundIpSummary model) {
            if (model.wasPropertyExplicitlySet("outboundIp")) {
                this.outboundIp(model.getOutboundIp());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("assignmentState")) {
                this.assignmentState(model.getAssignmentState());
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

    /** The public IP address assigned to the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundIp")
    private final String outboundIp;

    /**
     * The public IP address assigned to the tenancy.
     *
     * @return the value
     */
    public String getOutboundIp() {
        return outboundIp;
    }

    /** The current state of the Email Outbound Public IP. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Updating("UPDATING"),
        Active("ACTIVE"),
        Failed("FAILED"),
        Draining("DRAINING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the Email Outbound Public IP. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Email Outbound Public IP.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in 'DRAINING' state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in 'DRAINING' state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The assignment state of the public IP address. */
    public enum AssignmentState implements com.oracle.bmc.http.internal.BmcEnum {
        Available("AVAILABLE"),
        Assigned("ASSIGNED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssignmentState.class);

        private final String value;
        private static java.util.Map<String, AssignmentState> map;

        static {
            map = new java.util.HashMap<>();
            for (AssignmentState v : AssignmentState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssignmentState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssignmentState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssignmentState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The assignment state of the public IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("assignmentState")
    private final AssignmentState assignmentState;

    /**
     * The assignment state of the public IP address.
     *
     * @return the value
     */
    public AssignmentState getAssignmentState() {
        return assignmentState;
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
        sb.append("EmailOutboundIpSummary(");
        sb.append("super=").append(super.toString());
        sb.append("outboundIp=").append(String.valueOf(this.outboundIp));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", assignmentState=").append(String.valueOf(this.assignmentState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmailOutboundIpSummary)) {
            return false;
        }

        EmailOutboundIpSummary other = (EmailOutboundIpSummary) o;
        return java.util.Objects.equals(this.outboundIp, other.outboundIp)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.assignmentState, other.assignmentState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.outboundIp == null ? 43 : this.outboundIp.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.assignmentState == null ? 43 : this.assignmentState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
