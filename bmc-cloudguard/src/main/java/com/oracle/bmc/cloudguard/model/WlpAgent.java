/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of WLP agent. Example: {@code {"id":
 * "ocid1.wlpagent.oc1..exampleawwcufihrc62gpbcvbjizswgoj4w7rg5q4fwbg", "compartmentId":
 * "ocid1.compartment.oc1..exampleawwcufihrc62gpbcvbjizswgoj4w7rg5q4fwbg2fauxvlcxbtliaa",
 * "agentVersion": "1.0.11", "certificateId":
 * "ocid1.certificate.oc1..exampleawwcufihrc62gpbcvbjizswgoj4w7oj4w7rg5q4fwbg2fauxv"
 * "certificateSignedRequest": "MIIGwjCCBaqgAwIBAgIVAK8hJCS/5Hu0dEMQ2ud"}} <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WlpAgent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WlpAgent extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "hostId",
        "tenantId",
        "compartmentId",
        "agentVersion",
        "certificateId",
        "certificateSignedRequest",
        "timeCreated",
        "timeUpdated",
        "locks",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public WlpAgent(
            String id,
            String hostId,
            String tenantId,
            String compartmentId,
            String agentVersion,
            String certificateId,
            String certificateSignedRequest,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<ResourceLock> locks,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.hostId = hostId;
        this.tenantId = tenantId;
        this.compartmentId = compartmentId;
        this.agentVersion = agentVersion;
        this.certificateId = certificateId;
        this.certificateSignedRequest = certificateSignedRequest;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.locks = locks;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID for WlpAgent */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for WlpAgent
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID for instance in which WlpAgent is installed */
        @com.fasterxml.jackson.annotation.JsonProperty("hostId")
        private String hostId;

        /**
         * OCID for instance in which WlpAgent is installed
         *
         * @param hostId the value to set
         * @return this builder
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            this.__explicitlySet__.add("hostId");
            return this;
        }
        /** TenantId of the host */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * TenantId of the host
         *
         * @param tenantId the value to set
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /** Compartment OCID of WlpAgent. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID of WlpAgent.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The version of the agent */
        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        /**
         * The version of the agent
         *
         * @param agentVersion the value to set
         * @return this builder
         */
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }
        /** The certificate ID returned by OCI certificates service */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The certificate ID returned by OCI certificates service
         *
         * @param certificateId the value to set
         * @return this builder
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }
        /** The updated certificate signing request */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateSignedRequest")
        private String certificateSignedRequest;

        /**
         * The updated certificate signing request
         *
         * @param certificateSignedRequest the value to set
         * @return this builder
         */
        public Builder certificateSignedRequest(String certificateSignedRequest) {
            this.certificateSignedRequest = certificateSignedRequest;
            this.__explicitlySet__.add("certificateSignedRequest");
            return this;
        }
        /** The date and time the WlpAgent was created. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the WlpAgent was created. Format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the WlpAgent was updated. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the WlpAgent was updated. Format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WlpAgent build() {
            WlpAgent model =
                    new WlpAgent(
                            this.id,
                            this.hostId,
                            this.tenantId,
                            this.compartmentId,
                            this.agentVersion,
                            this.certificateId,
                            this.certificateSignedRequest,
                            this.timeCreated,
                            this.timeUpdated,
                            this.locks,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WlpAgent model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("hostId")) {
                this.hostId(model.getHostId());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("agentVersion")) {
                this.agentVersion(model.getAgentVersion());
            }
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("certificateSignedRequest")) {
                this.certificateSignedRequest(model.getCertificateSignedRequest());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** OCID for WlpAgent */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for WlpAgent
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID for instance in which WlpAgent is installed */
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    private final String hostId;

    /**
     * OCID for instance in which WlpAgent is installed
     *
     * @return the value
     */
    public String getHostId() {
        return hostId;
    }

    /** TenantId of the host */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * TenantId of the host
     *
     * @return the value
     */
    public String getTenantId() {
        return tenantId;
    }

    /** Compartment OCID of WlpAgent. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID of WlpAgent.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The version of the agent */
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    private final String agentVersion;

    /**
     * The version of the agent
     *
     * @return the value
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /** The certificate ID returned by OCI certificates service */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The certificate ID returned by OCI certificates service
     *
     * @return the value
     */
    public String getCertificateId() {
        return certificateId;
    }

    /** The updated certificate signing request */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateSignedRequest")
    private final String certificateSignedRequest;

    /**
     * The updated certificate signing request
     *
     * @return the value
     */
    public String getCertificateSignedRequest() {
        return certificateSignedRequest;
    }

    /** The date and time the WlpAgent was created. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the WlpAgent was created. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the WlpAgent was updated. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the WlpAgent was updated. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("WlpAgent(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", hostId=").append(String.valueOf(this.hostId));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", agentVersion=").append(String.valueOf(this.agentVersion));
        sb.append(", certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", certificateSignedRequest=")
                .append(String.valueOf(this.certificateSignedRequest));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WlpAgent)) {
            return false;
        }

        WlpAgent other = (WlpAgent) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.agentVersion, other.agentVersion)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(
                        this.certificateSignedRequest, other.certificateSignedRequest)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.agentVersion == null ? 43 : this.agentVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateSignedRequest == null
                                ? 43
                                : this.certificateSignedRequest.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
