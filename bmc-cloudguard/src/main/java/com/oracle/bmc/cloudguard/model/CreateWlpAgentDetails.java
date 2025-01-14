/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * On-premise resource agent registration request resource. Example: {@code {"compartmentId":
 * "ocid1.compartment.oc1..exampleawwcufihrc62gpbcvbjizswgoj4w7rg5q4fwbg2fauxvlcxbtliaa",
 * "agentVersion": "1.0.11", "certificateSignedRequest": "MIIGwjCCBaqgAwIBAgIVAK8hJCS/5Hu0dEMQ2ud"}}
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateWlpAgentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateWlpAgentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "agentVersion",
        "certificateSignedRequest",
        "osInfo",
        "freeformTags",
        "definedTags"
    })
    public CreateWlpAgentDetails(
            String compartmentId,
            String agentVersion,
            String certificateSignedRequest,
            String osInfo,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.agentVersion = agentVersion;
        this.certificateSignedRequest = certificateSignedRequest;
        this.osInfo = osInfo;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compartment OCID of the host */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID of the host
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The version of the agent making the request */
        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        /**
         * The version of the agent making the request
         *
         * @param agentVersion the value to set
         * @return this builder
         */
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }
        /**
         * The certificate signed request containing domain, organization names, organization units,
         * city, state, country, email and public key, among other certificate details, signed by
         * private key
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateSignedRequest")
        private String certificateSignedRequest;

        /**
         * The certificate signed request containing domain, organization names, organization units,
         * city, state, country, email and public key, among other certificate details, signed by
         * private key
         *
         * @param certificateSignedRequest the value to set
         * @return this builder
         */
        public Builder certificateSignedRequest(String certificateSignedRequest) {
            this.certificateSignedRequest = certificateSignedRequest;
            this.__explicitlySet__.add("certificateSignedRequest");
            return this;
        }
        /**
         * Concatenated OS name, OS version and agent architecture; for example, ubuntu_22.0_amd64.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("osInfo")
        private String osInfo;

        /**
         * Concatenated OS name, OS version and agent architecture; for example, ubuntu_22.0_amd64.
         *
         * @param osInfo the value to set
         * @return this builder
         */
        public Builder osInfo(String osInfo) {
            this.osInfo = osInfo;
            this.__explicitlySet__.add("osInfo");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateWlpAgentDetails build() {
            CreateWlpAgentDetails model =
                    new CreateWlpAgentDetails(
                            this.compartmentId,
                            this.agentVersion,
                            this.certificateSignedRequest,
                            this.osInfo,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWlpAgentDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("agentVersion")) {
                this.agentVersion(model.getAgentVersion());
            }
            if (model.wasPropertyExplicitlySet("certificateSignedRequest")) {
                this.certificateSignedRequest(model.getCertificateSignedRequest());
            }
            if (model.wasPropertyExplicitlySet("osInfo")) {
                this.osInfo(model.getOsInfo());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** Compartment OCID of the host */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID of the host
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The version of the agent making the request */
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    private final String agentVersion;

    /**
     * The version of the agent making the request
     *
     * @return the value
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * The certificate signed request containing domain, organization names, organization units,
     * city, state, country, email and public key, among other certificate details, signed by
     * private key
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateSignedRequest")
    private final String certificateSignedRequest;

    /**
     * The certificate signed request containing domain, organization names, organization units,
     * city, state, country, email and public key, among other certificate details, signed by
     * private key
     *
     * @return the value
     */
    public String getCertificateSignedRequest() {
        return certificateSignedRequest;
    }

    /** Concatenated OS name, OS version and agent architecture; for example, ubuntu_22.0_amd64. */
    @com.fasterxml.jackson.annotation.JsonProperty("osInfo")
    private final String osInfo;

    /**
     * Concatenated OS name, OS version and agent architecture; for example, ubuntu_22.0_amd64.
     *
     * @return the value
     */
    public String getOsInfo() {
        return osInfo;
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
        sb.append("CreateWlpAgentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", agentVersion=").append(String.valueOf(this.agentVersion));
        sb.append(", certificateSignedRequest=")
                .append(String.valueOf(this.certificateSignedRequest));
        sb.append(", osInfo=").append(String.valueOf(this.osInfo));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWlpAgentDetails)) {
            return false;
        }

        CreateWlpAgentDetails other = (CreateWlpAgentDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.agentVersion, other.agentVersion)
                && java.util.Objects.equals(
                        this.certificateSignedRequest, other.certificateSignedRequest)
                && java.util.Objects.equals(this.osInfo, other.osInfo)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.agentVersion == null ? 43 : this.agentVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateSignedRequest == null
                                ? 43
                                : this.certificateSignedRequest.hashCode());
        result = (result * PRIME) + (this.osInfo == null ? 43 : this.osInfo.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
