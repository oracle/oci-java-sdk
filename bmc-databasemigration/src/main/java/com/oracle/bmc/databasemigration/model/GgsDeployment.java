/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details about Oracle GoldenGate GGS Deployment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GgsDeployment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GgsDeployment extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "ggsAdminCredentialsSecretId"})
    public GgsDeployment(String deploymentId, String ggsAdminCredentialsSecretId) {
        super();
        this.deploymentId = deploymentId;
        this.ggsAdminCredentialsSecretId = ggsAdminCredentialsSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource being referenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
        private String deploymentId;

        /**
         * The OCID of the resource being referenced.
         * @param deploymentId the value to set
         * @return this builder
         **/
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            this.__explicitlySet__.add("deploymentId");
            return this;
        }
        /**
         * The OCID of the resource being referenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ggsAdminCredentialsSecretId")
        private String ggsAdminCredentialsSecretId;

        /**
         * The OCID of the resource being referenced.
         * @param ggsAdminCredentialsSecretId the value to set
         * @return this builder
         **/
        public Builder ggsAdminCredentialsSecretId(String ggsAdminCredentialsSecretId) {
            this.ggsAdminCredentialsSecretId = ggsAdminCredentialsSecretId;
            this.__explicitlySet__.add("ggsAdminCredentialsSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GgsDeployment build() {
            GgsDeployment model =
                    new GgsDeployment(this.deploymentId, this.ggsAdminCredentialsSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GgsDeployment model) {
            if (model.wasPropertyExplicitlySet("deploymentId")) {
                this.deploymentId(model.getDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("ggsAdminCredentialsSecretId")) {
                this.ggsAdminCredentialsSecretId(model.getGgsAdminCredentialsSecretId());
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
     * The OCID of the resource being referenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
    private final String deploymentId;

    /**
     * The OCID of the resource being referenced.
     * @return the value
     **/
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * The OCID of the resource being referenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ggsAdminCredentialsSecretId")
    private final String ggsAdminCredentialsSecretId;

    /**
     * The OCID of the resource being referenced.
     * @return the value
     **/
    public String getGgsAdminCredentialsSecretId() {
        return ggsAdminCredentialsSecretId;
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
        sb.append("GgsDeployment(");
        sb.append("super=").append(super.toString());
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", ggsAdminCredentialsSecretId=")
                .append(String.valueOf(this.ggsAdminCredentialsSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GgsDeployment)) {
            return false;
        }

        GgsDeployment other = (GgsDeployment) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(
                        this.ggsAdminCredentialsSecretId, other.ggsAdminCredentialsSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.ggsAdminCredentialsSecretId == null
                                ? 43
                                : this.ggsAdminCredentialsSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
