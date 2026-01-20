/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * The resource quota balance details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceQuotumSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceQuotumSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "isAllowed",
        "limit",
        "balance",
        "isOverage",
        "purchasedLimit",
        "service",
        "isDependency",
        "affectedResource"
    })
    public ResourceQuotumSummary(
            String name,
            Boolean isAllowed,
            Double limit,
            Double balance,
            Boolean isOverage,
            Double purchasedLimit,
            String service,
            Boolean isDependency,
            String affectedResource) {
        super();
        this.name = name;
        this.isAllowed = isAllowed;
        this.limit = limit;
        this.balance = balance;
        this.isOverage = isOverage;
        this.purchasedLimit = purchasedLimit;
        this.service = service;
        this.isDependency = isDependency;
        this.affectedResource = affectedResource;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The resource name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Used to indicate if further quota consumption isAllowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAllowed")
        private Boolean isAllowed;

        /**
         * Used to indicate if further quota consumption isAllowed.
         *
         * @param isAllowed the value to set
         * @return this builder
         */
        public Builder isAllowed(Boolean isAllowed) {
            this.isAllowed = isAllowed;
            this.__explicitlySet__.add("isAllowed");
            return this;
        }
        /** The quota limit. */
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        private Double limit;

        /**
         * The quota limit.
         *
         * @param limit the value to set
         * @return this builder
         */
        public Builder limit(Double limit) {
            this.limit = limit;
            this.__explicitlySet__.add("limit");
            return this;
        }
        /** The quota balance. */
        @com.fasterxml.jackson.annotation.JsonProperty("balance")
        private Double balance;

        /**
         * The quota balance.
         *
         * @param balance the value to set
         * @return this builder
         */
        public Builder balance(Double balance) {
            this.balance = balance;
            this.__explicitlySet__.add("balance");
            return this;
        }
        /** Used to indicate if overages are incurred. */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverage")
        private Boolean isOverage;

        /**
         * Used to indicate if overages are incurred.
         *
         * @param isOverage the value to set
         * @return this builder
         */
        public Builder isOverage(Boolean isOverage) {
            this.isOverage = isOverage;
            this.__explicitlySet__.add("isOverage");
            return this;
        }
        /** The purchased quota limit. */
        @com.fasterxml.jackson.annotation.JsonProperty("purchasedLimit")
        private Double purchasedLimit;

        /**
         * The purchased quota limit.
         *
         * @param purchasedLimit the value to set
         * @return this builder
         */
        public Builder purchasedLimit(Double purchasedLimit) {
            this.purchasedLimit = purchasedLimit;
            this.__explicitlySet__.add("purchasedLimit");
            return this;
        }
        /** The service name. */
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * The service name.
         *
         * @param service the value to set
         * @return this builder
         */
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /** Used to indicate any resource dependencies. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDependency")
        private Boolean isDependency;

        /**
         * Used to indicate any resource dependencies.
         *
         * @param isDependency the value to set
         * @return this builder
         */
        public Builder isDependency(Boolean isDependency) {
            this.isDependency = isDependency;
            this.__explicitlySet__.add("isDependency");
            return this;
        }
        /** The affected resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("affectedResource")
        private String affectedResource;

        /**
         * The affected resource name.
         *
         * @param affectedResource the value to set
         * @return this builder
         */
        public Builder affectedResource(String affectedResource) {
            this.affectedResource = affectedResource;
            this.__explicitlySet__.add("affectedResource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceQuotumSummary build() {
            ResourceQuotumSummary model =
                    new ResourceQuotumSummary(
                            this.name,
                            this.isAllowed,
                            this.limit,
                            this.balance,
                            this.isOverage,
                            this.purchasedLimit,
                            this.service,
                            this.isDependency,
                            this.affectedResource);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceQuotumSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isAllowed")) {
                this.isAllowed(model.getIsAllowed());
            }
            if (model.wasPropertyExplicitlySet("limit")) {
                this.limit(model.getLimit());
            }
            if (model.wasPropertyExplicitlySet("balance")) {
                this.balance(model.getBalance());
            }
            if (model.wasPropertyExplicitlySet("isOverage")) {
                this.isOverage(model.getIsOverage());
            }
            if (model.wasPropertyExplicitlySet("purchasedLimit")) {
                this.purchasedLimit(model.getPurchasedLimit());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("isDependency")) {
                this.isDependency(model.getIsDependency());
            }
            if (model.wasPropertyExplicitlySet("affectedResource")) {
                this.affectedResource(model.getAffectedResource());
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

    /** The resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The resource name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Used to indicate if further quota consumption isAllowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowed")
    private final Boolean isAllowed;

    /**
     * Used to indicate if further quota consumption isAllowed.
     *
     * @return the value
     */
    public Boolean getIsAllowed() {
        return isAllowed;
    }

    /** The quota limit. */
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Double limit;

    /**
     * The quota limit.
     *
     * @return the value
     */
    public Double getLimit() {
        return limit;
    }

    /** The quota balance. */
    @com.fasterxml.jackson.annotation.JsonProperty("balance")
    private final Double balance;

    /**
     * The quota balance.
     *
     * @return the value
     */
    public Double getBalance() {
        return balance;
    }

    /** Used to indicate if overages are incurred. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverage")
    private final Boolean isOverage;

    /**
     * Used to indicate if overages are incurred.
     *
     * @return the value
     */
    public Boolean getIsOverage() {
        return isOverage;
    }

    /** The purchased quota limit. */
    @com.fasterxml.jackson.annotation.JsonProperty("purchasedLimit")
    private final Double purchasedLimit;

    /**
     * The purchased quota limit.
     *
     * @return the value
     */
    public Double getPurchasedLimit() {
        return purchasedLimit;
    }

    /** The service name. */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * The service name.
     *
     * @return the value
     */
    public String getService() {
        return service;
    }

    /** Used to indicate any resource dependencies. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDependency")
    private final Boolean isDependency;

    /**
     * Used to indicate any resource dependencies.
     *
     * @return the value
     */
    public Boolean getIsDependency() {
        return isDependency;
    }

    /** The affected resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("affectedResource")
    private final String affectedResource;

    /**
     * The affected resource name.
     *
     * @return the value
     */
    public String getAffectedResource() {
        return affectedResource;
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
        sb.append("ResourceQuotumSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isAllowed=").append(String.valueOf(this.isAllowed));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(", balance=").append(String.valueOf(this.balance));
        sb.append(", isOverage=").append(String.valueOf(this.isOverage));
        sb.append(", purchasedLimit=").append(String.valueOf(this.purchasedLimit));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", isDependency=").append(String.valueOf(this.isDependency));
        sb.append(", affectedResource=").append(String.valueOf(this.affectedResource));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceQuotumSummary)) {
            return false;
        }

        ResourceQuotumSummary other = (ResourceQuotumSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isAllowed, other.isAllowed)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.balance, other.balance)
                && java.util.Objects.equals(this.isOverage, other.isOverage)
                && java.util.Objects.equals(this.purchasedLimit, other.purchasedLimit)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.isDependency, other.isDependency)
                && java.util.Objects.equals(this.affectedResource, other.affectedResource)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isAllowed == null ? 43 : this.isAllowed.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.balance == null ? 43 : this.balance.hashCode());
        result = (result * PRIME) + (this.isOverage == null ? 43 : this.isOverage.hashCode());
        result =
                (result * PRIME)
                        + (this.purchasedLimit == null ? 43 : this.purchasedLimit.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.isDependency == null ? 43 : this.isDependency.hashCode());
        result =
                (result * PRIME)
                        + (this.affectedResource == null ? 43 : this.affectedResource.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
