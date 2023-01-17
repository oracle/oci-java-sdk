/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Information regarding how/what row reduction methods will be applied. If this property is not present or is null, then it means row reduction is not applied.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RowReductionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RowReductionDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isReductionEnabled",
        "reductionPercentage",
        "reductionMethod"
    })
    public RowReductionDetails(
            Boolean isReductionEnabled,
            Double reductionPercentage,
            ReductionMethod reductionMethod) {
        super();
        this.isReductionEnabled = isReductionEnabled;
        this.reductionPercentage = reductionPercentage;
        this.reductionMethod = reductionMethod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A boolean value to indicate if row reduction is applied
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReductionEnabled")
        private Boolean isReductionEnabled;

        /**
         * A boolean value to indicate if row reduction is applied
         * @param isReductionEnabled the value to set
         * @return this builder
         **/
        public Builder isReductionEnabled(Boolean isReductionEnabled) {
            this.isReductionEnabled = isReductionEnabled;
            this.__explicitlySet__.add("isReductionEnabled");
            return this;
        }
        /**
         * A percentage to reduce data size down to on top of original data
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reductionPercentage")
        private Double reductionPercentage;

        /**
         * A percentage to reduce data size down to on top of original data
         * @param reductionPercentage the value to set
         * @return this builder
         **/
        public Builder reductionPercentage(Double reductionPercentage) {
            this.reductionPercentage = reductionPercentage;
            this.__explicitlySet__.add("reductionPercentage");
            return this;
        }
        /**
         * Method for row reduction:
         *   * DELETE_ROW - delete rows with equal intervals
         *   * AVERAGE_ROW - average multiple rows to one row
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reductionMethod")
        private ReductionMethod reductionMethod;

        /**
         * Method for row reduction:
         *   * DELETE_ROW - delete rows with equal intervals
         *   * AVERAGE_ROW - average multiple rows to one row
         *
         * @param reductionMethod the value to set
         * @return this builder
         **/
        public Builder reductionMethod(ReductionMethod reductionMethod) {
            this.reductionMethod = reductionMethod;
            this.__explicitlySet__.add("reductionMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RowReductionDetails build() {
            RowReductionDetails model =
                    new RowReductionDetails(
                            this.isReductionEnabled,
                            this.reductionPercentage,
                            this.reductionMethod);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RowReductionDetails model) {
            if (model.wasPropertyExplicitlySet("isReductionEnabled")) {
                this.isReductionEnabled(model.getIsReductionEnabled());
            }
            if (model.wasPropertyExplicitlySet("reductionPercentage")) {
                this.reductionPercentage(model.getReductionPercentage());
            }
            if (model.wasPropertyExplicitlySet("reductionMethod")) {
                this.reductionMethod(model.getReductionMethod());
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

    /**
     * A boolean value to indicate if row reduction is applied
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReductionEnabled")
    private final Boolean isReductionEnabled;

    /**
     * A boolean value to indicate if row reduction is applied
     * @return the value
     **/
    public Boolean getIsReductionEnabled() {
        return isReductionEnabled;
    }

    /**
     * A percentage to reduce data size down to on top of original data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reductionPercentage")
    private final Double reductionPercentage;

    /**
     * A percentage to reduce data size down to on top of original data
     * @return the value
     **/
    public Double getReductionPercentage() {
        return reductionPercentage;
    }

    /**
     * Method for row reduction:
     *   * DELETE_ROW - delete rows with equal intervals
     *   * AVERAGE_ROW - average multiple rows to one row
     *
     **/
    public enum ReductionMethod {
        DeleteRow("DELETE_ROW"),
        AverageRow("AVERAGE_ROW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReductionMethod.class);

        private final String value;
        private static java.util.Map<String, ReductionMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (ReductionMethod v : ReductionMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReductionMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReductionMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReductionMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Method for row reduction:
     *   * DELETE_ROW - delete rows with equal intervals
     *   * AVERAGE_ROW - average multiple rows to one row
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reductionMethod")
    private final ReductionMethod reductionMethod;

    /**
     * Method for row reduction:
     *   * DELETE_ROW - delete rows with equal intervals
     *   * AVERAGE_ROW - average multiple rows to one row
     *
     * @return the value
     **/
    public ReductionMethod getReductionMethod() {
        return reductionMethod;
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
        sb.append("RowReductionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isReductionEnabled=").append(String.valueOf(this.isReductionEnabled));
        sb.append(", reductionPercentage=").append(String.valueOf(this.reductionPercentage));
        sb.append(", reductionMethod=").append(String.valueOf(this.reductionMethod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RowReductionDetails)) {
            return false;
        }

        RowReductionDetails other = (RowReductionDetails) o;
        return java.util.Objects.equals(this.isReductionEnabled, other.isReductionEnabled)
                && java.util.Objects.equals(this.reductionPercentage, other.reductionPercentage)
                && java.util.Objects.equals(this.reductionMethod, other.reductionMethod)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isReductionEnabled == null
                                ? 43
                                : this.isReductionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.reductionPercentage == null
                                ? 43
                                : this.reductionPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.reductionMethod == null ? 43 : this.reductionMethod.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
