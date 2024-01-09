/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to HCX
 * Advanced. Downgrading from HCX Enterprise to HCX Advanced reduces the number of provided license
 * keys from 10 to 3. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DowngradeHcxDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DowngradeHcxDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reservingHcxOnPremiseLicenseKeys"})
    public DowngradeHcxDetails(java.util.List<String> reservingHcxOnPremiseLicenseKeys) {
        super();
        this.reservingHcxOnPremiseLicenseKeys = reservingHcxOnPremiseLicenseKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to
         * HCX Advanced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reservingHcxOnPremiseLicenseKeys")
        private java.util.List<String> reservingHcxOnPremiseLicenseKeys;

        /**
         * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to
         * HCX Advanced.
         *
         * @param reservingHcxOnPremiseLicenseKeys the value to set
         * @return this builder
         */
        public Builder reservingHcxOnPremiseLicenseKeys(
                java.util.List<String> reservingHcxOnPremiseLicenseKeys) {
            this.reservingHcxOnPremiseLicenseKeys = reservingHcxOnPremiseLicenseKeys;
            this.__explicitlySet__.add("reservingHcxOnPremiseLicenseKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DowngradeHcxDetails build() {
            DowngradeHcxDetails model =
                    new DowngradeHcxDetails(this.reservingHcxOnPremiseLicenseKeys);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DowngradeHcxDetails model) {
            if (model.wasPropertyExplicitlySet("reservingHcxOnPremiseLicenseKeys")) {
                this.reservingHcxOnPremiseLicenseKeys(model.getReservingHcxOnPremiseLicenseKeys());
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

    /**
     * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to HCX
     * Advanced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reservingHcxOnPremiseLicenseKeys")
    private final java.util.List<String> reservingHcxOnPremiseLicenseKeys;

    /**
     * The HCX on-premise license keys to be reserved when downgrading from HCX Enterprise to HCX
     * Advanced.
     *
     * @return the value
     */
    public java.util.List<String> getReservingHcxOnPremiseLicenseKeys() {
        return reservingHcxOnPremiseLicenseKeys;
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
        sb.append("DowngradeHcxDetails(");
        sb.append("super=").append(super.toString());
        sb.append("reservingHcxOnPremiseLicenseKeys=")
                .append(String.valueOf(this.reservingHcxOnPremiseLicenseKeys));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
