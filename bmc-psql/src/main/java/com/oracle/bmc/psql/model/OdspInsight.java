/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Details for a single ODSP insight. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OdspInsight.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OdspInsight extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"insightType", "retentionPeriodInDays"})
    public OdspInsight(InsightType insightType, Integer retentionPeriodInDays) {
        super();
        this.insightType = insightType;
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of Insight collected for the database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("insightType")
        private InsightType insightType;

        /**
         * Type of Insight collected for the database system.
         *
         * @param insightType the value to set
         * @return this builder
         */
        public Builder insightType(InsightType insightType) {
            this.insightType = insightType;
            this.__explicitlySet__.add("insightType");
            return this;
        }
        /**
         * Retention period for Insight data, in days. Current supported value is 7 days. the system
         * default is 7 days.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Integer retentionPeriodInDays;

        /**
         * Retention period for Insight data, in days. Current supported value is 7 days. the system
         * default is 7 days.
         *
         * @param retentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OdspInsight build() {
            OdspInsight model = new OdspInsight(this.insightType, this.retentionPeriodInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OdspInsight model) {
            if (model.wasPropertyExplicitlySet("insightType")) {
                this.insightType(model.getInsightType());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
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

    /** Type of Insight collected for the database system. */
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
    /** Type of Insight collected for the database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("insightType")
    private final InsightType insightType;

    /**
     * Type of Insight collected for the database system.
     *
     * @return the value
     */
    public InsightType getInsightType() {
        return insightType;
    }

    /**
     * Retention period for Insight data, in days. Current supported value is 7 days. the system
     * default is 7 days.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

    /**
     * Retention period for Insight data, in days. Current supported value is 7 days. the system
     * default is 7 days.
     *
     * @return the value
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
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
        sb.append("OdspInsight(");
        sb.append("super=").append(super.toString());
        sb.append("insightType=").append(String.valueOf(this.insightType));
        sb.append(", retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OdspInsight)) {
            return false;
        }

        OdspInsight other = (OdspInsight) o;
        return java.util.Objects.equals(this.insightType, other.insightType)
                && java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.insightType == null ? 43 : this.insightType.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInDays == null
                                ? 43
                                : this.retentionPeriodInDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
