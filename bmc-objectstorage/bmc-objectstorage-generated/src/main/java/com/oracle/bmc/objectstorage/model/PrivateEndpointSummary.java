/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
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
    builder = PrivateEndpointSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PrivateEndpointSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "namespace",
        "compartmentId",
        "createdBy",
        "timeCreated",
        "timeModified",
        "prefix",
        "fqdns",
        "etag",
        "lifecycleState"
    })
    public PrivateEndpointSummary(
            String name,
            String namespace,
            String compartmentId,
            String createdBy,
            java.util.Date timeCreated,
            java.util.Date timeModified,
            String prefix,
            Fqdns fqdns,
            String etag,
            PrivateEndpoint.LifecycleState lifecycleState) {
        super();
        this.name = name;
        this.namespace = namespace;
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
        this.prefix = prefix;
        this.fqdns = fqdns;
        this.etag = etag;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name given to the Private Endpoint. Avoid entering confidential information.
         * Example: my-new-pe1
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name given to the Private Endpoint. Avoid entering confidential information.
         * Example: my-new-pe1
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The Object Storage namespace with which the Private Endpoint is associated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace with which the Private Endpoint is associated.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The compartment ID in which the Private Endpoint is authorized.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment ID in which the Private Endpoint is authorized.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the Private Endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the Private Endpoint.
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The date and time the Private Endpoint was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Private Endpoint was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the Private Endpoint was updated, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The date and time the Private Endpoint was updated, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         * @param timeModified the value to set
         * @return this builder
         **/
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /**
         * A prefix to use for the private endpoint. The customer VCN's DNS records are
         * updated with this prefix. The prefix input from the customer will be the first sub-domain in the endpointFqdn.
         * Example: If the prefix chosen is "abc", then the endpointFqdn will be 'abc.private.objectstorage.<region>.oraclecloud.com'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * A prefix to use for the private endpoint. The customer VCN's DNS records are
         * updated with this prefix. The prefix input from the customer will be the first sub-domain in the endpointFqdn.
         * Example: If the prefix chosen is "abc", then the endpointFqdn will be 'abc.private.objectstorage.<region>.oraclecloud.com'
         *
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fqdns")
        private Fqdns fqdns;

        public Builder fqdns(Fqdns fqdns) {
            this.fqdns = fqdns;
            this.__explicitlySet__.add("fqdns");
            return this;
        }
        /**
         * The entity tag for the Private Endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        /**
         * The entity tag for the Private Endpoint.
         * @param etag the value to set
         * @return this builder
         **/
        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }
        /**
         * The summaries of Private Endpoints' lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private PrivateEndpoint.LifecycleState lifecycleState;

        /**
         * The summaries of Private Endpoints' lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(PrivateEndpoint.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateEndpointSummary build() {
            PrivateEndpointSummary model =
                    new PrivateEndpointSummary(
                            this.name,
                            this.namespace,
                            this.compartmentId,
                            this.createdBy,
                            this.timeCreated,
                            this.timeModified,
                            this.prefix,
                            this.fqdns,
                            this.etag,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateEndpointSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("fqdns")) {
                this.fqdns(model.getFqdns());
            }
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The name given to the Private Endpoint. Avoid entering confidential information.
     * Example: my-new-pe1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name given to the Private Endpoint. Avoid entering confidential information.
     * Example: my-new-pe1
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The Object Storage namespace with which the Private Endpoint is associated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace with which the Private Endpoint is associated.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * The compartment ID in which the Private Endpoint is authorized.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment ID in which the Private Endpoint is authorized.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the Private Endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the Private Endpoint.
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The date and time the Private Endpoint was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Private Endpoint was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Private Endpoint was updated, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The date and time the Private Endpoint was updated, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     * @return the value
     **/
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /**
     * A prefix to use for the private endpoint. The customer VCN's DNS records are
     * updated with this prefix. The prefix input from the customer will be the first sub-domain in the endpointFqdn.
     * Example: If the prefix chosen is "abc", then the endpointFqdn will be 'abc.private.objectstorage.<region>.oraclecloud.com'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * A prefix to use for the private endpoint. The customer VCN's DNS records are
     * updated with this prefix. The prefix input from the customer will be the first sub-domain in the endpointFqdn.
     * Example: If the prefix chosen is "abc", then the endpointFqdn will be 'abc.private.objectstorage.<region>.oraclecloud.com'
     *
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fqdns")
    private final Fqdns fqdns;

    public Fqdns getFqdns() {
        return fqdns;
    }

    /**
     * The entity tag for the Private Endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    /**
     * The entity tag for the Private Endpoint.
     * @return the value
     **/
    public String getEtag() {
        return etag;
    }

    /**
     * The summaries of Private Endpoints' lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final PrivateEndpoint.LifecycleState lifecycleState;

    /**
     * The summaries of Private Endpoints' lifecycle state.
     * @return the value
     **/
    public PrivateEndpoint.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("PrivateEndpointSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", fqdns=").append(String.valueOf(this.fqdns));
        sb.append(", etag=").append(String.valueOf(this.etag));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateEndpointSummary)) {
            return false;
        }

        PrivateEndpointSummary other = (PrivateEndpointSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.fqdns, other.fqdns)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.fqdns == null ? 43 : this.fqdns.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
