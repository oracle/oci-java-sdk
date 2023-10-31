/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The resource represents the state of a specific entry type deployment on a target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SecurityPolicyEntryStateSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityPolicyEntryStateSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "securityPolicyEntryId",
        "securityPolicyDeploymentId",
        "deploymentStatus"
    })
    public SecurityPolicyEntryStateSummary(
            String id,
            String securityPolicyEntryId,
            String securityPolicyDeploymentId,
            SecurityPolicyEntryStateDeploymentStatus deploymentStatus) {
        super();
        this.id = id;
        this.securityPolicyEntryId = securityPolicyEntryId;
        this.securityPolicyDeploymentId = securityPolicyDeploymentId;
        this.deploymentStatus = deploymentStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique id of the security policy entry state. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique id of the security policy entry state.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the security policy entry associated. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyEntryId")
        private String securityPolicyEntryId;

        /**
         * The OCID of the security policy entry associated.
         *
         * @param securityPolicyEntryId the value to set
         * @return this builder
         */
        public Builder securityPolicyEntryId(String securityPolicyEntryId) {
            this.securityPolicyEntryId = securityPolicyEntryId;
            this.__explicitlySet__.add("securityPolicyEntryId");
            return this;
        }
        /** The OCID of the security policy deployment associated. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyDeploymentId")
        private String securityPolicyDeploymentId;

        /**
         * The OCID of the security policy deployment associated.
         *
         * @param securityPolicyDeploymentId the value to set
         * @return this builder
         */
        public Builder securityPolicyDeploymentId(String securityPolicyDeploymentId) {
            this.securityPolicyDeploymentId = securityPolicyDeploymentId;
            this.__explicitlySet__.add("securityPolicyDeploymentId");
            return this;
        }
        /**
         * The current deployment status of the security policy deployment and the security policy
         * entry associated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentStatus")
        private SecurityPolicyEntryStateDeploymentStatus deploymentStatus;

        /**
         * The current deployment status of the security policy deployment and the security policy
         * entry associated.
         *
         * @param deploymentStatus the value to set
         * @return this builder
         */
        public Builder deploymentStatus(SecurityPolicyEntryStateDeploymentStatus deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            this.__explicitlySet__.add("deploymentStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityPolicyEntryStateSummary build() {
            SecurityPolicyEntryStateSummary model =
                    new SecurityPolicyEntryStateSummary(
                            this.id,
                            this.securityPolicyEntryId,
                            this.securityPolicyDeploymentId,
                            this.deploymentStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityPolicyEntryStateSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("securityPolicyEntryId")) {
                this.securityPolicyEntryId(model.getSecurityPolicyEntryId());
            }
            if (model.wasPropertyExplicitlySet("securityPolicyDeploymentId")) {
                this.securityPolicyDeploymentId(model.getSecurityPolicyDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("deploymentStatus")) {
                this.deploymentStatus(model.getDeploymentStatus());
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

    /** Unique id of the security policy entry state. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique id of the security policy entry state.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the security policy entry associated. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyEntryId")
    private final String securityPolicyEntryId;

    /**
     * The OCID of the security policy entry associated.
     *
     * @return the value
     */
    public String getSecurityPolicyEntryId() {
        return securityPolicyEntryId;
    }

    /** The OCID of the security policy deployment associated. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyDeploymentId")
    private final String securityPolicyDeploymentId;

    /**
     * The OCID of the security policy deployment associated.
     *
     * @return the value
     */
    public String getSecurityPolicyDeploymentId() {
        return securityPolicyDeploymentId;
    }

    /**
     * The current deployment status of the security policy deployment and the security policy entry
     * associated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentStatus")
    private final SecurityPolicyEntryStateDeploymentStatus deploymentStatus;

    /**
     * The current deployment status of the security policy deployment and the security policy entry
     * associated.
     *
     * @return the value
     */
    public SecurityPolicyEntryStateDeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
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
        sb.append("SecurityPolicyEntryStateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", securityPolicyEntryId=").append(String.valueOf(this.securityPolicyEntryId));
        sb.append(", securityPolicyDeploymentId=")
                .append(String.valueOf(this.securityPolicyDeploymentId));
        sb.append(", deploymentStatus=").append(String.valueOf(this.deploymentStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityPolicyEntryStateSummary)) {
            return false;
        }

        SecurityPolicyEntryStateSummary other = (SecurityPolicyEntryStateSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.securityPolicyEntryId, other.securityPolicyEntryId)
                && java.util.Objects.equals(
                        this.securityPolicyDeploymentId, other.securityPolicyDeploymentId)
                && java.util.Objects.equals(this.deploymentStatus, other.deploymentStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.securityPolicyEntryId == null
                                ? 43
                                : this.securityPolicyEntryId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityPolicyDeploymentId == null
                                ? 43
                                : this.securityPolicyDeploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentStatus == null ? 43 : this.deploymentStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
