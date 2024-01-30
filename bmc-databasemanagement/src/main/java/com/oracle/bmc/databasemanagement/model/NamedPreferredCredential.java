/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the 'NAMED_CREDENTIAL' preferred credential. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NamedPreferredCredential.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NamedPreferredCredential extends PreferredCredential {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
        private String credentialName;

        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            this.__explicitlySet__.add("credentialName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private PreferredCredentialStatus status;

        public Builder status(PreferredCredentialStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAccessible")
        private Boolean isAccessible;

        public Builder isAccessible(Boolean isAccessible) {
            this.isAccessible = isAccessible;
            this.__explicitlySet__.add("isAccessible");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Named Credential that contains the database user password metadata.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namedCredentialId")
        private String namedCredentialId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Named Credential that contains the database user password metadata.
         *
         * @param namedCredentialId the value to set
         * @return this builder
         */
        public Builder namedCredentialId(String namedCredentialId) {
            this.namedCredentialId = namedCredentialId;
            this.__explicitlySet__.add("namedCredentialId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamedPreferredCredential build() {
            NamedPreferredCredential model =
                    new NamedPreferredCredential(
                            this.credentialName,
                            this.status,
                            this.isAccessible,
                            this.namedCredentialId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamedPreferredCredential model) {
            if (model.wasPropertyExplicitlySet("credentialName")) {
                this.credentialName(model.getCredentialName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("isAccessible")) {
                this.isAccessible(model.getIsAccessible());
            }
            if (model.wasPropertyExplicitlySet("namedCredentialId")) {
                this.namedCredentialId(model.getNamedCredentialId());
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
    public NamedPreferredCredential(
            String credentialName,
            PreferredCredentialStatus status,
            Boolean isAccessible,
            String namedCredentialId) {
        super(credentialName, status, isAccessible);
        this.namedCredentialId = namedCredentialId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Named Credential that contains the database user password metadata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namedCredentialId")
    private final String namedCredentialId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Named Credential that contains the database user password metadata.
     *
     * @return the value
     */
    public String getNamedCredentialId() {
        return namedCredentialId;
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
        sb.append("NamedPreferredCredential(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namedCredentialId=").append(String.valueOf(this.namedCredentialId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NamedPreferredCredential)) {
            return false;
        }

        NamedPreferredCredential other = (NamedPreferredCredential) o;
        return java.util.Objects.equals(this.namedCredentialId, other.namedCredentialId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namedCredentialId == null ? 43 : this.namedCredentialId.hashCode());
        return result;
    }
}
