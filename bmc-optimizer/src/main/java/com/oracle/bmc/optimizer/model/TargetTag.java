/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * A tag key definition used in the current profile override, including the tag namespace, tag key, tag value type, and tag values.
 * Only defined tags are supported.
 * For more information about tagging, see [Tagging Overview](https://docs.oracle.com/iaas/Content/Tagging/Concepts/taggingoverview.htm)
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TargetTag.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TargetTag extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tagNamespaceName",
        "tagDefinitionName",
        "tagValueType",
        "tagValues"
    })
    public TargetTag(
            String tagNamespaceName,
            String tagDefinitionName,
            TagValueType tagValueType,
            java.util.List<String> tagValues) {
        super();
        this.tagNamespaceName = tagNamespaceName;
        this.tagDefinitionName = tagDefinitionName;
        this.tagValueType = tagValueType;
        this.tagValues = tagValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the tag namespace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagNamespaceName")
        private String tagNamespaceName;

        /**
         * The name of the tag namespace.
         * @param tagNamespaceName the value to set
         * @return this builder
         **/
        public Builder tagNamespaceName(String tagNamespaceName) {
            this.tagNamespaceName = tagNamespaceName;
            this.__explicitlySet__.add("tagNamespaceName");
            return this;
        }
        /**
         * The name you use to refer to the tag, also known as the tag key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
        private String tagDefinitionName;

        /**
         * The name you use to refer to the tag, also known as the tag key.
         * @param tagDefinitionName the value to set
         * @return this builder
         **/
        public Builder tagDefinitionName(String tagDefinitionName) {
            this.tagDefinitionName = tagDefinitionName;
            this.__explicitlySet__.add("tagDefinitionName");
            return this;
        }
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
        private TagValueType tagValueType;

        /**
         * Specifies which tag value types in the {@code tagValues} field result in overrides of the recommendation criteria.
         * <p>
         * When the value for this field is {@code ANY}, the {@code tagValues} field should be empty, which enforces overrides to the recommendation
         * for resources with any tag values attached to them.
         * <p>
         * When the value for this field value is {@code VALUE}, the {@code tagValues} field must include a specific value or list of values.
         * Overrides to the recommendation criteria only occur for resources that match the values in the {@code tagValues} fields.
         *
         * @param tagValueType the value to set
         * @return this builder
         **/
        public Builder tagValueType(TagValueType tagValueType) {
            this.tagValueType = tagValueType;
            this.__explicitlySet__.add("tagValueType");
            return this;
        }
        /**
         * The list of tag values. The tag value is the value that the user applying the tag adds to the tag key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagValues")
        private java.util.List<String> tagValues;

        /**
         * The list of tag values. The tag value is the value that the user applying the tag adds to the tag key.
         * @param tagValues the value to set
         * @return this builder
         **/
        public Builder tagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            this.__explicitlySet__.add("tagValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetTag build() {
            TargetTag model =
                    new TargetTag(
                            this.tagNamespaceName,
                            this.tagDefinitionName,
                            this.tagValueType,
                            this.tagValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetTag model) {
            if (model.wasPropertyExplicitlySet("tagNamespaceName")) {
                this.tagNamespaceName(model.getTagNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("tagDefinitionName")) {
                this.tagDefinitionName(model.getTagDefinitionName());
            }
            if (model.wasPropertyExplicitlySet("tagValueType")) {
                this.tagValueType(model.getTagValueType());
            }
            if (model.wasPropertyExplicitlySet("tagValues")) {
                this.tagValues(model.getTagValues());
            }
            return this;
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
     * The name of the tag namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagNamespaceName")
    private final String tagNamespaceName;

    /**
     * The name of the tag namespace.
     * @return the value
     **/
    public String getTagNamespaceName() {
        return tagNamespaceName;
    }

    /**
     * The name you use to refer to the tag, also known as the tag key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
    private final String tagDefinitionName;

    /**
     * The name you use to refer to the tag, also known as the tag key.
     * @return the value
     **/
    public String getTagDefinitionName() {
        return tagDefinitionName;
    }

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
    private final TagValueType tagValueType;

    /**
     * Specifies which tag value types in the {@code tagValues} field result in overrides of the recommendation criteria.
     * <p>
     * When the value for this field is {@code ANY}, the {@code tagValues} field should be empty, which enforces overrides to the recommendation
     * for resources with any tag values attached to them.
     * <p>
     * When the value for this field value is {@code VALUE}, the {@code tagValues} field must include a specific value or list of values.
     * Overrides to the recommendation criteria only occur for resources that match the values in the {@code tagValues} fields.
     *
     * @return the value
     **/
    public TagValueType getTagValueType() {
        return tagValueType;
    }

    /**
     * The list of tag values. The tag value is the value that the user applying the tag adds to the tag key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagValues")
    private final java.util.List<String> tagValues;

    /**
     * The list of tag values. The tag value is the value that the user applying the tag adds to the tag key.
     * @return the value
     **/
    public java.util.List<String> getTagValues() {
        return tagValues;
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
        sb.append("TargetTag(");
        sb.append("super=").append(super.toString());
        sb.append("tagNamespaceName=").append(String.valueOf(this.tagNamespaceName));
        sb.append(", tagDefinitionName=").append(String.valueOf(this.tagDefinitionName));
        sb.append(", tagValueType=").append(String.valueOf(this.tagValueType));
        sb.append(", tagValues=").append(String.valueOf(this.tagValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetTag)) {
            return false;
        }

        TargetTag other = (TargetTag) o;
        return java.util.Objects.equals(this.tagNamespaceName, other.tagNamespaceName)
                && java.util.Objects.equals(this.tagDefinitionName, other.tagDefinitionName)
                && java.util.Objects.equals(this.tagValueType, other.tagValueType)
                && java.util.Objects.equals(this.tagValues, other.tagValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tagNamespaceName == null ? 43 : this.tagNamespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionName == null ? 43 : this.tagDefinitionName.hashCode());
        result = (result * PRIME) + (this.tagValueType == null ? 43 : this.tagValueType.hashCode());
        result = (result * PRIME) + (this.tagValues == null ? 43 : this.tagValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
