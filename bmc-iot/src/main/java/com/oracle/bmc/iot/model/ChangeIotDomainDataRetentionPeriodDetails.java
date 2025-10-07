/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * The configuration details for data retention periods. <br>
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
        builder = ChangeIotDomainDataRetentionPeriodDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChangeIotDomainDataRetentionPeriodDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "dataRetentionPeriodInDays"})
    public ChangeIotDomainDataRetentionPeriodDetails(Type type, Integer dataRetentionPeriodInDays) {
        super();
        this.type = type;
        this.dataRetentionPeriodInDays = dataRetentionPeriodInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of data retention period to apply. Allowed values are RAW_DATA, REJECTED_DATA,
         * HISTORIZED_DATA, and RAW_COMMAND_DATA.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of data retention period to apply. Allowed values are RAW_DATA, REJECTED_DATA,
         * HISTORIZED_DATA, and RAW_COMMAND_DATA.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The duration (in days) for which data will be retained in the IoT domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataRetentionPeriodInDays")
        private Integer dataRetentionPeriodInDays;

        /**
         * The duration (in days) for which data will be retained in the IoT domain.
         *
         * @param dataRetentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder dataRetentionPeriodInDays(Integer dataRetentionPeriodInDays) {
            this.dataRetentionPeriodInDays = dataRetentionPeriodInDays;
            this.__explicitlySet__.add("dataRetentionPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeIotDomainDataRetentionPeriodDetails build() {
            ChangeIotDomainDataRetentionPeriodDetails model =
                    new ChangeIotDomainDataRetentionPeriodDetails(
                            this.type, this.dataRetentionPeriodInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeIotDomainDataRetentionPeriodDetails model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("dataRetentionPeriodInDays")) {
                this.dataRetentionPeriodInDays(model.getDataRetentionPeriodInDays());
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

    /**
     * The type of data retention period to apply. Allowed values are RAW_DATA, REJECTED_DATA,
     * HISTORIZED_DATA, and RAW_COMMAND_DATA.
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        RawData("RAW_DATA"),
        RejectedData("REJECTED_DATA"),
        HistorizedData("HISTORIZED_DATA"),
        RawCommandData("RAW_COMMAND_DATA"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * The type of data retention period to apply. Allowed values are RAW_DATA, REJECTED_DATA,
     * HISTORIZED_DATA, and RAW_COMMAND_DATA.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of data retention period to apply. Allowed values are RAW_DATA, REJECTED_DATA,
     * HISTORIZED_DATA, and RAW_COMMAND_DATA.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** The duration (in days) for which data will be retained in the IoT domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataRetentionPeriodInDays")
    private final Integer dataRetentionPeriodInDays;

    /**
     * The duration (in days) for which data will be retained in the IoT domain.
     *
     * @return the value
     */
    public Integer getDataRetentionPeriodInDays() {
        return dataRetentionPeriodInDays;
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
        sb.append("ChangeIotDomainDataRetentionPeriodDetails(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", dataRetentionPeriodInDays=")
                .append(String.valueOf(this.dataRetentionPeriodInDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeIotDomainDataRetentionPeriodDetails)) {
            return false;
        }

        ChangeIotDomainDataRetentionPeriodDetails other =
                (ChangeIotDomainDataRetentionPeriodDetails) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(
                        this.dataRetentionPeriodInDays, other.dataRetentionPeriodInDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.dataRetentionPeriodInDays == null
                                ? 43
                                : this.dataRetentionPeriodInDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
