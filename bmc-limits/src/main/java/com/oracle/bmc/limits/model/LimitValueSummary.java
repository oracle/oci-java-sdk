/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.model;

/**
 * The value of a specific resource limit.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LimitValueSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LimitValueSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "scopeType", "availabilityDomain", "value"})
    public LimitValueSummary(
            String name, ScopeType scopeType, String availabilityDomain, Long value) {
        super();
        this.name = name;
        this.scopeType = scopeType;
        this.availabilityDomain = availabilityDomain;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The resource limit name. To be used for writing policies (in case of quotas) or other programmatic calls.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The resource limit name. To be used for writing policies (in case of quotas) or other programmatic calls.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The scope type of the limit.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scopeType")
        private ScopeType scopeType;

        /**
         * The scope type of the limit.
         *
         * @param scopeType the value to set
         * @return this builder
         **/
        public Builder scopeType(ScopeType scopeType) {
            this.scopeType = scopeType;
            this.__explicitlySet__.add("scopeType");
            return this;
        }
        /**
         * If present, the returned value is only specific to this availability domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * If present, the returned value is only specific to this availability domain.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The resource limit value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Long value;

        /**
         * The resource limit value.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(Long value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitValueSummary build() {
            LimitValueSummary model =
                    new LimitValueSummary(
                            this.name, this.scopeType, this.availabilityDomain, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitValueSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("scopeType")) {
                this.scopeType(model.getScopeType());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
     * The resource limit name. To be used for writing policies (in case of quotas) or other programmatic calls.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The resource limit name. To be used for writing policies (in case of quotas) or other programmatic calls.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The scope type of the limit.
     *
     **/
    public enum ScopeType {
        Global("GLOBAL"),
        Region("REGION"),
        Ad("AD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScopeType.class);

        private final String value;
        private static java.util.Map<String, ScopeType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScopeType v : ScopeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScopeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScopeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScopeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The scope type of the limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopeType")
    private final ScopeType scopeType;

    /**
     * The scope type of the limit.
     *
     * @return the value
     **/
    public ScopeType getScopeType() {
        return scopeType;
    }

    /**
     * If present, the returned value is only specific to this availability domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * If present, the returned value is only specific to this availability domain.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The resource limit value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Long value;

    /**
     * The resource limit value.
     * @return the value
     **/
    public Long getValue() {
        return value;
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
        sb.append("LimitValueSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", scopeType=").append(String.valueOf(this.scopeType));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitValueSummary)) {
            return false;
        }

        LimitValueSummary other = (LimitValueSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.scopeType, other.scopeType)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.scopeType == null ? 43 : this.scopeType.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
