/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The options for a plan execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "planExecutionType",
        defaultImpl = DrPlanExecutionOptionDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StopDrillPrecheckExecutionOptionDetails.class,
            name = "STOP_DRILL_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SwitchoverPrecheckExecutionOptionDetails.class,
            name = "SWITCHOVER_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StopDrillExecutionOptionDetails.class,
            name = "STOP_DRILL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FailoverPrecheckExecutionOptionDetails.class,
            name = "FAILOVER_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StartDrillExecutionOptionDetails.class,
            name = "START_DRILL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StartDrillPrecheckExecutionOptionDetails.class,
            name = "START_DRILL_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SwitchoverExecutionOptionDetails.class,
            name = "SWITCHOVER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FailoverExecutionOptionDetails.class,
            name = "FAILOVER")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DrPlanExecutionOptionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected DrPlanExecutionOptionDetails() {
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
        sb.append("DrPlanExecutionOptionDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanExecutionOptionDetails)) {
            return false;
        }

        DrPlanExecutionOptionDetails other = (DrPlanExecutionOptionDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the plan execution. */
    public enum PlanExecutionType implements com.oracle.bmc.http.internal.BmcEnum {
        Switchover("SWITCHOVER"),
        SwitchoverPrecheck("SWITCHOVER_PRECHECK"),
        Failover("FAILOVER"),
        FailoverPrecheck("FAILOVER_PRECHECK"),
        StartDrill("START_DRILL"),
        StartDrillPrecheck("START_DRILL_PRECHECK"),
        StopDrill("STOP_DRILL"),
        StopDrillPrecheck("STOP_DRILL_PRECHECK"),
        ;

        private final String value;
        private static java.util.Map<String, PlanExecutionType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanExecutionType v : PlanExecutionType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PlanExecutionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanExecutionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PlanExecutionType: " + key);
        }
    };
}
