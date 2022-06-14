/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to HCX Advanced.
 * Downgrading from HCX Enterprise to HCX Advanced reduces the number of provided license keys from 10 to 3.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DowngradeHcxDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DowngradeHcxDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"reservingHcxOnPremiseLicenseKeys"})
    public DowngradeHcxDetails(java.util.List<String> reservingHcxOnPremiseLicenseKeys) {
        super();
        this.reservingHcxOnPremiseLicenseKeys = reservingHcxOnPremiseLicenseKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to HCX Advanced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reservingHcxOnPremiseLicenseKeys")
        private java.util.List<String> reservingHcxOnPremiseLicenseKeys;

        /**
         * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to HCX Advanced.
         *
         * @param reservingHcxOnPremiseLicenseKeys the value to set
         * @return this builder
         **/
        public Builder reservingHcxOnPremiseLicenseKeys(
                java.util.List<String> reservingHcxOnPremiseLicenseKeys) {
            this.reservingHcxOnPremiseLicenseKeys = reservingHcxOnPremiseLicenseKeys;
            this.__explicitlySet__.add("reservingHcxOnPremiseLicenseKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DowngradeHcxDetails build() {
            DowngradeHcxDetails __instance__ =
                    new DowngradeHcxDetails(reservingHcxOnPremiseLicenseKeys);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DowngradeHcxDetails o) {
            Builder copiedBuilder =
                    reservingHcxOnPremiseLicenseKeys(o.getReservingHcxOnPremiseLicenseKeys());

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
     * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to HCX Advanced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservingHcxOnPremiseLicenseKeys")
    private final java.util.List<String> reservingHcxOnPremiseLicenseKeys;

    /**
     * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to HCX Advanced.
     *
     * @return the value
     **/
    public java.util.List<String> getReservingHcxOnPremiseLicenseKeys() {
        return reservingHcxOnPremiseLicenseKeys;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DowngradeHcxDetails(");
        sb.append("reservingHcxOnPremiseLicenseKeys=")
                .append(String.valueOf(this.reservingHcxOnPremiseLicenseKeys));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DowngradeHcxDetails)) {
            return false;
        }

        DowngradeHcxDetails other = (DowngradeHcxDetails) o;
        return java.util.Objects.equals(
                        this.reservingHcxOnPremiseLicenseKeys,
                        other.reservingHcxOnPremiseLicenseKeys)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.reservingHcxOnPremiseLicenseKeys == null
                                ? 43
                                : this.reservingHcxOnPremiseLicenseKeys.hashCode());
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
