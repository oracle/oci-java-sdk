/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Details to update a {@code PathAnalyzerTest} resource.
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
    builder = UpdatePathAnalyzerTestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdatePathAnalyzerTestDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "protocol",
        "sourceEndpoint",
        "destinationEndpoint",
        "protocolParameters",
        "queryOptions",
        "freeformTags",
        "definedTags"
    })
    public UpdatePathAnalyzerTestDetails(
            String displayName,
            Integer protocol,
            Endpoint sourceEndpoint,
            Endpoint destinationEndpoint,
            ProtocolParameters protocolParameters,
            QueryOptions queryOptions,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.protocol = protocol;
        this.sourceEndpoint = sourceEndpoint;
        this.destinationEndpoint = destinationEndpoint;
        this.protocolParameters = protocolParameters;
        this.queryOptions = queryOptions;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The IP protocol to use in the {@code PathAnalyzerTest} resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Integer protocol;

        /**
         * The IP protocol to use in the {@code PathAnalyzerTest} resource.
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
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePathAnalyzerTestDetails build() {
            UpdatePathAnalyzerTestDetails __instance__ =
                    new UpdatePathAnalyzerTestDetails(
                            displayName,
                            protocol,
                            sourceEndpoint,
                            destinationEndpoint,
                            protocolParameters,
                            queryOptions,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePathAnalyzerTestDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .protocol(o.getProtocol())
                            .sourceEndpoint(o.getSourceEndpoint())
                            .destinationEndpoint(o.getDestinationEndpoint())
                            .protocolParameters(o.getProtocolParameters())
                            .queryOptions(o.getQueryOptions())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The IP protocol to use in the {@code PathAnalyzerTest} resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Integer protocol;

    /**
     * The IP protocol to use in the {@code PathAnalyzerTest} resource.
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

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdatePathAnalyzerTestDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", sourceEndpoint=").append(String.valueOf(this.sourceEndpoint));
        sb.append(", destinationEndpoint=").append(String.valueOf(this.destinationEndpoint));
        sb.append(", protocolParameters=").append(String.valueOf(this.protocolParameters));
        sb.append(", queryOptions=").append(String.valueOf(this.queryOptions));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePathAnalyzerTestDetails)) {
            return false;
        }

        UpdatePathAnalyzerTestDetails other = (UpdatePathAnalyzerTestDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.sourceEndpoint, other.sourceEndpoint)
                && java.util.Objects.equals(this.destinationEndpoint, other.destinationEndpoint)
                && java.util.Objects.equals(this.protocolParameters, other.protocolParameters)
                && java.util.Objects.equals(this.queryOptions, other.queryOptions)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
