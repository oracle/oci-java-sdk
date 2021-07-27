/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the advance http header options that allow the setting of http header size and allow/disallow
 * invalid characters in the http headers.
 * For example httpLargeHeaderSizeInKB=32, the http header could have 4 buffers of 32KBs each
 * This rule applies only to HTTP listeners. No more than one {@code HttpHeaderRule} object can be present in
 * a given listener.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HttpHeaderRule.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HttpHeaderRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("areInvalidCharactersAllowed")
        private Boolean areInvalidCharactersAllowed;

        public Builder areInvalidCharactersAllowed(Boolean areInvalidCharactersAllowed) {
            this.areInvalidCharactersAllowed = areInvalidCharactersAllowed;
            this.__explicitlySet__.add("areInvalidCharactersAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpLargeHeaderSizeInKB")
        private Integer httpLargeHeaderSizeInKB;

        public Builder httpLargeHeaderSizeInKB(Integer httpLargeHeaderSizeInKB) {
            this.httpLargeHeaderSizeInKB = httpLargeHeaderSizeInKB;
            this.__explicitlySet__.add("httpLargeHeaderSizeInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpHeaderRule build() {
            HttpHeaderRule __instance__ =
                    new HttpHeaderRule(areInvalidCharactersAllowed, httpLargeHeaderSizeInKB);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpHeaderRule o) {
            Builder copiedBuilder =
                    areInvalidCharactersAllowed(o.getAreInvalidCharactersAllowed())
                            .httpLargeHeaderSizeInKB(o.getHttpLargeHeaderSizeInKB());

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
    public HttpHeaderRule(Boolean areInvalidCharactersAllowed, Integer httpLargeHeaderSizeInKB) {
        super();
        this.areInvalidCharactersAllowed = areInvalidCharactersAllowed;
        this.httpLargeHeaderSizeInKB = httpLargeHeaderSizeInKB;
    }

    /**
     * Indicates whether or not invalid characters in client header fields will be allowed.
     * Valid names are composed of English letters, digits, hyphens and underscores.
     * If "true", invalid characters are allowed in the HTTP header.
     * If "false", invalid characters are not allowed in the HTTP header
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areInvalidCharactersAllowed")
    Boolean areInvalidCharactersAllowed;

    /**
     * The maximum size of each buffer used for reading http client request header.
     * This value indicates the maximum size allowed for each buffer.
     * The allowed values for buffer size are 8, 16, 32 and 64.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpLargeHeaderSizeInKB")
    Integer httpLargeHeaderSizeInKB;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
