/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Permissions object for glosssaries.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GlossaryPermissionsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class GlossaryPermissionsSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userPermissions")
        private java.util.List<String> userPermissions;

        public Builder userPermissions(java.util.List<String> userPermissions) {
            this.userPermissions = userPermissions;
            this.__explicitlySet__.add("userPermissions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GlossaryPermissionsSummary build() {
            GlossaryPermissionsSummary __instance__ =
                    new GlossaryPermissionsSummary(glossaryKey, userPermissions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GlossaryPermissionsSummary o) {
            Builder copiedBuilder =
                    glossaryKey(o.getGlossaryKey()).userPermissions(o.getUserPermissions());

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
     * The unique key of the parent glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    String glossaryKey;

    /**
     * An array of permissions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userPermissions")
    java.util.List<String> userPermissions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
