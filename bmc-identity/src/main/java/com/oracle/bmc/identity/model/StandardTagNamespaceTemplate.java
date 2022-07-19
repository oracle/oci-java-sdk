/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StandardTagNamespaceTemplate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StandardTagNamespaceTemplate {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "standardTagNamespaceName",
        "tagDefinitionTemplates",
        "status"
    })
    public StandardTagNamespaceTemplate(
            String description,
            String standardTagNamespaceName,
            java.util.List<StandardTagDefinitionTemplate> tagDefinitionTemplates,
            String status) {
        super();
        this.description = description;
        this.standardTagNamespaceName = standardTagNamespaceName;
        this.tagDefinitionTemplates = tagDefinitionTemplates;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The default description of the tag namespace that users can use to create the tag namespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The default description of the tag namespace that users can use to create the tag namespace
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The reserved name of this standard tag namespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("standardTagNamespaceName")
        private String standardTagNamespaceName;

        /**
         * The reserved name of this standard tag namespace
         * @param standardTagNamespaceName the value to set
         * @return this builder
         **/
        public Builder standardTagNamespaceName(String standardTagNamespaceName) {
            this.standardTagNamespaceName = standardTagNamespaceName;
            this.__explicitlySet__.add("standardTagNamespaceName");
            return this;
        }
        /**
         * The template of the tag definition. This object includes necessary details to create the provided standard tag definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionTemplates")
        private java.util.List<StandardTagDefinitionTemplate> tagDefinitionTemplates;

        /**
         * The template of the tag definition. This object includes necessary details to create the provided standard tag definition.
         * @param tagDefinitionTemplates the value to set
         * @return this builder
         **/
        public Builder tagDefinitionTemplates(
                java.util.List<StandardTagDefinitionTemplate> tagDefinitionTemplates) {
            this.tagDefinitionTemplates = tagDefinitionTemplates;
            this.__explicitlySet__.add("tagDefinitionTemplates");
            return this;
        }
        /**
         * The status of the standard tag namespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status of the standard tag namespace
         * @param status the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The default description of the tag namespace that users can use to create the tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The default description of the tag namespace that users can use to create the tag namespace
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The reserved name of this standard tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standardTagNamespaceName")
    private final String standardTagNamespaceName;

    /**
     * The reserved name of this standard tag namespace
     * @return the value
     **/
    public String getStandardTagNamespaceName() {
        return standardTagNamespaceName;
    }

    /**
     * The template of the tag definition. This object includes necessary details to create the provided standard tag definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionTemplates")
    private final java.util.List<StandardTagDefinitionTemplate> tagDefinitionTemplates;

    /**
     * The template of the tag definition. This object includes necessary details to create the provided standard tag definition.
     * @return the value
     **/
    public java.util.List<StandardTagDefinitionTemplate> getTagDefinitionTemplates() {
        return tagDefinitionTemplates;
    }

    /**
     * The status of the standard tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status of the standard tag namespace
     * @return the value
     **/
    public String getStatus() {
        return status;
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
        sb.append("StandardTagNamespaceTemplate(");
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", standardTagNamespaceName=")
                .append(String.valueOf(this.standardTagNamespaceName));
        sb.append(", tagDefinitionTemplates=").append(String.valueOf(this.tagDefinitionTemplates));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StandardTagNamespaceTemplate)) {
            return false;
        }

        StandardTagNamespaceTemplate other = (StandardTagNamespaceTemplate) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.standardTagNamespaceName, other.standardTagNamespaceName)
                && java.util.Objects.equals(
                        this.tagDefinitionTemplates, other.tagDefinitionTemplates)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.standardTagNamespaceName == null
                                ? 43
                                : this.standardTagNamespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionTemplates == null
                                ? 43
                                : this.tagDefinitionTemplates.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
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
