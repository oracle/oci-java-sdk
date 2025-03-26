/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The options for a plan execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "planExecutionType",
    defaultImpl = DrPlanExecutionOptions.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StopDrillExecutionOptions.class,
        name = "STOP_DRILL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SwitchoverExecutionOptions.class,
        name = "SWITCHOVER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FailoverPrecheckExecutionOptions.class,
        name = "FAILOVER_PRECHECK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StartDrillExecutionOptions.class,
        name = "START_DRILL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SwitchoverPrecheckExecutionOptions.class,
        name = "SWITCHOVER_PRECHECK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StartDrillPrecheckExecutionOptions.class,
        name = "START_DRILL_PRECHECK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StopDrillPrecheckExecutionOptions.class,
        name = "STOP_DRILL_PRECHECK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FailoverExecutionOptions.class,
        name = "FAILOVER"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DrPlanExecutionOptions extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected DrPlanExecutionOptions() {
        super();
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
        sb.append("DrPlanExecutionOptions(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanExecutionOptions)) {
            return false;
        }

        DrPlanExecutionOptions other = (DrPlanExecutionOptions) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of the plan execution.
     *
     **/
    public enum PlanExecutionType {
        Switchover("SWITCHOVER"),
        SwitchoverPrecheck("SWITCHOVER_PRECHECK"),
        Failover("FAILOVER"),
        FailoverPrecheck("FAILOVER_PRECHECK"),
        StartDrillPrecheck("START_DRILL_PRECHECK"),
        StartDrill("START_DRILL"),
        StopDrillPrecheck("STOP_DRILL_PRECHECK"),
        StopDrill("STOP_DRILL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlanExecutionType.class);

        private final String value;
        private static java.util.Map<String, PlanExecutionType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanExecutionType v : PlanExecutionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlanExecutionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
