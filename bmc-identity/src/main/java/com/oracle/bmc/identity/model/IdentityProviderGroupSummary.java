/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * A group created in an identity provider that can be mapped to a group in OCI <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IdentityProviderGroupSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityProviderGroupSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "identityProviderId",
        "displayName",
        "name",
        "externalIdentifier",
        "timeCreated",
        "timeModified"
    })
    public IdentityProviderGroupSummary(
            String id,
            String identityProviderId,
            String displayName,
            String name,
            String externalIdentifier,
            java.util.Date timeCreated,
            java.util.Date timeModified) {
        super();
        this.id = id;
        this.identityProviderId = identityProviderId;
        this.displayName = displayName;
        this.name = name;
        this.externalIdentifier = externalIdentifier;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the {@code IdentityProviderGroup}. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the {@code IdentityProviderGroup}.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the {@code IdentityProvider} this group belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("identityProviderId")
        private String identityProviderId;

        /**
         * The OCID of the {@code IdentityProvider} this group belongs to.
         *
         * @param identityProviderId the value to set
         * @return this builder
         */
        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            this.__explicitlySet__.add("identityProviderId");
            return this;
        }
        /** Display name of the group */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the group
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Display name of the group */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Display name of the group
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Identifier of the group in the identity provider */
        @com.fasterxml.jackson.annotation.JsonProperty("externalIdentifier")
        private String externalIdentifier;

        /**
         * Identifier of the group in the identity provider
         *
         * @param externalIdentifier the value to set
         * @return this builder
         */
        public Builder externalIdentifier(String externalIdentifier) {
            this.externalIdentifier = externalIdentifier;
            this.__explicitlySet__.add("externalIdentifier");
            return this;
        }
        /**
         * Date and time the {@code IdentityProviderGroup} was created, in the format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the {@code IdentityProviderGroup} was created, in the format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Date and time the {@code IdentityProviderGroup} was last modified, in the format defined
         * by RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * Date and time the {@code IdentityProviderGroup} was last modified, in the format defined
         * by RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeModified the value to set
         * @return this builder
         */
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityProviderGroupSummary build() {
            IdentityProviderGroupSummary model =
                    new IdentityProviderGroupSummary(
                            this.id,
                            this.identityProviderId,
                            this.displayName,
                            this.name,
                            this.externalIdentifier,
                            this.timeCreated,
                            this.timeModified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityProviderGroupSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("identityProviderId")) {
                this.identityProviderId(model.getIdentityProviderId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("externalIdentifier")) {
                this.externalIdentifier(model.getExternalIdentifier());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
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

    /** The OCID of the {@code IdentityProviderGroup}. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the {@code IdentityProviderGroup}.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the {@code IdentityProvider} this group belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("identityProviderId")
    private final String identityProviderId;

    /**
     * The OCID of the {@code IdentityProvider} this group belongs to.
     *
     * @return the value
     */
    public String getIdentityProviderId() {
        return identityProviderId;
    }

    /** Display name of the group */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the group
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Display name of the group */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Display name of the group
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Identifier of the group in the identity provider */
    @com.fasterxml.jackson.annotation.JsonProperty("externalIdentifier")
    private final String externalIdentifier;

    /**
     * Identifier of the group in the identity provider
     *
     * @return the value
     */
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Date and time the {@code IdentityProviderGroup} was created, in the format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the {@code IdentityProviderGroup} was created, in the format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time the {@code IdentityProviderGroup} was last modified, in the format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * Date and time the {@code IdentityProviderGroup} was last modified, in the format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeModified() {
        return timeModified;
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
        sb.append("IdentityProviderGroupSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", identityProviderId=").append(String.valueOf(this.identityProviderId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", externalIdentifier=").append(String.valueOf(this.externalIdentifier));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityProviderGroupSummary)) {
            return false;
        }

        IdentityProviderGroupSummary other = (IdentityProviderGroupSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.identityProviderId, other.identityProviderId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.externalIdentifier, other.externalIdentifier)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.identityProviderId == null
                                ? 43
                                : this.identityProviderId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.externalIdentifier == null
                                ? 43
                                : this.externalIdentifier.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
