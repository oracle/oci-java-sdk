/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Policy definition for the autoscale configuration.
 *
 * <p>An autoscaling policy is part of an autoscaling configuration. For more information, see
 * [Autoscaling](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-autoscale)
 *
 * <p>You can create following type of autoscaling policies:
 *
 * <p>- **MetricBasedVerticalScalingPolicy:** Vertical autoscaling action is triggered when a
 * performance metric exceeds a threshold - **MetricBasedHorizontalScalingPolicy:** Horizontal
 * autoscaling action is triggered when a performance metric exceeds a threshold -
 * **ScheduleBasedVerticalScalingPolicy:** Vertical autoscaling action is triggered at the specific
 * times that you schedule. - **ScheduleBasedHorizontalScalingPolicy:** Horizontal autoscaling
 * action is triggered at the specific times that you schedule.
 *
 * <p>An autoscaling configuration can have one of above supported policies. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "policyType",
        defaultImpl = AddAutoScalePolicyDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AddMetricBasedHorizontalScalingPolicyDetails.class,
            name = "METRIC_BASED_HORIZONTAL_SCALING_POLICY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AddScheduleBasedVerticalScalingPolicyDetails.class,
            name = "SCHEDULE_BASED_VERTICAL_SCALING_POLICY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AddScheduleBasedHorizontalScalingPolicyDetails.class,
            name = "SCHEDULE_BASED_HORIZONTAL_SCALING_POLICY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AddMetricBasedVerticalScalingPolicyDetails.class,
            name = "METRIC_BASED_VERTICAL_SCALING_POLICY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class AddAutoScalePolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected AddAutoScalePolicyDetails() {
        super();
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
        sb.append("AddAutoScalePolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddAutoScalePolicyDetails)) {
            return false;
        }

        AddAutoScalePolicyDetails other = (AddAutoScalePolicyDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
