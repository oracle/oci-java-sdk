/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Mapped secret used on the firewall policy rules. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MappedSecretSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MappedSecretSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "source", "type", "parentResourceId"})
    public MappedSecretSummary(
            String name, String source, InspectionType type, String parentResourceId) {
        super();
        this.name = name;
        this.source = source;
        this.type = type;
        this.parentResourceId = parentResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the secret.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Source of the secrets, where the secrets are stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * Source of the secrets, where the secrets are stored.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * Type of the secrets mapped based on the policy.
         *
         * <p>{@code SSL_INBOUND_INSPECTION}: For Inbound inspection of SSL traffic. * {@code
         * SSL_FORWARD_PROXY}: For forward proxy certificates for SSL inspection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private InspectionType type;

        /**
         * Type of the secrets mapped based on the policy.
         *
         * <p>{@code SSL_INBOUND_INSPECTION}: For Inbound inspection of SSL traffic. * {@code
         * SSL_FORWARD_PROXY}: For forward proxy certificates for SSL inspection.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(InspectionType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** OCID of the Network Firewall Policy this mapped secret belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        /**
         * OCID of the Network Firewall Policy this mapped secret belongs to.
         *
         * @param parentResourceId the value to set
         * @return this builder
         */
        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            this.__explicitlySet__.add("parentResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MappedSecretSummary build() {
            MappedSecretSummary model =
                    new MappedSecretSummary(
                            this.name, this.source, this.type, this.parentResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MappedSecretSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("parentResourceId")) {
                this.parentResourceId(model.getParentResourceId());
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

    /** Name of the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the secret.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Source of the secrets, where the secrets are stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * Source of the secrets, where the secrets are stored.
     *
     * @return the value
     */
    public String getSource() {
        return source;
    }

    /**
     * Type of the secrets mapped based on the policy.
     *
     * <p>{@code SSL_INBOUND_INSPECTION}: For Inbound inspection of SSL traffic. * {@code
     * SSL_FORWARD_PROXY}: For forward proxy certificates for SSL inspection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final InspectionType type;

    /**
     * Type of the secrets mapped based on the policy.
     *
     * <p>{@code SSL_INBOUND_INSPECTION}: For Inbound inspection of SSL traffic. * {@code
     * SSL_FORWARD_PROXY}: For forward proxy certificates for SSL inspection.
     *
     * @return the value
     */
    public InspectionType getType() {
        return type;
    }

    /** OCID of the Network Firewall Policy this mapped secret belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the Network Firewall Policy this mapped secret belongs to.
     *
     * @return the value
     */
    public String getParentResourceId() {
        return parentResourceId;
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
        sb.append("MappedSecretSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", parentResourceId=").append(String.valueOf(this.parentResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MappedSecretSummary)) {
            return false;
        }

        MappedSecretSummary other = (MappedSecretSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.parentResourceId, other.parentResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourceId == null ? 43 : this.parentResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
