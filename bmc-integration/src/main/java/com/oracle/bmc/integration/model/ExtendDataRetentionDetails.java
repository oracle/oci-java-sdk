/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Details for extending data retention for given integration instance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtendDataRetentionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtendDataRetentionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dataRetentionPeriod"})
    public ExtendDataRetentionDetails(DataRetentionPeriod dataRetentionPeriod) {
        super();
        this.dataRetentionPeriod = dataRetentionPeriod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Data retention period set for given integration instance */
        @com.fasterxml.jackson.annotation.JsonProperty("dataRetentionPeriod")
        private DataRetentionPeriod dataRetentionPeriod;

        /**
         * Data retention period set for given integration instance
         *
         * @param dataRetentionPeriod the value to set
         * @return this builder
         */
        public Builder dataRetentionPeriod(DataRetentionPeriod dataRetentionPeriod) {
            this.dataRetentionPeriod = dataRetentionPeriod;
            this.__explicitlySet__.add("dataRetentionPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtendDataRetentionDetails build() {
            ExtendDataRetentionDetails model =
                    new ExtendDataRetentionDetails(this.dataRetentionPeriod);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtendDataRetentionDetails model) {
            if (model.wasPropertyExplicitlySet("dataRetentionPeriod")) {
                this.dataRetentionPeriod(model.getDataRetentionPeriod());
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

    /** Data retention period set for given integration instance */
    public enum DataRetentionPeriod implements com.oracle.bmc.http.internal.BmcEnum {
        Months1("MONTHS_1"),
        Months3("MONTHS_3"),
        Months6("MONTHS_6"),
        ;

        private final String value;
        private static java.util.Map<String, DataRetentionPeriod> map;

        static {
            map = new java.util.HashMap<>();
            for (DataRetentionPeriod v : DataRetentionPeriod.values()) {
                map.put(v.getValue(), v);
            }
        }

        DataRetentionPeriod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataRetentionPeriod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DataRetentionPeriod: " + key);
        }
    };
    /** Data retention period set for given integration instance */
    @com.fasterxml.jackson.annotation.JsonProperty("dataRetentionPeriod")
    private final DataRetentionPeriod dataRetentionPeriod;

    /**
     * Data retention period set for given integration instance
     *
     * @return the value
     */
    public DataRetentionPeriod getDataRetentionPeriod() {
        return dataRetentionPeriod;
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
        sb.append("ExtendDataRetentionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dataRetentionPeriod=").append(String.valueOf(this.dataRetentionPeriod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtendDataRetentionDetails)) {
            return false;
        }

        ExtendDataRetentionDetails other = (ExtendDataRetentionDetails) o;
        return java.util.Objects.equals(this.dataRetentionPeriod, other.dataRetentionPeriod)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataRetentionPeriod == null
                                ? 43
                                : this.dataRetentionPeriod.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
