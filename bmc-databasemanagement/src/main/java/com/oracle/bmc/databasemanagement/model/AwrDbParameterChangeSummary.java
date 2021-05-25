/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the changes made to a single AWR database parameter.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbParameterChangeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AwrDbParameterChangeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

        public Builder timeBegin(java.util.Date timeBegin) {
            this.timeBegin = timeBegin;
            this.__explicitlySet__.add("timeBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("previousValue")
        private String previousValue;

        public Builder previousValue(String previousValue) {
            this.previousValue = previousValue;
            this.__explicitlySet__.add("previousValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
        private Integer snapshotId;

        public Builder snapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            this.__explicitlySet__.add("snapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
        private String valueModified;

        public Builder valueModified(String valueModified) {
            this.valueModified = valueModified;
            this.__explicitlySet__.add("valueModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbParameterChangeSummary build() {
            AwrDbParameterChangeSummary __instance__ =
                    new AwrDbParameterChangeSummary(
                            timeBegin,
                            timeEnd,
                            instanceNumber,
                            previousValue,
                            value,
                            snapshotId,
                            valueModified,
                            isDefault);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbParameterChangeSummary o) {
            Builder copiedBuilder =
                    timeBegin(o.getTimeBegin())
                            .timeEnd(o.getTimeEnd())
                            .instanceNumber(o.getInstanceNumber())
                            .previousValue(o.getPreviousValue())
                            .value(o.getValue())
                            .snapshotId(o.getSnapshotId())
                            .valueModified(o.getValueModified())
                            .isDefault(o.getIsDefault());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The start time of the interval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    java.util.Date timeBegin;

    /**
     * The end time of the interval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * The database instance number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    Integer instanceNumber;

    /**
     * The previous value of the database parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("previousValue")
    String previousValue;

    /**
     * The current value of the database parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * The ID of the snapshot with the parameter value changed. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
    Integer snapshotId;

    /**
     * Indicates whether the parameter has been modified after instance startup:
     *  - MODIFIED - Parameter has been modified with ALTER SESSION
     *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
     *  - FALSE - Parameter has not been modified after instance startup
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
    String valueModified;

    /**
     * Indicates whether the parameter value in the end snapshot is the default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    Boolean isDefault;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
