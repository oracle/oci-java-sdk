/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.model;

/**
 * Tenancy level customer email configuration details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Configuration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Configuration extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "httpSubmitEndpoint", "smtpSubmitEndpoint"})
    public Configuration(
            String compartmentId, String httpSubmitEndpoint, String smtpSubmitEndpoint) {
        super();
        this.compartmentId = compartmentId;
        this.httpSubmitEndpoint = httpSubmitEndpoint;
        this.smtpSubmitEndpoint = smtpSubmitEndpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The root compartment
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (same
         * as the tenancy OCID)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The root compartment
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (same
         * as the tenancy OCID)
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Endpoint used to submit emails via the HTTP email submission API */
        @com.fasterxml.jackson.annotation.JsonProperty("httpSubmitEndpoint")
        private String httpSubmitEndpoint;

        /**
         * Endpoint used to submit emails via the HTTP email submission API
         *
         * @param httpSubmitEndpoint the value to set
         * @return this builder
         */
        public Builder httpSubmitEndpoint(String httpSubmitEndpoint) {
            this.httpSubmitEndpoint = httpSubmitEndpoint;
            this.__explicitlySet__.add("httpSubmitEndpoint");
            return this;
        }
        /**
         * Endpoint used to submit emails via the standard SMTP submission protocol. Note that TLS
         * 1.2 and standard SMTP authentication is required for submission.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("smtpSubmitEndpoint")
        private String smtpSubmitEndpoint;

        /**
         * Endpoint used to submit emails via the standard SMTP submission protocol. Note that TLS
         * 1.2 and standard SMTP authentication is required for submission.
         *
         * @param smtpSubmitEndpoint the value to set
         * @return this builder
         */
        public Builder smtpSubmitEndpoint(String smtpSubmitEndpoint) {
            this.smtpSubmitEndpoint = smtpSubmitEndpoint;
            this.__explicitlySet__.add("smtpSubmitEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Configuration build() {
            Configuration model =
                    new Configuration(
                            this.compartmentId, this.httpSubmitEndpoint, this.smtpSubmitEndpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Configuration model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("httpSubmitEndpoint")) {
                this.httpSubmitEndpoint(model.getHttpSubmitEndpoint());
            }
            if (model.wasPropertyExplicitlySet("smtpSubmitEndpoint")) {
                this.smtpSubmitEndpoint(model.getSmtpSubmitEndpoint());
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

    /**
     * The root compartment
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (same as
     * the tenancy OCID)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The root compartment
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (same as
     * the tenancy OCID)
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Endpoint used to submit emails via the HTTP email submission API */
    @com.fasterxml.jackson.annotation.JsonProperty("httpSubmitEndpoint")
    private final String httpSubmitEndpoint;

    /**
     * Endpoint used to submit emails via the HTTP email submission API
     *
     * @return the value
     */
    public String getHttpSubmitEndpoint() {
        return httpSubmitEndpoint;
    }

    /**
     * Endpoint used to submit emails via the standard SMTP submission protocol. Note that TLS 1.2
     * and standard SMTP authentication is required for submission.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("smtpSubmitEndpoint")
    private final String smtpSubmitEndpoint;

    /**
     * Endpoint used to submit emails via the standard SMTP submission protocol. Note that TLS 1.2
     * and standard SMTP authentication is required for submission.
     *
     * @return the value
     */
    public String getSmtpSubmitEndpoint() {
        return smtpSubmitEndpoint;
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
        sb.append("Configuration(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", httpSubmitEndpoint=").append(String.valueOf(this.httpSubmitEndpoint));
        sb.append(", smtpSubmitEndpoint=").append(String.valueOf(this.smtpSubmitEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Configuration)) {
            return false;
        }

        Configuration other = (Configuration) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.httpSubmitEndpoint, other.httpSubmitEndpoint)
                && java.util.Objects.equals(this.smtpSubmitEndpoint, other.smtpSubmitEndpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.httpSubmitEndpoint == null
                                ? 43
                                : this.httpSubmitEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.smtpSubmitEndpoint == null
                                ? 43
                                : this.smtpSubmitEndpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
