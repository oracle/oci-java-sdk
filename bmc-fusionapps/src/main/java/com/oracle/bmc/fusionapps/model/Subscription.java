/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Subscription information for compartmentId. Only root compartments are allowed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subscription.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Subscription extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "classicSubscriptionId", "serviceName", "skus"})
    public Subscription(
            String id,
            String classicSubscriptionId,
            String serviceName,
            java.util.List<SubscriptionSku> skus) {
        super();
        this.id = id;
        this.classicSubscriptionId = classicSubscriptionId;
        this.serviceName = serviceName;
        this.skus = skus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the subscription details for particular root compartment or tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the subscription details for particular root compartment or tenancy.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Subscription id. */
        @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
        private String classicSubscriptionId;

        /**
         * Subscription id.
         *
         * @param classicSubscriptionId the value to set
         * @return this builder
         */
        public Builder classicSubscriptionId(String classicSubscriptionId) {
            this.classicSubscriptionId = classicSubscriptionId;
            this.__explicitlySet__.add("classicSubscriptionId");
            return this;
        }
        /** The type of subscription, such as 'CLOUDCM'/'SAAS'/'CRM', etc. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The type of subscription, such as 'CLOUDCM'/'SAAS'/'CRM', etc.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** Stock keeping unit. */
        @com.fasterxml.jackson.annotation.JsonProperty("skus")
        private java.util.List<SubscriptionSku> skus;

        /**
         * Stock keeping unit.
         *
         * @param skus the value to set
         * @return this builder
         */
        public Builder skus(java.util.List<SubscriptionSku> skus) {
            this.skus = skus;
            this.__explicitlySet__.add("skus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Subscription build() {
            Subscription model =
                    new Subscription(
                            this.id, this.classicSubscriptionId, this.serviceName, this.skus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Subscription model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("classicSubscriptionId")) {
                this.classicSubscriptionId(model.getClassicSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("skus")) {
                this.skus(model.getSkus());
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

    /** OCID of the subscription details for particular root compartment or tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the subscription details for particular root compartment or tenancy.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Subscription id. */
    @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
    private final String classicSubscriptionId;

    /**
     * Subscription id.
     *
     * @return the value
     */
    public String getClassicSubscriptionId() {
        return classicSubscriptionId;
    }

    /** The type of subscription, such as 'CLOUDCM'/'SAAS'/'CRM', etc. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The type of subscription, such as 'CLOUDCM'/'SAAS'/'CRM', etc.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Stock keeping unit. */
    @com.fasterxml.jackson.annotation.JsonProperty("skus")
    private final java.util.List<SubscriptionSku> skus;

    /**
     * Stock keeping unit.
     *
     * @return the value
     */
    public java.util.List<SubscriptionSku> getSkus() {
        return skus;
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
        sb.append("Subscription(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", classicSubscriptionId=").append(String.valueOf(this.classicSubscriptionId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", skus=").append(String.valueOf(this.skus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Subscription)) {
            return false;
        }

        Subscription other = (Subscription) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.classicSubscriptionId, other.classicSubscriptionId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.skus, other.skus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.classicSubscriptionId == null
                                ? 43
                                : this.classicSubscriptionId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.skus == null ? 43 : this.skus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
