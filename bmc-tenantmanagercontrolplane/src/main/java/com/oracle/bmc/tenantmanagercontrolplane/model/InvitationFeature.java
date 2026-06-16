/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The feature model for sender invitation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InvitationFeature.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InvitationFeature
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "recipientInvitationId", "status"})
    public InvitationFeature(
            String name, String recipientInvitationId, SenderInvitationStatus status) {
        super();
        this.name = name;
        this.recipientInvitationId = recipientInvitationId;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the feature.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** recipientInvitationId for this feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("recipientInvitationId")
        private String recipientInvitationId;

        /**
         * recipientInvitationId for this feature.
         *
         * @param recipientInvitationId the value to set
         * @return this builder
         */
        public Builder recipientInvitationId(String recipientInvitationId) {
            this.recipientInvitationId = recipientInvitationId;
            this.__explicitlySet__.add("recipientInvitationId");
            return this;
        }
        /** Status of the sender invitation. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private SenderInvitationStatus status;

        /**
         * Status of the sender invitation.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(SenderInvitationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvitationFeature build() {
            InvitationFeature model =
                    new InvitationFeature(this.name, this.recipientInvitationId, this.status);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvitationFeature model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("recipientInvitationId")) {
                this.recipientInvitationId(model.getRecipientInvitationId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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

    /** Name of the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the feature.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** recipientInvitationId for this feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("recipientInvitationId")
    private final String recipientInvitationId;

    /**
     * recipientInvitationId for this feature.
     *
     * @return the value
     */
    public String getRecipientInvitationId() {
        return recipientInvitationId;
    }

    /** Status of the sender invitation. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final SenderInvitationStatus status;

    /**
     * Status of the sender invitation.
     *
     * @return the value
     */
    public SenderInvitationStatus getStatus() {
        return status;
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
        sb.append("InvitationFeature(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", recipientInvitationId=").append(String.valueOf(this.recipientInvitationId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvitationFeature)) {
            return false;
        }

        InvitationFeature other = (InvitationFeature) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.recipientInvitationId, other.recipientInvitationId)
                && java.util.Objects.equals(this.status, other.status)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.recipientInvitationId == null
                                ? 43
                                : this.recipientInvitationId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
