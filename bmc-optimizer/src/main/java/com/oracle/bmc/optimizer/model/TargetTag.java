/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * A tag key definition used in the current profile override, including the tag namespace, tag key, tag value type, and tag values.
 * Only defined tags are supported.
 * For more information about tagging, see [Tagging Overview](https://docs.cloud.oracle.com/iaas/Content/Tagging/Concepts/taggingoverview.htm)
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TargetTag.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TargetTag {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tagNamespaceName")
        private String tagNamespaceName;

        public Builder tagNamespaceName(String tagNamespaceName) {
            this.tagNamespaceName = tagNamespaceName;
            this.__explicitlySet__.add("tagNamespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
        private String tagDefinitionName;

        public Builder tagDefinitionName(String tagDefinitionName) {
            this.tagDefinitionName = tagDefinitionName;
            this.__explicitlySet__.add("tagDefinitionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagValueType")
        private TagValueType tagValueType;

        public Builder tagValueType(TagValueType tagValueType) {
            this.tagValueType = tagValueType;
            this.__explicitlySet__.add("tagValueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagValues")
        private java.util.List<String> tagValues;

        public Builder tagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            this.__explicitlySet__.add("tagValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetTag build() {
            TargetTag __instance__ =
                    new TargetTag(tagNamespaceName, tagDefinitionName, tagValueType, tagValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetTag o) {
            Builder copiedBuilder =
                    tagNamespaceName(o.getTagNamespaceName())
                            .tagDefinitionName(o.getTagDefinitionName())
                            .tagValueType(o.getTagValueType())
                            .tagValues(o.getTagValues());

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
     * The name of the tag namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagNamespaceName")
    String tagNamespaceName;

    /**
     * The name you use to refer to the tag, also known as the tag key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
    String tagDefinitionName;

    /**
     * Specifies which tag value types in the {@code tagValues} field result in overrides of the recommendation criteria.
     * <p>
     * When the value for this field is {@code ANY}, the {@code tagValues} field should be empty, which enforces overrides to the recommendation
     * for resources with any tag values attached to them.
     * <p>
     * When the value for this field value is {@code VALUE}, the {@code tagValues} field must include a specific value or list of values.
     * Overrides to the recommendation criteria only occur for resources that match the values in the {@code tagValues} fields.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagValueType")
    TagValueType tagValueType;

    /**
     * The list of tag values. The tag value is the value that the user applying the tag adds to the tag key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagValues")
    java.util.List<String> tagValues;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
