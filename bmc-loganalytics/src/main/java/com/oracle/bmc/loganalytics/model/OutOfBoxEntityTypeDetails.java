/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A Single Entity Type Definition
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OutOfBoxEntityTypeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OutOfBoxEntityTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudType")
        private CloudType cloudType;

        public Builder cloudType(CloudType cloudType) {
            this.cloudType = cloudType;
            this.__explicitlySet__.add("cloudType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<EntityTypeProperty> properties;

        public Builder properties(java.util.List<EntityTypeProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OutOfBoxEntityTypeDetails build() {
            OutOfBoxEntityTypeDetails __instance__ =
                    new OutOfBoxEntityTypeDetails(
                            name, internalName, category, cloudType, properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OutOfBoxEntityTypeDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .internalName(o.getInternalName())
                            .category(o.getCategory())
                            .cloudType(o.getCloudType())
                            .properties(o.getProperties());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Log analytics entity type name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Internal name for the log analytics entity type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalName")
    String internalName;

    /**
     * Log analytics entity type category. Category will be used for grouping and filtering.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    String category;
    /**
     * Log analytics entity type group. Supported values: ClOUD, NON_CLOUD.
     *
     **/
    public enum CloudType {
        Cloud("CLOUD"),
        NonCloud("NON_CLOUD"),
        ;

        private final String value;
        private static java.util.Map<String, CloudType> map;

        static {
            map = new java.util.HashMap<>();
            for (CloudType v : CloudType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CloudType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CloudType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CloudType: " + key);
        }
    };
    /**
     * Log analytics entity type group. Supported values: ClOUD, NON_CLOUD.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudType")
    CloudType cloudType;

    /**
     * A Single Entity Type Property Definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.List<EntityTypeProperty> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
