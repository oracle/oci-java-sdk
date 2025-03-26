/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The information needed to create a lightweight tag.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOrUpdateGitTagDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "refType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOrUpdateGitTagDetails extends CreateOrUpdateGitRefDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("refName")
        private String refName;

        public Builder refName(String refName) {
            this.refName = refName;
            this.__explicitlySet__.add("refName");
            return this;
        }
        /**
         * SHA-1 hash value of the object pointed to by the tag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectId")
        private String objectId;

        /**
         * SHA-1 hash value of the object pointed to by the tag.
         * @param objectId the value to set
         * @return this builder
         **/
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            this.__explicitlySet__.add("objectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOrUpdateGitTagDetails build() {
            CreateOrUpdateGitTagDetails model =
                    new CreateOrUpdateGitTagDetails(this.refName, this.objectId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOrUpdateGitTagDetails model) {
            if (model.wasPropertyExplicitlySet("refName")) {
                this.refName(model.getRefName());
            }
            if (model.wasPropertyExplicitlySet("objectId")) {
                this.objectId(model.getObjectId());
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

    @Deprecated
    public CreateOrUpdateGitTagDetails(String refName, String objectId) {
        super(refName);
        this.objectId = objectId;
    }

    /**
     * SHA-1 hash value of the object pointed to by the tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectId")
    private final String objectId;

    /**
     * SHA-1 hash value of the object pointed to by the tag.
     * @return the value
     **/
    public String getObjectId() {
        return objectId;
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
        sb.append("CreateOrUpdateGitTagDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", objectId=").append(String.valueOf(this.objectId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOrUpdateGitTagDetails)) {
            return false;
        }

        CreateOrUpdateGitTagDetails other = (CreateOrUpdateGitTagDetails) o;
        return java.util.Objects.equals(this.objectId, other.objectId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.objectId == null ? 43 : this.objectId.hashCode());
        return result;
    }
}
