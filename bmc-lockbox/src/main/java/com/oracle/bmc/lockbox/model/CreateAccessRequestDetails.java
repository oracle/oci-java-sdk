/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * The configuration details for a new access request.
 * We don't accept a compartmentId parameter because it is implied to be the same as the lockbox as a subsidiary resource.
 * The requestorId is also based on the caller user info.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAccessRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAccessRequestDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lockboxId",
        "displayName",
        "description",
        "context",
        "accessDuration"
    })
    public CreateAccessRequestDetails(
            String lockboxId,
            String displayName,
            String description,
            java.util.Map<String, String> context,
            String accessDuration) {
        super();
        this.lockboxId = lockboxId;
        this.displayName = displayName;
        this.description = description;
        this.context = context;
        this.accessDuration = accessDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the lockbox box that the access request is associated with which is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lockboxId")
        private String lockboxId;

        /**
         * The unique identifier (OCID) of the lockbox box that the access request is associated with which is immutable.
         * @param lockboxId the value to set
         * @return this builder
         **/
        public Builder lockboxId(String lockboxId) {
            this.lockboxId = lockboxId;
            this.__explicitlySet__.add("lockboxId");
            return this;
        }
        /**
         * The name of the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the access request.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The rationale for requesting the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The rationale for requesting the access request.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The context object containing the access request specific details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("context")
        private java.util.Map<String, String> context;

        /**
         * The context object containing the access request specific details.
         * @param context the value to set
         * @return this builder
         **/
        public Builder context(java.util.Map<String, String> context) {
            this.context = context;
            this.__explicitlySet__.add("context");
            return this;
        }
        /**
         * The maximum amount of time operator has access to associated resources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessDuration")
        private String accessDuration;

        /**
         * The maximum amount of time operator has access to associated resources.
         * @param accessDuration the value to set
         * @return this builder
         **/
        public Builder accessDuration(String accessDuration) {
            this.accessDuration = accessDuration;
            this.__explicitlySet__.add("accessDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAccessRequestDetails build() {
            CreateAccessRequestDetails __instance__ =
                    new CreateAccessRequestDetails(
                            lockboxId, displayName, description, context, accessDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAccessRequestDetails o) {
            Builder copiedBuilder =
                    lockboxId(o.getLockboxId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .context(o.getContext())
                            .accessDuration(o.getAccessDuration());

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
     * The unique identifier (OCID) of the lockbox box that the access request is associated with which is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lockboxId")
    private final String lockboxId;

    /**
     * The unique identifier (OCID) of the lockbox box that the access request is associated with which is immutable.
     * @return the value
     **/
    public String getLockboxId() {
        return lockboxId;
    }

    /**
     * The name of the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the access request.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The rationale for requesting the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The rationale for requesting the access request.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The context object containing the access request specific details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    private final java.util.Map<String, String> context;

    /**
     * The context object containing the access request specific details.
     * @return the value
     **/
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * The maximum amount of time operator has access to associated resources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessDuration")
    private final String accessDuration;

    /**
     * The maximum amount of time operator has access to associated resources.
     * @return the value
     **/
    public String getAccessDuration() {
        return accessDuration;
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
        sb.append("CreateAccessRequestDetails(");
        sb.append("lockboxId=").append(String.valueOf(this.lockboxId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", context=").append(String.valueOf(this.context));
        sb.append(", accessDuration=").append(String.valueOf(this.accessDuration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAccessRequestDetails)) {
            return false;
        }

        CreateAccessRequestDetails other = (CreateAccessRequestDetails) o;
        return java.util.Objects.equals(this.lockboxId, other.lockboxId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.context, other.context)
                && java.util.Objects.equals(this.accessDuration, other.accessDuration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.lockboxId == null ? 43 : this.lockboxId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.context == null ? 43 : this.context.hashCode());
        result =
                (result * PRIME)
                        + (this.accessDuration == null ? 43 : this.accessDuration.hashCode());
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
