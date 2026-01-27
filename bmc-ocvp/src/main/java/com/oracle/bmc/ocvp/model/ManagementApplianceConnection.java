/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Management appliance connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementApplianceConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementApplianceConnection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "credentialsSecretId"})
    public ManagementApplianceConnection(
            ManagementApplianceConnectionType type, String credentialsSecretId) {
        super();
        this.type = type;
        this.credentialsSecretId = credentialsSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private ManagementApplianceConnectionType type;

        /**
         * Type of connection.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(ManagementApplianceConnectionType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * secret in OCI vault, that is used for storage of username and password in JSON format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
        private String credentialsSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * secret in OCI vault, that is used for storage of username and password in JSON format.
         *
         * @param credentialsSecretId the value to set
         * @return this builder
         */
        public Builder credentialsSecretId(String credentialsSecretId) {
            this.credentialsSecretId = credentialsSecretId;
            this.__explicitlySet__.add("credentialsSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementApplianceConnection build() {
            ManagementApplianceConnection model =
                    new ManagementApplianceConnection(this.type, this.credentialsSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementApplianceConnection model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("credentialsSecretId")) {
                this.credentialsSecretId(model.getCredentialsSecretId());
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

    /** Type of connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ManagementApplianceConnectionType type;

    /**
     * Type of connection.
     *
     * @return the value
     */
    public ManagementApplianceConnectionType getType() {
        return type;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of secret
     * in OCI vault, that is used for storage of username and password in JSON format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
    private final String credentialsSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of secret
     * in OCI vault, that is used for storage of username and password in JSON format.
     *
     * @return the value
     */
    public String getCredentialsSecretId() {
        return credentialsSecretId;
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
        sb.append("ManagementApplianceConnection(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", credentialsSecretId=").append(String.valueOf(this.credentialsSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementApplianceConnection)) {
            return false;
        }

        ManagementApplianceConnection other = (ManagementApplianceConnection) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.credentialsSecretId, other.credentialsSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialsSecretId == null
                                ? 43
                                : this.credentialsSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
