/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Details about the Oracle Cloud Infrastructure Classic account, the source environment from which you want to migrate the application.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OcicSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OcicSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle Cloud Infrastructure - Classic region from which you want to migrate your applications. For example, uscom-east-1 or uscom-central-1.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The Oracle Cloud Infrastructure - Classic region from which you want to migrate your applications. For example, uscom-east-1 or uscom-central-1.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * If you are using an Oracle Cloud Infrastructure - Classic account with Identity Cloud Service (IDCS), enter the service instance ID.
         * For example, if Compute-567890123 is the account name of your Oracle Cloud Infrastructure Classic Compute service entitlement,
         * then enter 567890123.
         * <p>
         * If you are using a traditional Oracle Cloud Infrastructure - Classic account, enter your identity domain ID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeAccount")
        private String computeAccount;

        /**
         * If you are using an Oracle Cloud Infrastructure - Classic account with Identity Cloud Service (IDCS), enter the service instance ID.
         * For example, if Compute-567890123 is the account name of your Oracle Cloud Infrastructure Classic Compute service entitlement,
         * then enter 567890123.
         * <p>
         * If you are using a traditional Oracle Cloud Infrastructure - Classic account, enter your identity domain ID.
         *
         * @param computeAccount the value to set
         * @return this builder
         **/
        public Builder computeAccount(String computeAccount) {
            this.computeAccount = computeAccount;
            this.__explicitlySet__.add("computeAccount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OcicSourceDetails build() {
            OcicSourceDetails model = new OcicSourceDetails(this.region, this.computeAccount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OcicSourceDetails model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("computeAccount")) {
                this.computeAccount(model.getComputeAccount());
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
    public OcicSourceDetails(String region, String computeAccount) {
        super();
        this.region = region;
        this.computeAccount = computeAccount;
    }

    /**
     * The Oracle Cloud Infrastructure - Classic region from which you want to migrate your applications. For example, uscom-east-1 or uscom-central-1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The Oracle Cloud Infrastructure - Classic region from which you want to migrate your applications. For example, uscom-east-1 or uscom-central-1.
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * If you are using an Oracle Cloud Infrastructure - Classic account with Identity Cloud Service (IDCS), enter the service instance ID.
     * For example, if Compute-567890123 is the account name of your Oracle Cloud Infrastructure Classic Compute service entitlement,
     * then enter 567890123.
     * <p>
     * If you are using a traditional Oracle Cloud Infrastructure - Classic account, enter your identity domain ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAccount")
    private final String computeAccount;

    /**
     * If you are using an Oracle Cloud Infrastructure - Classic account with Identity Cloud Service (IDCS), enter the service instance ID.
     * For example, if Compute-567890123 is the account name of your Oracle Cloud Infrastructure Classic Compute service entitlement,
     * then enter 567890123.
     * <p>
     * If you are using a traditional Oracle Cloud Infrastructure - Classic account, enter your identity domain ID.
     *
     * @return the value
     **/
    public String getComputeAccount() {
        return computeAccount;
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
        sb.append("OcicSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", computeAccount=").append(String.valueOf(this.computeAccount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OcicSourceDetails)) {
            return false;
        }

        OcicSourceDetails other = (OcicSourceDetails) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.computeAccount, other.computeAccount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.computeAccount == null ? 43 : this.computeAccount.hashCode());
        return result;
    }
}
