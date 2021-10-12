/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * Object Storage Source Details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateObjectStorageSourceDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateObjectStorageSourceDetails extends CreateSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("relativePath")
        private String relativePath;

        public Builder relativePath(String relativePath) {
            this.relativePath = relativePath;
            this.__explicitlySet__.add("relativePath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private java.math.BigDecimal offset;

        public Builder offset(java.math.BigDecimal offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private java.math.BigDecimal length;

        public Builder length(java.math.BigDecimal length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateObjectStorageSourceDetails build() {
            CreateObjectStorageSourceDetails __instance__ =
                    new CreateObjectStorageSourceDetails(relativePath, offset, length);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateObjectStorageSourceDetails o) {
            Builder copiedBuilder =
                    relativePath(o.getRelativePath()).offset(o.getOffset()).length(o.getLength());

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
    public CreateObjectStorageSourceDetails(
            String relativePath, java.math.BigDecimal offset, java.math.BigDecimal length) {
        super();
        this.relativePath = relativePath;
        this.offset = offset;
        this.length = length;
    }

    /**
     * The path relative to the prefix specified in the dataset source details (file name).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relativePath")
    String relativePath;

    /**
     * The offset into the file containing the content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    java.math.BigDecimal offset;

    /**
     * The length from offset into the file containing the content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    java.math.BigDecimal length;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
