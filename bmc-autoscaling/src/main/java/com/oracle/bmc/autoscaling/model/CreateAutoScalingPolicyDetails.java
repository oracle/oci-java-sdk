/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * Creation details for an autoscaling policy. You can create the following types of autoscaling policies:
 * <p>
 * - **Schedule-based:** Autoscaling events take place at the specific times that you schedule.
 * - **Threshold-based:** An autoscaling action is triggered when a performance metric meets
 * or exceeds a threshold.
 * <p>
 * An autoscaling configuration can either have multiple schedule-based autoscaling policies, or one
 * threshold-based autoscaling policy.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType",
    defaultImpl = CreateAutoScalingPolicyDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateScheduledPolicyDetails.class,
        name = "scheduled"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateThresholdPolicyDetails.class,
        name = "threshold"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateAutoScalingPolicyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"capacity", "displayName", "isEnabled"})
    protected CreateAutoScalingPolicyDetails(
            Capacity capacity, String displayName, Boolean isEnabled) {
        super();
        this.capacity = capacity;
        this.displayName = displayName;
        this.isEnabled = isEnabled;
    }

    /**
     * The capacity requirements of the autoscaling policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Capacity capacity;

    /**
     * The capacity requirements of the autoscaling policy.
     * @return the value
     **/
    public Capacity getCapacity() {
        return capacity;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Whether the autoscaling policy is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether the autoscaling policy is enabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
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
        sb.append("CreateAutoScalingPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("capacity=").append(String.valueOf(this.capacity));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutoScalingPolicyDetails)) {
            return false;
        }

        CreateAutoScalingPolicyDetails other = (CreateAutoScalingPolicyDetails) o;
        return java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
