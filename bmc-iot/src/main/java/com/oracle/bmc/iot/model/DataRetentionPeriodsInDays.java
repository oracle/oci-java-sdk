/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Data Retention periods <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataRetentionPeriodsInDays.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataRetentionPeriodsInDays
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "rawData",
        "rejectedData",
        "historizedData",
        "rawCommandData"
    })
    public DataRetentionPeriodsInDays(
            Integer rawData, Integer rejectedData, Integer historizedData, Integer rawCommandData) {
        super();
        this.rawData = rawData;
        this.rejectedData = rejectedData;
        this.historizedData = historizedData;
        this.rawCommandData = rawCommandData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of days for which any raw data sent to IoT devices would be retained for. */
        @com.fasterxml.jackson.annotation.JsonProperty("rawData")
        private Integer rawData;

        /**
         * Number of days for which any raw data sent to IoT devices would be retained for.
         *
         * @param rawData the value to set
         * @return this builder
         */
        public Builder rawData(Integer rawData) {
            this.rawData = rawData;
            this.__explicitlySet__.add("rawData");
            return this;
        }
        /** Number of days for which any data sent to IoT devices would be retained for. */
        @com.fasterxml.jackson.annotation.JsonProperty("rejectedData")
        private Integer rejectedData;

        /**
         * Number of days for which any data sent to IoT devices would be retained for.
         *
         * @param rejectedData the value to set
         * @return this builder
         */
        public Builder rejectedData(Integer rejectedData) {
            this.rejectedData = rejectedData;
            this.__explicitlySet__.add("rejectedData");
            return this;
        }
        /**
         * Number of days for which any normalized data sent to IoT devices would be retained for.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("historizedData")
        private Integer historizedData;

        /**
         * Number of days for which any normalized data sent to IoT devices would be retained for.
         *
         * @param historizedData the value to set
         * @return this builder
         */
        public Builder historizedData(Integer historizedData) {
            this.historizedData = historizedData;
            this.__explicitlySet__.add("historizedData");
            return this;
        }
        /**
         * Number of days for which any raw command data sent to IoT devices would be retained for.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rawCommandData")
        private Integer rawCommandData;

        /**
         * Number of days for which any raw command data sent to IoT devices would be retained for.
         *
         * @param rawCommandData the value to set
         * @return this builder
         */
        public Builder rawCommandData(Integer rawCommandData) {
            this.rawCommandData = rawCommandData;
            this.__explicitlySet__.add("rawCommandData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataRetentionPeriodsInDays build() {
            DataRetentionPeriodsInDays model =
                    new DataRetentionPeriodsInDays(
                            this.rawData,
                            this.rejectedData,
                            this.historizedData,
                            this.rawCommandData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataRetentionPeriodsInDays model) {
            if (model.wasPropertyExplicitlySet("rawData")) {
                this.rawData(model.getRawData());
            }
            if (model.wasPropertyExplicitlySet("rejectedData")) {
                this.rejectedData(model.getRejectedData());
            }
            if (model.wasPropertyExplicitlySet("historizedData")) {
                this.historizedData(model.getHistorizedData());
            }
            if (model.wasPropertyExplicitlySet("rawCommandData")) {
                this.rawCommandData(model.getRawCommandData());
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

    /** Number of days for which any raw data sent to IoT devices would be retained for. */
    @com.fasterxml.jackson.annotation.JsonProperty("rawData")
    private final Integer rawData;

    /**
     * Number of days for which any raw data sent to IoT devices would be retained for.
     *
     * @return the value
     */
    public Integer getRawData() {
        return rawData;
    }

    /** Number of days for which any data sent to IoT devices would be retained for. */
    @com.fasterxml.jackson.annotation.JsonProperty("rejectedData")
    private final Integer rejectedData;

    /**
     * Number of days for which any data sent to IoT devices would be retained for.
     *
     * @return the value
     */
    public Integer getRejectedData() {
        return rejectedData;
    }

    /** Number of days for which any normalized data sent to IoT devices would be retained for. */
    @com.fasterxml.jackson.annotation.JsonProperty("historizedData")
    private final Integer historizedData;

    /**
     * Number of days for which any normalized data sent to IoT devices would be retained for.
     *
     * @return the value
     */
    public Integer getHistorizedData() {
        return historizedData;
    }

    /** Number of days for which any raw command data sent to IoT devices would be retained for. */
    @com.fasterxml.jackson.annotation.JsonProperty("rawCommandData")
    private final Integer rawCommandData;

    /**
     * Number of days for which any raw command data sent to IoT devices would be retained for.
     *
     * @return the value
     */
    public Integer getRawCommandData() {
        return rawCommandData;
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
        sb.append("DataRetentionPeriodsInDays(");
        sb.append("super=").append(super.toString());
        sb.append("rawData=").append(String.valueOf(this.rawData));
        sb.append(", rejectedData=").append(String.valueOf(this.rejectedData));
        sb.append(", historizedData=").append(String.valueOf(this.historizedData));
        sb.append(", rawCommandData=").append(String.valueOf(this.rawCommandData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataRetentionPeriodsInDays)) {
            return false;
        }

        DataRetentionPeriodsInDays other = (DataRetentionPeriodsInDays) o;
        return java.util.Objects.equals(this.rawData, other.rawData)
                && java.util.Objects.equals(this.rejectedData, other.rejectedData)
                && java.util.Objects.equals(this.historizedData, other.historizedData)
                && java.util.Objects.equals(this.rawCommandData, other.rawCommandData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rawData == null ? 43 : this.rawData.hashCode());
        result = (result * PRIME) + (this.rejectedData == null ? 43 : this.rejectedData.hashCode());
        result =
                (result * PRIME)
                        + (this.historizedData == null ? 43 : this.historizedData.hashCode());
        result =
                (result * PRIME)
                        + (this.rawCommandData == null ? 43 : this.rawCommandData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
