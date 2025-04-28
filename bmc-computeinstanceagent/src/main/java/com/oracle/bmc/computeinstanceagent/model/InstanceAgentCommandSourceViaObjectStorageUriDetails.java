/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The source of the command when imported from an Object Storage URL. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceAgentCommandSourceViaObjectStorageUriDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceAgentCommandSourceViaObjectStorageUriDetails
        extends InstanceAgentCommandSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Object Storage URL or pre-authenticated request (PAR) for the command. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
        private String sourceUri;

        /**
         * The Object Storage URL or pre-authenticated request (PAR) for the command.
         *
         * @param sourceUri the value to set
         * @return this builder
         */
        public Builder sourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            this.__explicitlySet__.add("sourceUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommandSourceViaObjectStorageUriDetails build() {
            InstanceAgentCommandSourceViaObjectStorageUriDetails model =
                    new InstanceAgentCommandSourceViaObjectStorageUriDetails(this.sourceUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandSourceViaObjectStorageUriDetails model) {
            if (model.wasPropertyExplicitlySet("sourceUri")) {
                this.sourceUri(model.getSourceUri());
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

    @Deprecated
    public InstanceAgentCommandSourceViaObjectStorageUriDetails(String sourceUri) {
        super();
        this.sourceUri = sourceUri;
    }

    /** The Object Storage URL or pre-authenticated request (PAR) for the command. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
    private final String sourceUri;

    /**
     * The Object Storage URL or pre-authenticated request (PAR) for the command.
     *
     * @return the value
     */
    public String getSourceUri() {
        return sourceUri;
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
        sb.append("InstanceAgentCommandSourceViaObjectStorageUriDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceUri=").append(String.valueOf(this.sourceUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentCommandSourceViaObjectStorageUriDetails)) {
            return false;
        }

        InstanceAgentCommandSourceViaObjectStorageUriDetails other =
                (InstanceAgentCommandSourceViaObjectStorageUriDetails) o;
        return java.util.Objects.equals(this.sourceUri, other.sourceUri) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sourceUri == null ? 43 : this.sourceUri.hashCode());
        return result;
    }
}
