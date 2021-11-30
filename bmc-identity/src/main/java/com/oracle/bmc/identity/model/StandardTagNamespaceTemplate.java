/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * The template of the standard tag namespace. This object includes necessary details to create the provided standard tag namespace.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StandardTagNamespaceTemplate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StandardTagNamespaceTemplate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("standardTagNamespaceName")
        private String standardTagNamespaceName;

        public Builder standardTagNamespaceName(String standardTagNamespaceName) {
            this.standardTagNamespaceName = standardTagNamespaceName;
            this.__explicitlySet__.add("standardTagNamespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionTemplates")
        private java.util.List<StandardTagDefinitionTemplate> tagDefinitionTemplates;

        public Builder tagDefinitionTemplates(
                java.util.List<StandardTagDefinitionTemplate> tagDefinitionTemplates) {
            this.tagDefinitionTemplates = tagDefinitionTemplates;
            this.__explicitlySet__.add("tagDefinitionTemplates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StandardTagNamespaceTemplate build() {
            StandardTagNamespaceTemplate __instance__ =
                    new StandardTagNamespaceTemplate(
                            description, standardTagNamespaceName, tagDefinitionTemplates, status);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StandardTagNamespaceTemplate o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .standardTagNamespaceName(o.getStandardTagNamespaceName())
                            .tagDefinitionTemplates(o.getTagDefinitionTemplates())
                            .status(o.getStatus());

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
     * The default description of the tag namespace that users can use to create the tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The reserved name of this standard tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standardTagNamespaceName")
    String standardTagNamespaceName;

    /**
     * The template of the tag definition. This object includes necessary details to create the provided standard tag definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionTemplates")
    java.util.List<StandardTagDefinitionTemplate> tagDefinitionTemplates;

    /**
     * The status of the standard tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    String status;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
