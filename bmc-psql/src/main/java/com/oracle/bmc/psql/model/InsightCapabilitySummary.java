/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Describes supported insight types and their capabilities. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InsightCapabilitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InsightCapabilitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"insightType", "description", "dataTypeCapabilities"})
    public InsightCapabilitySummary(
            InsightType insightType,
            String description,
            java.util.List<InsightDataTypeCapability> dataTypeCapabilities) {
        super();
        this.insightType = insightType;
        this.description = description;
        this.dataTypeCapabilities = dataTypeCapabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Echo of the requested insight type. */
        @com.fasterxml.jackson.annotation.JsonProperty("insightType")
        private InsightType insightType;

        /**
         * Echo of the requested insight type.
         *
         * @param insightType the value to set
         * @return this builder
         */
        public Builder insightType(InsightType insightType) {
            this.insightType = insightType;
            this.__explicitlySet__.add("insightType");
            return this;
        }
        /** Human-readable description of the insight type. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Human-readable description of the insight type.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Supported insight data types for this insight type. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataTypeCapabilities")
        private java.util.List<InsightDataTypeCapability> dataTypeCapabilities;

        /**
         * Supported insight data types for this insight type.
         *
         * @param dataTypeCapabilities the value to set
         * @return this builder
         */
        public Builder dataTypeCapabilities(
                java.util.List<InsightDataTypeCapability> dataTypeCapabilities) {
            this.dataTypeCapabilities = dataTypeCapabilities;
            this.__explicitlySet__.add("dataTypeCapabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InsightCapabilitySummary build() {
            InsightCapabilitySummary model =
                    new InsightCapabilitySummary(
                            this.insightType, this.description, this.dataTypeCapabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InsightCapabilitySummary model) {
            if (model.wasPropertyExplicitlySet("insightType")) {
                this.insightType(model.getInsightType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dataTypeCapabilities")) {
                this.dataTypeCapabilities(model.getDataTypeCapabilities());
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

    /** Echo of the requested insight type. */
    public enum InsightType implements com.oracle.bmc.http.internal.BmcEnum {
        QueryInsight("QUERY_INSIGHT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InsightType.class);

        private final String value;
        private static java.util.Map<String, InsightType> map;

        static {
            map = new java.util.HashMap<>();
            for (InsightType v : InsightType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InsightType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InsightType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InsightType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Echo of the requested insight type. */
    @com.fasterxml.jackson.annotation.JsonProperty("insightType")
    private final InsightType insightType;

    /**
     * Echo of the requested insight type.
     *
     * @return the value
     */
    public InsightType getInsightType() {
        return insightType;
    }

    /** Human-readable description of the insight type. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Human-readable description of the insight type.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Supported insight data types for this insight type. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataTypeCapabilities")
    private final java.util.List<InsightDataTypeCapability> dataTypeCapabilities;

    /**
     * Supported insight data types for this insight type.
     *
     * @return the value
     */
    public java.util.List<InsightDataTypeCapability> getDataTypeCapabilities() {
        return dataTypeCapabilities;
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
        sb.append("InsightCapabilitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("insightType=").append(String.valueOf(this.insightType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dataTypeCapabilities=").append(String.valueOf(this.dataTypeCapabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InsightCapabilitySummary)) {
            return false;
        }

        InsightCapabilitySummary other = (InsightCapabilitySummary) o;
        return java.util.Objects.equals(this.insightType, other.insightType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dataTypeCapabilities, other.dataTypeCapabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.insightType == null ? 43 : this.insightType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.dataTypeCapabilities == null
                                ? 43
                                : this.dataTypeCapabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
