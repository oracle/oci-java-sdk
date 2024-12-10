/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request to check resource tagging.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceTagCheckDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceTagCheckDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tagEnablementInfo"})
    public ResourceTagCheckDetails(java.util.List<ResourceTagEnablementInfo> tagEnablementInfo) {
        super();
        this.tagEnablementInfo = tagEnablementInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Tag enablement Information for the resources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagEnablementInfo")
        private java.util.List<ResourceTagEnablementInfo> tagEnablementInfo;

        /**
         * Tag enablement Information for the resources.
         * @param tagEnablementInfo the value to set
         * @return this builder
         **/
        public Builder tagEnablementInfo(
                java.util.List<ResourceTagEnablementInfo> tagEnablementInfo) {
            this.tagEnablementInfo = tagEnablementInfo;
            this.__explicitlySet__.add("tagEnablementInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceTagCheckDetails build() {
            ResourceTagCheckDetails model = new ResourceTagCheckDetails(this.tagEnablementInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceTagCheckDetails model) {
            if (model.wasPropertyExplicitlySet("tagEnablementInfo")) {
                this.tagEnablementInfo(model.getTagEnablementInfo());
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
     * Tag enablement Information for the resources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagEnablementInfo")
    private final java.util.List<ResourceTagEnablementInfo> tagEnablementInfo;

    /**
     * Tag enablement Information for the resources.
     * @return the value
     **/
    public java.util.List<ResourceTagEnablementInfo> getTagEnablementInfo() {
        return tagEnablementInfo;
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
        sb.append("ResourceTagCheckDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tagEnablementInfo=").append(String.valueOf(this.tagEnablementInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceTagCheckDetails)) {
            return false;
        }

        ResourceTagCheckDetails other = (ResourceTagCheckDetails) o;
        return java.util.Objects.equals(this.tagEnablementInfo, other.tagEnablementInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tagEnablementInfo == null ? 43 : this.tagEnablementInfo.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
