/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BiccReadAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BiccReadAttributes extends AbstractReadAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The fetch size for reading.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fetchSize")
        private Integer fetchSize;

        /**
         * The fetch size for reading.
         * @param fetchSize the value to set
         * @return this builder
         **/
        public Builder fetchSize(Integer fetchSize) {
            this.fetchSize = fetchSize;
            this.__explicitlySet__.add("fetchSize");
            return this;
        }
        /**
         * Extraction Strategy - FULL|INCREMENTAL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extractStrategy")
        private ExtractStrategy extractStrategy;

        /**
         * Extraction Strategy - FULL|INCREMENTAL
         * @param extractStrategy the value to set
         * @return this builder
         **/
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
        /**
         * Date from where extract should start
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialExtractDate")
        private java.util.Date initialExtractDate;

        /**
         * Date from where extract should start
         * @param initialExtractDate the value to set
         * @return this builder
         **/
        public Builder initialExtractDate(java.util.Date initialExtractDate) {
            this.initialExtractDate = initialExtractDate;
            this.__explicitlySet__.add("initialExtractDate");
            return this;
        }
        /**
         * Date last extracted
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastExtractDate")
        private java.util.Date lastExtractDate;

        /**
         * Date last extracted
         * @param lastExtractDate the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
    private final Integer fetchSize;

    /**
     * The fetch size for reading.
     * @return the value
     **/
    public Integer getFetchSize() {
        return fetchSize;
    }

    /**
     * Extraction Strategy - FULL|INCREMENTAL
     **/
    public enum ExtractStrategy {
        Full("FULL"),
        Incremental("INCREMENTAL"),
        ;

        private final String value;
        private static java.util.Map<String, ExtractStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (ExtractStrategy v : ExtractStrategy.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ExtractStrategy: " + key);
        }
    };
    /**
     * Extraction Strategy - FULL|INCREMENTAL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extractStrategy")
    private final ExtractStrategy extractStrategy;

    /**
     * Extraction Strategy - FULL|INCREMENTAL
     * @return the value
     **/
    public ExtractStrategy getExtractStrategy() {
        return extractStrategy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("externalStorage")
    private final ExternalStorage externalStorage;

    public ExternalStorage getExternalStorage() {
        return externalStorage;
    }

    /**
     * Date from where extract should start
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialExtractDate")
    private final java.util.Date initialExtractDate;

    /**
     * Date from where extract should start
     * @return the value
     **/
    public java.util.Date getInitialExtractDate() {
        return initialExtractDate;
    }

    /**
     * Date last extracted
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastExtractDate")
    private final java.util.Date lastExtractDate;

    /**
     * Date last extracted
     * @return the value
     **/
    public java.util.Date getLastExtractDate() {
        return lastExtractDate;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BiccReadAttributes(");
        sb.append("super=").append(super.toString());
        sb.append(", fetchSize=").append(String.valueOf(this.fetchSize));
        sb.append(", extractStrategy=").append(String.valueOf(this.extractStrategy));
        sb.append(", externalStorage=").append(String.valueOf(this.externalStorage));
        sb.append(", initialExtractDate=").append(String.valueOf(this.initialExtractDate));
        sb.append(", lastExtractDate=").append(String.valueOf(this.lastExtractDate));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BiccReadAttributes)) {
            return false;
        }

        BiccReadAttributes other = (BiccReadAttributes) o;
        return java.util.Objects.equals(this.fetchSize, other.fetchSize)
                && java.util.Objects.equals(this.extractStrategy, other.extractStrategy)
                && java.util.Objects.equals(this.externalStorage, other.externalStorage)
                && java.util.Objects.equals(this.initialExtractDate, other.initialExtractDate)
                && java.util.Objects.equals(this.lastExtractDate, other.lastExtractDate)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fetchSize == null ? 43 : this.fetchSize.hashCode());
        result =
                (result * PRIME)
                        + (this.extractStrategy == null ? 43 : this.extractStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.externalStorage == null ? 43 : this.externalStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.initialExtractDate == null
                                ? 43
                                : this.initialExtractDate.hashCode());
        result =
                (result * PRIME)
                        + (this.lastExtractDate == null ? 43 : this.lastExtractDate.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
