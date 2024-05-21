/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Initialization parameters for a database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DBParameters.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DBParameters extends DatabaseConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Database instance number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        /**
         * Database instance number.
         * @param instanceNumber the value to set
         * @return this builder
         **/
        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }
        /**
         * Database parameter name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
        private String parameterName;

        /**
         * Database parameter name.
         * @param parameterName the value to set
         * @return this builder
         **/
        public Builder parameterName(String parameterName) {
            this.parameterName = parameterName;
            this.__explicitlySet__.add("parameterName");
            return this;
        }
        /**
         * Database parameter value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
        private String parameterValue;

        /**
         * Database parameter value.
         * @param parameterValue the value to set
         * @return this builder
         **/
        public Builder parameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            this.__explicitlySet__.add("parameterValue");
            return this;
        }
        /**
         * AWR snapshot id for the parameter value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
        private Integer snapshotId;

        /**
         * AWR snapshot id for the parameter value
         * @param snapshotId the value to set
         * @return this builder
         **/
        public Builder snapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            this.__explicitlySet__.add("snapshotId");
            return this;
        }
        /**
         * Indicates whether the parameter's value changed in given snapshot or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isChanged")
        private String isChanged;

        /**
         * Indicates whether the parameter's value changed in given snapshot or not.
         * @param isChanged the value to set
         * @return this builder
         **/
        public Builder isChanged(String isChanged) {
            this.isChanged = isChanged;
            this.__explicitlySet__.add("isChanged");
            return this;
        }
        /**
         * Indicates whether this value is the default value or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private String isDefault;

        /**
         * Indicates whether this value is the default value or not.
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(String isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DBParameters build() {
            DBParameters model =
                    new DBParameters(
                            this.timeCollected,
                            this.instanceNumber,
                            this.parameterName,
                            this.parameterValue,
                            this.snapshotId,
                            this.isChanged,
                            this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DBParameters model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("instanceNumber")) {
                this.instanceNumber(model.getInstanceNumber());
            }
            if (model.wasPropertyExplicitlySet("parameterName")) {
                this.parameterName(model.getParameterName());
            }
            if (model.wasPropertyExplicitlySet("parameterValue")) {
                this.parameterValue(model.getParameterValue());
            }
            if (model.wasPropertyExplicitlySet("snapshotId")) {
                this.snapshotId(model.getSnapshotId());
            }
            if (model.wasPropertyExplicitlySet("isChanged")) {
                this.isChanged(model.getIsChanged());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            return this;
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

    @Deprecated
    public DBParameters(
            java.util.Date timeCollected,
            Integer instanceNumber,
            String parameterName,
            String parameterValue,
            Integer snapshotId,
            String isChanged,
            String isDefault) {
        super(timeCollected);
        this.instanceNumber = instanceNumber;
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
        this.snapshotId = snapshotId;
        this.isChanged = isChanged;
        this.isDefault = isDefault;
    }

    /**
     * Database instance number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    private final Integer instanceNumber;

    /**
     * Database instance number.
     * @return the value
     **/
    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    /**
     * Database parameter name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
    private final String parameterName;

    /**
     * Database parameter name.
     * @return the value
     **/
    public String getParameterName() {
        return parameterName;
    }

    /**
     * Database parameter value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
    private final String parameterValue;

    /**
     * Database parameter value.
     * @return the value
     **/
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * AWR snapshot id for the parameter value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
    private final Integer snapshotId;

    /**
     * AWR snapshot id for the parameter value
     * @return the value
     **/
    public Integer getSnapshotId() {
        return snapshotId;
    }

    /**
     * Indicates whether the parameter's value changed in given snapshot or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isChanged")
    private final String isChanged;

    /**
     * Indicates whether the parameter's value changed in given snapshot or not.
     * @return the value
     **/
    public String getIsChanged() {
        return isChanged;
    }

    /**
     * Indicates whether this value is the default value or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final String isDefault;

    /**
     * Indicates whether this value is the default value or not.
     * @return the value
     **/
    public String getIsDefault() {
        return isDefault;
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
        sb.append("DBParameters(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(", parameterName=").append(String.valueOf(this.parameterName));
        sb.append(", parameterValue=").append(String.valueOf(this.parameterValue));
        sb.append(", snapshotId=").append(String.valueOf(this.snapshotId));
        sb.append(", isChanged=").append(String.valueOf(this.isChanged));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DBParameters)) {
            return false;
        }

        DBParameters other = (DBParameters) o;
        return java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(this.parameterName, other.parameterName)
                && java.util.Objects.equals(this.parameterValue, other.parameterValue)
                && java.util.Objects.equals(this.snapshotId, other.snapshotId)
                && java.util.Objects.equals(this.isChanged, other.isChanged)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterName == null ? 43 : this.parameterName.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterValue == null ? 43 : this.parameterValue.hashCode());
        result = (result * PRIME) + (this.snapshotId == null ? 43 : this.snapshotId.hashCode());
        result = (result * PRIME) + (this.isChanged == null ? 43 : this.isChanged.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        return result;
    }
}
