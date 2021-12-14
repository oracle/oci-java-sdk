/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CostTrackingTag.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CostTrackingTag {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("Tag_Namespace_Id")
        private String tagNamespaceId;

        public Builder tagNamespaceId(String tagNamespaceId) {
            this.tagNamespaceId = tagNamespaceId;
            this.__explicitlySet__.add("tagNamespaceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("Tag_Namespace_Name")
        private String tagNamespaceName;

        public Builder tagNamespaceName(String tagNamespaceName) {
            this.tagNamespaceName = tagNamespaceName;
            this.__explicitlySet__.add("tagNamespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("Tag_Definition_Id")
        private String tagDefinitionId;

        public Builder tagDefinitionId(String tagDefinitionId) {
            this.tagDefinitionId = tagDefinitionId;
            this.__explicitlySet__.add("tagDefinitionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("Tag_Definition_Name")
        private String tagDefinitionName;

        public Builder tagDefinitionName(String tagDefinitionName) {
            this.tagDefinitionName = tagDefinitionName;
            this.__explicitlySet__.add("tagDefinitionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CostTrackingTag build() {
            CostTrackingTag __instance__ =
                    new CostTrackingTag(
                            tagNamespaceId, tagNamespaceName, tagDefinitionId, tagDefinitionName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CostTrackingTag o) {
            Builder copiedBuilder =
                    tagNamespaceId(o.getTagNamespaceId())
                            .tagNamespaceName(o.getTagNamespaceName())
                            .tagDefinitionId(o.getTagDefinitionId())
                            .tagDefinitionName(o.getTagDefinitionName());

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
     * The tag namespace id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("Tag_Namespace_Id")
    String tagNamespaceId;

    /**
     * The tag namespace name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("Tag_Namespace_Name")
    String tagNamespaceName;

    /**
     * The tag definition id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("Tag_Definition_Id")
    String tagDefinitionId;

    /**
     * The tag definition name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("Tag_Definition_Name")
    String tagDefinitionName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
