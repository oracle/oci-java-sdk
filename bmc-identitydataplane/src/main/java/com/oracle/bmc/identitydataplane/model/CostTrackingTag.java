/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CostTrackingTag.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CostTrackingTag {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tagNamespaceId",
        "tagNamespaceName",
        "tagDefinitionId",
        "tagDefinitionName"
    })
    public CostTrackingTag(
            String tagNamespaceId,
            String tagNamespaceName,
            String tagDefinitionId,
            String tagDefinitionName) {
        super();
        this.tagNamespaceId = tagNamespaceId;
        this.tagNamespaceName = tagNamespaceName;
        this.tagDefinitionId = tagDefinitionId;
        this.tagDefinitionName = tagDefinitionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tag namespace id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("Tag_Namespace_Id")
        private String tagNamespaceId;

        /**
         * The tag namespace id.
         * @param tagNamespaceId the value to set
         * @return this builder
         **/
        public Builder tagNamespaceId(String tagNamespaceId) {
            this.tagNamespaceId = tagNamespaceId;
            this.__explicitlySet__.add("tagNamespaceId");
            return this;
        }
        /**
         * The tag namespace name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("Tag_Namespace_Name")
        private String tagNamespaceName;

        /**
         * The tag namespace name.
         * @param tagNamespaceName the value to set
         * @return this builder
         **/
        public Builder tagNamespaceName(String tagNamespaceName) {
            this.tagNamespaceName = tagNamespaceName;
            this.__explicitlySet__.add("tagNamespaceName");
            return this;
        }
        /**
         * The tag definition id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("Tag_Definition_Id")
        private String tagDefinitionId;

        /**
         * The tag definition id.
         * @param tagDefinitionId the value to set
         * @return this builder
         **/
        public Builder tagDefinitionId(String tagDefinitionId) {
            this.tagDefinitionId = tagDefinitionId;
            this.__explicitlySet__.add("tagDefinitionId");
            return this;
        }
        /**
         * The tag definition name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("Tag_Definition_Name")
        private String tagDefinitionName;

        /**
         * The tag definition name.
         * @param tagDefinitionName the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The tag namespace id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("Tag_Namespace_Id")
    private final String tagNamespaceId;

    /**
     * The tag namespace id.
     * @return the value
     **/
    public String getTagNamespaceId() {
        return tagNamespaceId;
    }

    /**
     * The tag namespace name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("Tag_Namespace_Name")
    private final String tagNamespaceName;

    /**
     * The tag namespace name.
     * @return the value
     **/
    public String getTagNamespaceName() {
        return tagNamespaceName;
    }

    /**
     * The tag definition id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("Tag_Definition_Id")
    private final String tagDefinitionId;

    /**
     * The tag definition id.
     * @return the value
     **/
    public String getTagDefinitionId() {
        return tagDefinitionId;
    }

    /**
     * The tag definition name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("Tag_Definition_Name")
    private final String tagDefinitionName;

    /**
     * The tag definition name.
     * @return the value
     **/
    public String getTagDefinitionName() {
        return tagDefinitionName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CostTrackingTag(");
        sb.append("tagNamespaceId=").append(String.valueOf(this.tagNamespaceId));
        sb.append(", tagNamespaceName=").append(String.valueOf(this.tagNamespaceName));
        sb.append(", tagDefinitionId=").append(String.valueOf(this.tagDefinitionId));
        sb.append(", tagDefinitionName=").append(String.valueOf(this.tagDefinitionName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CostTrackingTag)) {
            return false;
        }

        CostTrackingTag other = (CostTrackingTag) o;
        return java.util.Objects.equals(this.tagNamespaceId, other.tagNamespaceId)
                && java.util.Objects.equals(this.tagNamespaceName, other.tagNamespaceName)
                && java.util.Objects.equals(this.tagDefinitionId, other.tagDefinitionId)
                && java.util.Objects.equals(this.tagDefinitionName, other.tagDefinitionName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tagNamespaceId == null ? 43 : this.tagNamespaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.tagNamespaceName == null ? 43 : this.tagNamespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionId == null ? 43 : this.tagDefinitionId.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionName == null ? 43 : this.tagDefinitionName.hashCode());
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
