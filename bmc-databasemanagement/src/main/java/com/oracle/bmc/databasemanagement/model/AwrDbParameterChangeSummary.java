/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbParameterChangeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDbParameterChangeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeBegin",
        "timeEnd",
        "instanceNumber",
        "previousValue",
        "value",
        "snapshotId",
        "valueModified",
        "isDefault"
    })
    public AwrDbParameterChangeSummary(
            java.util.Date timeBegin,
            java.util.Date timeEnd,
            Integer instanceNumber,
            String previousValue,
            String value,
            Integer snapshotId,
            String valueModified,
            Boolean isDefault) {
        super();
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.instanceNumber = instanceNumber;
        this.previousValue = previousValue;
        this.value = value;
        this.snapshotId = snapshotId;
        this.valueModified = valueModified;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The start time of the interval.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

        /**
         * The start time of the interval.
         * @param timeBegin the value to set
         * @return this builder
         **/
        public Builder timeBegin(java.util.Date timeBegin) {
            this.timeBegin = timeBegin;
            this.__explicitlySet__.add("timeBegin");
            return this;
        }
        /**
         * The end time of the interval.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end time of the interval.
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * The database instance number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        /**
         * The database instance number.
         * @param instanceNumber the value to set
         * @return this builder
         **/
        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }
        /**
         * The previous value of the database parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("previousValue")
        private String previousValue;

        /**
         * The previous value of the database parameter.
         * @param previousValue the value to set
         * @return this builder
         **/
        public Builder previousValue(String previousValue) {
            this.previousValue = previousValue;
            this.__explicitlySet__.add("previousValue");
            return this;
        }
        /**
         * The current value of the database parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The current value of the database parameter.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The ID of the snapshot with the parameter value changed. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
        private Integer snapshotId;

        /**
         * The ID of the snapshot with the parameter value changed. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
         *
         * @param snapshotId the value to set
         * @return this builder
         **/
        public Builder snapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            this.__explicitlySet__.add("snapshotId");
            return this;
        }
        /**
         * Indicates whether the parameter has been modified after instance startup:
         *  - MODIFIED - Parameter has been modified with ALTER SESSION
         *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
         *  - FALSE - Parameter has not been modified after instance startup
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
        private String valueModified;

        /**
         * Indicates whether the parameter has been modified after instance startup:
         *  - MODIFIED - Parameter has been modified with ALTER SESSION
         *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
         *  - FALSE - Parameter has not been modified after instance startup
         *
         * @param valueModified the value to set
         * @return this builder
         **/
        public Builder valueModified(String valueModified) {
            this.valueModified = valueModified;
            this.__explicitlySet__.add("valueModified");
            return this;
        }
        /**
         * Indicates whether the parameter value in the end snapshot is the default.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether the parameter value in the end snapshot is the default.
         * @param isDefault the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The start time of the interval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

    /**
     * The start time of the interval.
     * @return the value
     **/
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }

    /**
     * The end time of the interval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end time of the interval.
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * The database instance number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    private final Integer instanceNumber;

    /**
     * The database instance number.
     * @return the value
     **/
    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    /**
     * The previous value of the database parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("previousValue")
    private final String previousValue;

    /**
     * The previous value of the database parameter.
     * @return the value
     **/
    public String getPreviousValue() {
        return previousValue;
    }

    /**
     * The current value of the database parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The current value of the database parameter.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The ID of the snapshot with the parameter value changed. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
    private final Integer snapshotId;

    /**
     * The ID of the snapshot with the parameter value changed. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     * @return the value
     **/
    public Integer getSnapshotId() {
        return snapshotId;
    }

    /**
     * Indicates whether the parameter has been modified after instance startup:
     *  - MODIFIED - Parameter has been modified with ALTER SESSION
     *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
     *  - FALSE - Parameter has not been modified after instance startup
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
    private final String valueModified;

    /**
     * Indicates whether the parameter has been modified after instance startup:
     *  - MODIFIED - Parameter has been modified with ALTER SESSION
     *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
     *  - FALSE - Parameter has not been modified after instance startup
     *
     * @return the value
     **/
    public String getValueModified() {
        return valueModified;
    }

    /**
     * Indicates whether the parameter value in the end snapshot is the default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether the parameter value in the end snapshot is the default.
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrDbParameterChangeSummary(");
        sb.append("timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(", previousValue=").append(String.valueOf(this.previousValue));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", snapshotId=").append(String.valueOf(this.snapshotId));
        sb.append(", valueModified=").append(String.valueOf(this.valueModified));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbParameterChangeSummary)) {
            return false;
        }

        AwrDbParameterChangeSummary other = (AwrDbParameterChangeSummary) o;
        return java.util.Objects.equals(this.timeBegin, other.timeBegin)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(this.previousValue, other.previousValue)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.snapshotId, other.snapshotId)
                && java.util.Objects.equals(this.valueModified, other.valueModified)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.previousValue == null ? 43 : this.previousValue.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.snapshotId == null ? 43 : this.snapshotId.hashCode());
        result =
                (result * PRIME)
                        + (this.valueModified == null ? 43 : this.valueModified.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
