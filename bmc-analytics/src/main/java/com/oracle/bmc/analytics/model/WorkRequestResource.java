/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestResource extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "actionResult",
        "resourceType",
        "identifier",
        "resourceUri",
        "metadata"
    })
    public WorkRequestResource(
            WorkRequestActionResult actionResult,
            WorkRequestResourceType resourceType,
            String identifier,
            String resourceUri,
            java.util.Map<String, String> metadata) {
        super();
        this.actionResult = actionResult;
        this.resourceType = resourceType;
        this.identifier = identifier;
        this.resourceUri = resourceUri;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The way in which this resource was affected by this work request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionResult")
        private WorkRequestActionResult actionResult;

        /**
         * The way in which this resource was affected by this work request.
         *
         * @param actionResult the value to set
         * @return this builder
         **/
        public Builder actionResult(WorkRequestActionResult actionResult) {
            this.actionResult = actionResult;
            this.__explicitlySet__.add("actionResult");
            return this;
        }
        /**
         * The type of the resource the work request is affecting.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private WorkRequestResourceType resourceType;

        /**
         * The type of the resource the work request is affecting.
         *
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(WorkRequestResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The OCID of the resource the work request is affecting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * The OCID of the resource the work request is affecting.
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /**
         * The URI of the affected resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
        private String resourceUri;

        /**
         * The URI of the affected resource.
         *
         * @param resourceUri the value to set
         * @return this builder
         **/
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            this.__explicitlySet__.add("resourceUri");
            return this;
        }
        /**
         * Additional metadata of the resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Additional metadata of the resource.
         *
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestResource build() {
            WorkRequestResource model =
                    new WorkRequestResource(
                            this.actionResult,
                            this.resourceType,
                            this.identifier,
                            this.resourceUri,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestResource model) {
            if (model.wasPropertyExplicitlySet("actionResult")) {
                this.actionResult(model.getActionResult());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("resourceUri")) {
                this.resourceUri(model.getResourceUri());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * The way in which this resource was affected by this work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionResult")
    private final WorkRequestActionResult actionResult;

    /**
     * The way in which this resource was affected by this work request.
     *
     * @return the value
     **/
    public WorkRequestActionResult getActionResult() {
        return actionResult;
    }

    /**
     * The type of the resource the work request is affecting.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final WorkRequestResourceType resourceType;

    /**
     * The type of the resource the work request is affecting.
     *
     * @return the value
     **/
    public WorkRequestResourceType getResourceType() {
        return resourceType;
    }

    /**
     * The OCID of the resource the work request is affecting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * The OCID of the resource the work request is affecting.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    /**
     * The URI of the affected resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
    private final String resourceUri;

    /**
     * The URI of the affected resource.
     *
     * @return the value
     **/
    public String getResourceUri() {
        return resourceUri;
    }

    /**
     * Additional metadata of the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Additional metadata of the resource.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getMetadata() {
        return metadata;
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
        sb.append("WorkRequestResource(");
        sb.append("super=").append(super.toString());
        sb.append("actionResult=").append(String.valueOf(this.actionResult));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", resourceUri=").append(String.valueOf(this.resourceUri));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestResource)) {
            return false;
        }

        WorkRequestResource other = (WorkRequestResource) o;
        return java.util.Objects.equals(this.actionResult, other.actionResult)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.resourceUri, other.resourceUri)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.actionResult == null ? 43 : this.actionResult.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.resourceUri == null ? 43 : this.resourceUri.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
