/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration for getting an ad-hoc path analysis.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdhocGetPathAnalysisDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdhocGetPathAnalysisDetails extends GetPathAnalysisDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The IP protocol to used for the path analysis.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Integer protocol;

        /**
         * The IP protocol to used for the path analysis.
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(Integer protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceEndpoint")
        private Endpoint sourceEndpoint;

        public Builder sourceEndpoint(Endpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            this.__explicitlySet__.add("sourceEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationEndpoint")
        private Endpoint destinationEndpoint;

        public Builder destinationEndpoint(Endpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            this.__explicitlySet__.add("destinationEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocolParameters")
        private ProtocolParameters protocolParameters;

        public Builder protocolParameters(ProtocolParameters protocolParameters) {
            this.protocolParameters = protocolParameters;
            this.__explicitlySet__.add("protocolParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryOptions")
        private QueryOptions queryOptions;

        public Builder queryOptions(QueryOptions queryOptions) {
            this.queryOptions = queryOptions;
            this.__explicitlySet__.add("queryOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdhocGetPathAnalysisDetails build() {
            AdhocGetPathAnalysisDetails model =
                    new AdhocGetPathAnalysisDetails(
                            this.compartmentId,
                            this.protocol,
                            this.sourceEndpoint,
                            this.destinationEndpoint,
                            this.protocolParameters,
                            this.queryOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdhocGetPathAnalysisDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("sourceEndpoint")) {
                this.sourceEndpoint(model.getSourceEndpoint());
            }
            if (model.wasPropertyExplicitlySet("destinationEndpoint")) {
                this.destinationEndpoint(model.getDestinationEndpoint());
            }
            if (model.wasPropertyExplicitlySet("protocolParameters")) {
                this.protocolParameters(model.getProtocolParameters());
            }
            if (model.wasPropertyExplicitlySet("queryOptions")) {
                this.queryOptions(model.getQueryOptions());
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

    @Deprecated
    public AdhocGetPathAnalysisDetails(
            String compartmentId,
            Integer protocol,
            Endpoint sourceEndpoint,
            Endpoint destinationEndpoint,
            ProtocolParameters protocolParameters,
            QueryOptions queryOptions) {
        super();
        this.compartmentId = compartmentId;
        this.protocol = protocol;
        this.sourceEndpoint = sourceEndpoint;
        this.destinationEndpoint = destinationEndpoint;
        this.protocolParameters = protocolParameters;
        this.queryOptions = queryOptions;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The IP protocol to used for the path analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Integer protocol;

    /**
     * The IP protocol to used for the path analysis.
     * @return the value
     **/
    public Integer getProtocol() {
        return protocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceEndpoint")
    private final Endpoint sourceEndpoint;

    public Endpoint getSourceEndpoint() {
        return sourceEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("destinationEndpoint")
    private final Endpoint destinationEndpoint;

    public Endpoint getDestinationEndpoint() {
        return destinationEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("protocolParameters")
    private final ProtocolParameters protocolParameters;

    public ProtocolParameters getProtocolParameters() {
        return protocolParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryOptions")
    private final QueryOptions queryOptions;

    public QueryOptions getQueryOptions() {
        return queryOptions;
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
        sb.append("AdhocGetPathAnalysisDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", sourceEndpoint=").append(String.valueOf(this.sourceEndpoint));
        sb.append(", destinationEndpoint=").append(String.valueOf(this.destinationEndpoint));
        sb.append(", protocolParameters=").append(String.valueOf(this.protocolParameters));
        sb.append(", queryOptions=").append(String.valueOf(this.queryOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdhocGetPathAnalysisDetails)) {
            return false;
        }

        AdhocGetPathAnalysisDetails other = (AdhocGetPathAnalysisDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.sourceEndpoint, other.sourceEndpoint)
                && java.util.Objects.equals(this.destinationEndpoint, other.destinationEndpoint)
                && java.util.Objects.equals(this.protocolParameters, other.protocolParameters)
                && java.util.Objects.equals(this.queryOptions, other.queryOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceEndpoint == null ? 43 : this.sourceEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationEndpoint == null
                                ? 43
                                : this.destinationEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.protocolParameters == null
                                ? 43
                                : this.protocolParameters.hashCode());
        result = (result * PRIME) + (this.queryOptions == null ? 43 : this.queryOptions.hashCode());
        return result;
    }
}
