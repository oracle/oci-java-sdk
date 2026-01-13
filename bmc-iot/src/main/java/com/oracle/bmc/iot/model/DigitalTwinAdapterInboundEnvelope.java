/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Payload containing device-specific metadata and optional value mappings used to interpret or
 * transform that metadata. This structure includes the device endpoint, the actual payload, and an
 * optional envelope mapping that applies [JQ](https://stedolan.github.io/jq/) expressions to
 * extract or reshape the data as needed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DigitalTwinAdapterInboundEnvelope.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DigitalTwinAdapterInboundEnvelope
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"referenceEndpoint", "referencePayload", "envelopeMapping"})
    public DigitalTwinAdapterInboundEnvelope(
            String referenceEndpoint,
            DigitalTwinAdapterPayload referencePayload,
            DigitalTwinAdapterEnvelopeMapping envelopeMapping) {
        super();
        this.referenceEndpoint = referenceEndpoint;
        this.referencePayload = referencePayload;
        this.envelopeMapping = envelopeMapping;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The device endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceEndpoint")
        private String referenceEndpoint;

        /**
         * The device endpoint.
         *
         * @param referenceEndpoint the value to set
         * @return this builder
         */
        public Builder referenceEndpoint(String referenceEndpoint) {
            this.referenceEndpoint = referenceEndpoint;
            this.__explicitlySet__.add("referenceEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencePayload")
        private DigitalTwinAdapterPayload referencePayload;

        public Builder referencePayload(DigitalTwinAdapterPayload referencePayload) {
            this.referencePayload = referencePayload;
            this.__explicitlySet__.add("referencePayload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("envelopeMapping")
        private DigitalTwinAdapterEnvelopeMapping envelopeMapping;

        public Builder envelopeMapping(DigitalTwinAdapterEnvelopeMapping envelopeMapping) {
            this.envelopeMapping = envelopeMapping;
            this.__explicitlySet__.add("envelopeMapping");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DigitalTwinAdapterInboundEnvelope build() {
            DigitalTwinAdapterInboundEnvelope model =
                    new DigitalTwinAdapterInboundEnvelope(
                            this.referenceEndpoint, this.referencePayload, this.envelopeMapping);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DigitalTwinAdapterInboundEnvelope model) {
            if (model.wasPropertyExplicitlySet("referenceEndpoint")) {
                this.referenceEndpoint(model.getReferenceEndpoint());
            }
            if (model.wasPropertyExplicitlySet("referencePayload")) {
                this.referencePayload(model.getReferencePayload());
            }
            if (model.wasPropertyExplicitlySet("envelopeMapping")) {
                this.envelopeMapping(model.getEnvelopeMapping());
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

    /** The device endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceEndpoint")
    private final String referenceEndpoint;

    /**
     * The device endpoint.
     *
     * @return the value
     */
    public String getReferenceEndpoint() {
        return referenceEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("referencePayload")
    private final DigitalTwinAdapterPayload referencePayload;

    public DigitalTwinAdapterPayload getReferencePayload() {
        return referencePayload;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("envelopeMapping")
    private final DigitalTwinAdapterEnvelopeMapping envelopeMapping;

    public DigitalTwinAdapterEnvelopeMapping getEnvelopeMapping() {
        return envelopeMapping;
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
        sb.append("DigitalTwinAdapterInboundEnvelope(");
        sb.append("super=").append(super.toString());
        sb.append("referenceEndpoint=").append(String.valueOf(this.referenceEndpoint));
        sb.append(", referencePayload=").append(String.valueOf(this.referencePayload));
        sb.append(", envelopeMapping=").append(String.valueOf(this.envelopeMapping));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DigitalTwinAdapterInboundEnvelope)) {
            return false;
        }

        DigitalTwinAdapterInboundEnvelope other = (DigitalTwinAdapterInboundEnvelope) o;
        return java.util.Objects.equals(this.referenceEndpoint, other.referenceEndpoint)
                && java.util.Objects.equals(this.referencePayload, other.referencePayload)
                && java.util.Objects.equals(this.envelopeMapping, other.envelopeMapping)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.referenceEndpoint == null ? 43 : this.referenceEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.referencePayload == null ? 43 : this.referencePayload.hashCode());
        result =
                (result * PRIME)
                        + (this.envelopeMapping == null ? 43 : this.envelopeMapping.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
