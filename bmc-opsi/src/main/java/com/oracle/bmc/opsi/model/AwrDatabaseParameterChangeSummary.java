/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * A summary of the changes made to a single AWR database parameter. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AwrDatabaseParameterChangeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrDatabaseParameterChangeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeBegin",
        "timeEnd",
        "instanceNumber",
        "previousValue",
        "value",
        "snapshotIdentifier",
        "valueModified",
        "isDefault"
    })
    public AwrDatabaseParameterChangeSummary(
            java.util.Date timeBegin,
            java.util.Date timeEnd,
            Integer instanceNumber,
            String previousValue,
            String value,
            Integer snapshotIdentifier,
            String valueModified,
            Boolean isDefault) {
        super();
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.instanceNumber = instanceNumber;
        this.previousValue = previousValue;
        this.value = value;
        this.snapshotIdentifier = snapshotIdentifier;
        this.valueModified = valueModified;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The start time of the interval. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

        /**
         * The start time of the interval.
         *
         * @param timeBegin the value to set
         * @return this builder
         */
        public Builder timeBegin(java.util.Date timeBegin) {
            this.timeBegin = timeBegin;
            this.__explicitlySet__.add("timeBegin");
            return this;
        }
        /** The end time of the interval. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end time of the interval.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** The database instance number. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        /**
         * The database instance number.
         *
         * @param instanceNumber the value to set
         * @return this builder
         */
        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }
        /** The previous value of the database parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("previousValue")
        private String previousValue;

        /**
         * The previous value of the database parameter.
         *
         * @param previousValue the value to set
         * @return this builder
         */
        public Builder previousValue(String previousValue) {
            this.previousValue = previousValue;
            this.__explicitlySet__.add("previousValue");
            return this;
        }
        /** The current value of the database parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The current value of the database parameter.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The ID of the snapshot with the parameter value changed. The snapshot identifier is not
         * the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can
         * be retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabaseSnapshots
         */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
        private Integer snapshotIdentifier;

        /**
         * The ID of the snapshot with the parameter value changed. The snapshot identifier is not
         * the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can
         * be retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabaseSnapshots
         *
         * @param snapshotIdentifier the value to set
         * @return this builder
         */
        public Builder snapshotIdentifier(Integer snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            this.__explicitlySet__.add("snapshotIdentifier");
            return this;
        }
        /**
         * Indicates whether the parameter has been modified after instance startup: - MODIFIED -
         * Parameter has been modified with ALTER SESSION - SYSTEM_MOD - Parameter has been modified
         * with ALTER SYSTEM (which causes all the currently logged in sessions values to be
         * modified) - FALSE - Parameter has not been modified after instance startup
         */
        @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
        private String valueModified;

        /**
         * Indicates whether the parameter has been modified after instance startup: - MODIFIED -
         * Parameter has been modified with ALTER SESSION - SYSTEM_MOD - Parameter has been modified
         * with ALTER SYSTEM (which causes all the currently logged in sessions values to be
         * modified) - FALSE - Parameter has not been modified after instance startup
         *
         * @param valueModified the value to set
         * @return this builder
         */
        public Builder valueModified(String valueModified) {
            this.valueModified = valueModified;
            this.__explicitlySet__.add("valueModified");
            return this;
        }
        /** Indicates whether the parameter value in the end snapshot is the default. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether the parameter value in the end snapshot is the default.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDatabaseParameterChangeSummary build() {
            AwrDatabaseParameterChangeSummary model =
                    new AwrDatabaseParameterChangeSummary(
                            this.timeBegin,
                            this.timeEnd,
                            this.instanceNumber,
                            this.previousValue,
                            this.value,
                            this.snapshotIdentifier,
                            this.valueModified,
                            this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDatabaseParameterChangeSummary model) {
            if (model.wasPropertyExplicitlySet("timeBegin")) {
                this.timeBegin(model.getTimeBegin());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("instanceNumber")) {
                this.instanceNumber(model.getInstanceNumber());
            }
            if (model.wasPropertyExplicitlySet("previousValue")) {
                this.previousValue(model.getPreviousValue());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("snapshotIdentifier")) {
                this.snapshotIdentifier(model.getSnapshotIdentifier());
            }
            if (model.wasPropertyExplicitlySet("valueModified")) {
                this.valueModified(model.getValueModified());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
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

    /** The start time of the interval. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

    /**
     * The start time of the interval.
     *
     * @return the value
     */
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }

    /** The end time of the interval. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end time of the interval.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** The database instance number. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    private final Integer instanceNumber;

    /**
     * The database instance number.
     *
     * @return the value
     */
    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    /** The previous value of the database parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("previousValue")
    private final String previousValue;

    /**
     * The previous value of the database parameter.
     *
     * @return the value
     */
    public String getPreviousValue() {
        return previousValue;
    }

    /** The current value of the database parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The current value of the database parameter.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The ID of the snapshot with the parameter value changed. The snapshot identifier is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabaseSnapshots
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
    private final Integer snapshotIdentifier;

    /**
     * The ID of the snapshot with the parameter value changed. The snapshot identifier is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabaseSnapshots
     *
     * @return the value
     */
    public Integer getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * Indicates whether the parameter has been modified after instance startup: - MODIFIED -
     * Parameter has been modified with ALTER SESSION - SYSTEM_MOD - Parameter has been modified
     * with ALTER SYSTEM (which causes all the currently logged in sessions values to be modified) -
     * FALSE - Parameter has not been modified after instance startup
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
    private final String valueModified;

    /**
     * Indicates whether the parameter has been modified after instance startup: - MODIFIED -
     * Parameter has been modified with ALTER SESSION - SYSTEM_MOD - Parameter has been modified
     * with ALTER SYSTEM (which causes all the currently logged in sessions values to be modified) -
     * FALSE - Parameter has not been modified after instance startup
     *
     * @return the value
     */
    public String getValueModified() {
        return valueModified;
    }

    /** Indicates whether the parameter value in the end snapshot is the default. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether the parameter value in the end snapshot is the default.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
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
        sb.append("AwrDatabaseParameterChangeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(", previousValue=").append(String.valueOf(this.previousValue));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", snapshotIdentifier=").append(String.valueOf(this.snapshotIdentifier));
        sb.append(", valueModified=").append(String.valueOf(this.valueModified));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDatabaseParameterChangeSummary)) {
            return false;
        }

        AwrDatabaseParameterChangeSummary other = (AwrDatabaseParameterChangeSummary) o;
        return java.util.Objects.equals(this.timeBegin, other.timeBegin)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(this.previousValue, other.previousValue)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.snapshotIdentifier, other.snapshotIdentifier)
                && java.util.Objects.equals(this.valueModified, other.valueModified)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && super.equals(other);
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
        result =
                (result * PRIME)
                        + (this.snapshotIdentifier == null
                                ? 43
                                : this.snapshotIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.valueModified == null ? 43 : this.valueModified.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
