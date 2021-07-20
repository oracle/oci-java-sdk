/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties to configure reading from an Oracle Database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BiccReadAttributes.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BiccReadAttributes extends AbstractReadAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fetchSize")
        private Integer fetchSize;

        public Builder fetchSize(Integer fetchSize) {
            this.fetchSize = fetchSize;
            this.__explicitlySet__.add("fetchSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extractStrategy")
        private ExtractStrategy extractStrategy;

        public Builder extractStrategy(ExtractStrategy extractStrategy) {
            this.extractStrategy = extractStrategy;
            this.__explicitlySet__.add("extractStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalStorage")
        private ExternalStorage externalStorage;

        public Builder externalStorage(ExternalStorage externalStorage) {
            this.externalStorage = externalStorage;
            this.__explicitlySet__.add("externalStorage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialExtractDate")
        private java.util.Date initialExtractDate;

        public Builder initialExtractDate(java.util.Date initialExtractDate) {
            this.initialExtractDate = initialExtractDate;
            this.__explicitlySet__.add("initialExtractDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastExtractDate")
        private java.util.Date lastExtractDate;

        public Builder lastExtractDate(java.util.Date lastExtractDate) {
            this.lastExtractDate = lastExtractDate;
            this.__explicitlySet__.add("lastExtractDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BiccReadAttributes build() {
            BiccReadAttributes __instance__ =
                    new BiccReadAttributes(
                            fetchSize,
                            extractStrategy,
                            externalStorage,
                            initialExtractDate,
                            lastExtractDate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BiccReadAttributes o) {
            Builder copiedBuilder =
                    fetchSize(o.getFetchSize())
                            .extractStrategy(o.getExtractStrategy())
                            .externalStorage(o.getExternalStorage())
                            .initialExtractDate(o.getInitialExtractDate())
                            .lastExtractDate(o.getLastExtractDate());

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

    @Deprecated
    public BiccReadAttributes(
            Integer fetchSize,
            ExtractStrategy extractStrategy,
            ExternalStorage externalStorage,
            java.util.Date initialExtractDate,
            java.util.Date lastExtractDate) {
        super();
        this.fetchSize = fetchSize;
        this.extractStrategy = extractStrategy;
        this.externalStorage = externalStorage;
        this.initialExtractDate = initialExtractDate;
        this.lastExtractDate = lastExtractDate;
    }

    /**
     * The fetch size for reading.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchSize")
    Integer fetchSize;
    /**
     * Extraction Strategy - FULL|INCREMENTAL
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ExtractStrategy {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ExtractStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (ExtractStrategy v : ExtractStrategy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExtractStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExtractStrategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExtractStrategy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Extraction Strategy - FULL|INCREMENTAL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extractStrategy")
    ExtractStrategy extractStrategy;

    @com.fasterxml.jackson.annotation.JsonProperty("externalStorage")
    ExternalStorage externalStorage;

    /**
     * Date from where extract should start
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialExtractDate")
    java.util.Date initialExtractDate;

    /**
     * Date last extracted
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastExtractDate")
    java.util.Date lastExtractDate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
