/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details to create an 'EXADB_STACK' type Exadata Fleet Update Discovery. Currently, components
 * allowed in an Exadata software stack are 'GUEST_OS' and 'GI'. At least two distinct component
 * types are required for an Exadata software stack. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExadbStackDiscoveryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadbStackDiscoveryDetails extends DiscoveryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private DiscoveryServiceTypes serviceType;

        public Builder serviceType(DiscoveryServiceTypes serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /** Discovery filter details of components in an Exadata software stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("components")
        private java.util.List<SoftwareComponentDiscoveryDetails> components;

        /**
         * Discovery filter details of components in an Exadata software stack.
         *
         * @param components the value to set
         * @return this builder
         */
        public Builder components(java.util.List<SoftwareComponentDiscoveryDetails> components) {
            this.components = components;
            this.__explicitlySet__.add("components");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadbStackDiscoveryDetails build() {
            ExadbStackDiscoveryDetails model =
                    new ExadbStackDiscoveryDetails(this.serviceType, this.components);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadbStackDiscoveryDetails model) {
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("components")) {
                this.components(model.getComponents());
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

    @Deprecated
    public ExadbStackDiscoveryDetails(
            DiscoveryServiceTypes serviceType,
            java.util.List<SoftwareComponentDiscoveryDetails> components) {
        super(serviceType);
        this.components = components;
    }

    /** Discovery filter details of components in an Exadata software stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("components")
    private final java.util.List<SoftwareComponentDiscoveryDetails> components;

    /**
     * Discovery filter details of components in an Exadata software stack.
     *
     * @return the value
     */
    public java.util.List<SoftwareComponentDiscoveryDetails> getComponents() {
        return components;
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
        sb.append("ExadbStackDiscoveryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", components=").append(String.valueOf(this.components));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadbStackDiscoveryDetails)) {
            return false;
        }

        ExadbStackDiscoveryDetails other = (ExadbStackDiscoveryDetails) o;
        return java.util.Objects.equals(this.components, other.components) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.components == null ? 43 : this.components.hashCode());
        return result;
    }
}
