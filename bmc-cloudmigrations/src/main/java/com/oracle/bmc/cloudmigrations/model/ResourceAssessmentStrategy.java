/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Migration strategy for the resource to be migrated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "strategyType",
        defaultImpl = ResourceAssessmentStrategy.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PeakResourceAssessmentStrategy.class,
            name = "PEAK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PercentileResourceAssessmentStrategy.class,
            name = "PERCENTILE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AverageResourceAssessmentStrategy.class,
            name = "AVERAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AsIsResourceAssessmentStrategy.class,
            name = "AS_IS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ResourceAssessmentStrategy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceType"})
    protected ResourceAssessmentStrategy(ResourceType resourceType) {
        super();
        this.resourceType = resourceType;
    }

    /** The type of resource. */
    public enum ResourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Cpu("CPU"),
        Memory("MEMORY"),
        All("ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceType.class);

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

    /**
     * The type of resource.
     *
     * @return the value
     */
    public ResourceType getResourceType() {
        return resourceType;
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
        sb.append("ResourceAssessmentStrategy(");
        sb.append("super=").append(super.toString());
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceAssessmentStrategy)) {
            return false;
        }

        ResourceAssessmentStrategy other = (ResourceAssessmentStrategy) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of strategy used for migration. */
    public enum StrategyType implements com.oracle.bmc.http.internal.BmcEnum {
        AsIs("AS_IS"),
        Average("AVERAGE"),
        Peak("PEAK"),
        Percentile("PERCENTILE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StrategyType.class);

        private final String value;
        private static java.util.Map<String, StrategyType> map;

        static {
            map = new java.util.HashMap<>();
            for (StrategyType v : StrategyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StrategyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StrategyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StrategyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
