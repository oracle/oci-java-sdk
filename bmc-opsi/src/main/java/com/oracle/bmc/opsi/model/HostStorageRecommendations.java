/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains storage recommendation. <br>
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
        builder = HostStorageRecommendations.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricRecommendationName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostStorageRecommendations extends HostInsightHostRecommendations {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identify unused instances based on cpu, memory and network metrics. */
        @com.fasterxml.jackson.annotation.JsonProperty("unusedInstance")
        private UnusedInstance unusedInstance;

        /**
         * Identify unused instances based on cpu, memory and network metrics.
         *
         * @param unusedInstance the value to set
         * @return this builder
         */
        public Builder unusedInstance(UnusedInstance unusedInstance) {
            this.unusedInstance = unusedInstance;
            this.__explicitlySet__.add("unusedInstance");
            return this;
        }
        /** Identify if an instance is abandoned. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAbandonedInstance")
        private Boolean isAbandonedInstance;

        /**
         * Identify if an instance is abandoned.
         *
         * @param isAbandonedInstance the value to set
         * @return this builder
         */
        public Builder isAbandonedInstance(Boolean isAbandonedInstance) {
            this.isAbandonedInstance = isAbandonedInstance;
            this.__explicitlySet__.add("isAbandonedInstance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostStorageRecommendations build() {
            HostStorageRecommendations model =
                    new HostStorageRecommendations(this.unusedInstance, this.isAbandonedInstance);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostStorageRecommendations model) {
            if (model.wasPropertyExplicitlySet("unusedInstance")) {
                this.unusedInstance(model.getUnusedInstance());
            }
            if (model.wasPropertyExplicitlySet("isAbandonedInstance")) {
                this.isAbandonedInstance(model.getIsAbandonedInstance());
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

    @Deprecated
    public HostStorageRecommendations(UnusedInstance unusedInstance, Boolean isAbandonedInstance) {
        super();
        this.unusedInstance = unusedInstance;
        this.isAbandonedInstance = isAbandonedInstance;
    }

    /** Identify unused instances based on cpu, memory and network metrics. */
    public enum UnusedInstance implements com.oracle.bmc.http.internal.BmcEnum {
        InUse("IN_USE"),
        NotInUse("NOT_IN_USE"),
        IsNotDetermined("IS_NOT_DETERMINED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UnusedInstance.class);

        private final String value;
        private static java.util.Map<String, UnusedInstance> map;

        static {
            map = new java.util.HashMap<>();
            for (UnusedInstance v : UnusedInstance.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UnusedInstance(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UnusedInstance create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UnusedInstance', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Identify unused instances based on cpu, memory and network metrics. */
    @com.fasterxml.jackson.annotation.JsonProperty("unusedInstance")
    private final UnusedInstance unusedInstance;

    /**
     * Identify unused instances based on cpu, memory and network metrics.
     *
     * @return the value
     */
    public UnusedInstance getUnusedInstance() {
        return unusedInstance;
    }

    /** Identify if an instance is abandoned. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAbandonedInstance")
    private final Boolean isAbandonedInstance;

    /**
     * Identify if an instance is abandoned.
     *
     * @return the value
     */
    public Boolean getIsAbandonedInstance() {
        return isAbandonedInstance;
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
        sb.append("HostStorageRecommendations(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", unusedInstance=").append(String.valueOf(this.unusedInstance));
        sb.append(", isAbandonedInstance=").append(String.valueOf(this.isAbandonedInstance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostStorageRecommendations)) {
            return false;
        }

        HostStorageRecommendations other = (HostStorageRecommendations) o;
        return java.util.Objects.equals(this.unusedInstance, other.unusedInstance)
                && java.util.Objects.equals(this.isAbandonedInstance, other.isAbandonedInstance)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.unusedInstance == null ? 43 : this.unusedInstance.hashCode());
        result =
                (result * PRIME)
                        + (this.isAbandonedInstance == null
                                ? 43
                                : this.isAbandonedInstance.hashCode());
        return result;
    }
}
