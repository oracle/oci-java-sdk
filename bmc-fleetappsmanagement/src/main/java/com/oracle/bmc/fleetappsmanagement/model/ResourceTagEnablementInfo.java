/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Resource tag enablement Information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceTagEnablementInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceTagEnablementInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceId", "isTaggingPossible"})
    public ResourceTagEnablementInfo(String resourceId, Boolean isTaggingPossible) {
        super();
        this.resourceId = resourceId;
        this.isTaggingPossible = isTaggingPossible;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** A value that represents if the resource can be tagged with a Fleet name. */
        @com.fasterxml.jackson.annotation.JsonProperty("isTaggingPossible")
        private Boolean isTaggingPossible;

        /**
         * A value that represents if the resource can be tagged with a Fleet name.
         *
         * @param isTaggingPossible the value to set
         * @return this builder
         */
        public Builder isTaggingPossible(Boolean isTaggingPossible) {
            this.isTaggingPossible = isTaggingPossible;
            this.__explicitlySet__.add("isTaggingPossible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceTagEnablementInfo build() {
            ResourceTagEnablementInfo model =
                    new ResourceTagEnablementInfo(this.resourceId, this.isTaggingPossible);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceTagEnablementInfo model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("isTaggingPossible")) {
                this.isTaggingPossible(model.getIsTaggingPossible());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** A value that represents if the resource can be tagged with a Fleet name. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTaggingPossible")
    private final Boolean isTaggingPossible;

    /**
     * A value that represents if the resource can be tagged with a Fleet name.
     *
     * @return the value
     */
    public Boolean getIsTaggingPossible() {
        return isTaggingPossible;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceTagEnablementInfo(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", isTaggingPossible=").append(String.valueOf(this.isTaggingPossible));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceTagEnablementInfo)) {
            return false;
        }

        ResourceTagEnablementInfo other = (ResourceTagEnablementInfo) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.isTaggingPossible, other.isTaggingPossible)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isTaggingPossible == null ? 43 : this.isTaggingPossible.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
