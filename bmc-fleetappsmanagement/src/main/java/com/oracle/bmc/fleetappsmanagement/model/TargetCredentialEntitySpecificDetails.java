/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Target credential details.
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
    builder = TargetCredentialEntitySpecificDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "credentialLevel"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TargetCredentialEntitySpecificDetails extends CredentialEntitySpecificDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the resource associated with the target for which the credential is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * OCID of the resource associated with the target for which the credential is created.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Target name for which the credential is provided.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * Target name for which the credential is provided.
         * @param target the value to set
         * @return this builder
         **/
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetCredentialEntitySpecificDetails build() {
            TargetCredentialEntitySpecificDetails model =
                    new TargetCredentialEntitySpecificDetails(this.resourceId, this.target);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetCredentialEntitySpecificDetails model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
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
    public TargetCredentialEntitySpecificDetails(String resourceId, String target) {
        super();
        this.resourceId = resourceId;
        this.target = target;
    }

    /**
     * OCID of the resource associated with the target for which the credential is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * OCID of the resource associated with the target for which the credential is created.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Target name for which the credential is provided.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * Target name for which the credential is provided.
     * @return the value
     **/
    public String getTarget() {
        return target;
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
        sb.append("TargetCredentialEntitySpecificDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetCredentialEntitySpecificDetails)) {
            return false;
        }

        TargetCredentialEntitySpecificDetails other = (TargetCredentialEntitySpecificDetails) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.target, other.target)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        return result;
    }
}
